package ir.tbz.uni.ann.app

import ir.tbz.uni.ann.app.CharacterRecognition.{bias, frontData, inputNeurons, outputNeuron, range, stage}
import ir.tbz.uni.ann.core.{Bias, InputNeuron, NeuralNetworkInput, OutputNeuron}
import ir.tbz.uni.ann.sample.data.MultiOutputCharacterSampleData
import scalafx.application.JFXApp3
import scalafx.scene.{Node, Scene}
import scalafx.scene.control.Button
import scalafx.scene.layout.AnchorPane
import scalafx.scene.paint.Color
import scalafx.scene.paint.Color.rgb
import scalafx.scene.shape.Rectangle

import scala.annotation.tailrec
import scala.collection.mutable
import scala.io.StdIn.readLine

object MultiOutputCharacterRecognition extends JFXApp3 {

	private val range = 0 until 5
	private val outputNeurons = for _ <- 1 to 2 yield OutputNeuron(26)
	private val inputNeurons = new Array[Array[NeuralNetworkInput]](5)

	for
		i <- range
	do
		val inputNeurons = new Array[NeuralNetworkInput](5)
		for
			j <- range
		do
			inputNeurons(j) = InputNeuron(mutable.Map(outputNeurons.map(_ -> 0): _*))

		this.inputNeurons(i) = inputNeurons

	private val bias = Bias(mutable.Map(outputNeurons.map(_ -> 0): _*))
	private val data = MultiOutputCharacterSampleData.data
	private final val ALPHA = 0.1
	private final val MIN_CHANGE = 0.06

	@tailrec
	private def trainNeuralNetwork(): Unit =
		var isChanged = false
		for
			MultiOutputCharacterSampleData(character, targets) <- data
		do
			for
				i <- range
				j <- range
			do
				inputNeurons(i)(j) put character(i)(j)
			bias.sendSignal()
			val results = outputNeurons.map(_.neuron).map(OutputNeuron.getOutput)
			for
				i <- range
				j <- range
			do
				val deltas = targets.zip(results)
						.map(zippedData => zippedData._1 - zippedData._2)
						.map(_ * ALPHA * character(i)(j))
				if deltas.exists(Math.abs(_) > MIN_CHANGE) then
					isChanged = true
					println(deltas.mkString(", "))
					inputNeurons(i)(j).neuron.updateWeights(
						outputNeurons.zip(deltas)
								.filter(tuple => Math.abs(tuple._2) > MIN_CHANGE).toMap

					)
			val deltas = targets.zip(results)
					.map(zippedData => zippedData._1 - zippedData._2)
					.map(_ * ALPHA)
			if deltas.exists(Math.abs(_) > MIN_CHANGE) then
				isChanged = true
				println(deltas.mkString(", "))
				bias.updateBiases(
					outputNeurons.zip(deltas)
							.filter(tuple => Math.abs(tuple._2) > MIN_CHANGE).toMap
				)

		readLine()
		if isChanged then trainNeuralNetwork()

	trainNeuralNetwork()
	println("Trained!!")

	private val frontData = Array[Array[Boolean]](
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false)
	)

	override def start(): Unit =
		stage = new JFXApp3.PrimaryStage {
			title = "ScalaFX hello World"
			scene = new Scene {
				content = Seq(new AnchorPane {
					val on: Color = rgb(220, 220, 220)
					val off: Color = rgb(160, 160, 160)
					val cells: Seq[Node] =
						for
							i <- 0 until 5
							j <- 0 until 5
						yield
							new Rectangle {
								layoutX = 23 + i * 91
								layoutY = 23 + j * 91
								width = 90
								height = 90
								fill = off
								onMouseClicked = { event =>
									if frontData(i)(j) then {
										fill = off
										frontData(i)(j) = false
									} else {
										fill = on
										frontData(i)(j) = true
									}
								}
							}

					children = cells
					prefWidth = 500
					prefHeight = 500
				},
					new Button {
						text = "Check"
						onMouseClicked = { _ =>
							for
								i <- range
								j <- range
							do
								inputNeurons(i)(j).put(if frontData(i)(j) then 1 else 0)
							bias.sendSignal()
							val result =
								outputNeurons.map(_.neuron)
										.map(OutputNeuron.getOutput)
										.map(threshold)
										.mkString("[", ", ", "]")
							println(result)
						}
						layoutX = 420
						layoutY = 500
					}
				)
			}
			width = 500
			height = 600
		}

	private def threshold(result: Double): Byte = if result < 0 then -1 else 1

}
