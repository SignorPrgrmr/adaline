package ir.tbz.uni.ann.app

import ir.tbz.uni.ann.core.{Bias, InputNeuron, NeuralNetworkInput, OutputNeuron}
import ir.tbz.uni.ann.sample.data.CharacterSampleData
import scalafx.application.JFXApp3
import scalafx.scene.control.Button
import scalafx.scene.layout.AnchorPane
import scalafx.scene.paint.Color
import scalafx.scene.paint.Color.rgb
import scalafx.scene.shape.Rectangle
import scalafx.scene.{Node, Scene}

import scala.annotation.tailrec
import scala.collection.mutable
import scala.io.StdIn.readLine

object CharacterRecognition extends JFXApp3 {

	private val outputNeuron = OutputNeuron(26)
	private val inputNeurons = new Array[Array[NeuralNetworkInput]](5)
	private val range = 0 until 5
	for
		i <- range
	do
		val inputNeurons = new Array[NeuralNetworkInput](5)

		for
			j <- range
		do
			inputNeurons(j) = InputNeuron(mutable.Map(outputNeuron -> 0))

		CharacterRecognition.inputNeurons(i) = inputNeurons

	private val bias = Bias(mutable.Map(outputNeuron -> 0))
	private val data = CharacterSampleData.sampleData
	private val ALPHA = 0.1
	private final val MIN_CHANGES = 0.01

	@tailrec
	private def trainNeuralNetwork(): Unit = {
		var isChanged = false
		for
			CharacterSampleData(character, target) <- data
		do
			for
				i <- range
				j <- range
			do
				inputNeurons(i)(j) put character(i)(j)
			bias.sendSignal()
			val result = OutputNeuron.getOutput(outputNeuron.neuron)
			for
				i <- range
				j <- range
			do
				val delta = character(i)(j) * ALPHA * (target - result)
				if Math.abs(delta) > MIN_CHANGES then
					isChanged = true
					println("Delta: " + delta)
					inputNeurons(i)(j).neuron updateWeights Map(outputNeuron -> delta)
			val delta = ALPHA * (target - result)
			if (Math.abs(delta) > MIN_CHANGES)
				isChanged = true
				println("Delta: " + delta)
				bias updateBiases Map(outputNeuron -> delta)

		readLine()
		if isChanged then trainNeuralNetwork()
	}

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
							val output = OutputNeuron.getOutput(outputNeuron.neuron)
							val result = threshold(output)
							println("output: " + (if result == 1 then "X" else "O"))
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
