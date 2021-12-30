package ir.tbz.uni.ann.app

import ir.tbz.uni.ann.core.{Bias, InputNeuron, OutputNeuron}
import ir.tbz.uni.ann.sample.data.AndOrSampleData

import scala.annotation.tailrec
import scala.collection.mutable

object AndNeuralNetwork extends App {

	private val outputNeuron = OutputNeuron(3)
	private val inputNeuron1 = InputNeuron(mutable.Map(outputNeuron -> 0))
	private val inputNeuron2 = InputNeuron(mutable.Map(outputNeuron -> 0))
	private val bias = Bias(mutable.Map(outputNeuron -> 0))
	private val data = AndOrSampleData.andSampleData
	private final val ALPHA = 0.1
	private final val MIN_CHANGE = 0.06

	@tailrec
	def trainNeuralNetwork(): Unit =
		var isChanged = false
		for AndOrSampleData(x1, x2, y) <- data do
			inputNeuron1 put x1
			inputNeuron2 put x2
			bias.sendSignal()
			val output = OutputNeuron getOutput outputNeuron.neuron
			if output != y then
				val delta1 = x1 * ALPHA * (y - output)
				inputNeuron1.neuron updateWeights Map(outputNeuron -> delta1)
				val delta2 = x2 * ALPHA * (y - output)
				inputNeuron2.neuron updateWeights Map(outputNeuron -> delta2)
				val deltaB = ALPHA * (y - output)
				bias updateBiases Map(outputNeuron -> deltaB)
				println(s"$delta1 $delta2 $deltaB")
				if (Math.abs(delta1) > MIN_CHANGE || Math.abs(delta2) > MIN_CHANGE || Math.abs(deltaB) > MIN_CHANGE) isChanged = true
		if isChanged then trainNeuralNetwork()

	trainNeuralNetwork()
	println("Trained!!")

	@tailrec
	def readInput(text: String): String =
		import scala.io.StdIn.readLine
		print(text)
		val input = readLine
		if input.equals("1") || input.equals("-1") then input
		else
			println("Invalid input!")
			readInput(text)

	@tailrec
	def interactWithUser(): Unit =
		inputNeuron1 put readInput("x1: ").toInt
		inputNeuron2 put readInput("x2: ").toInt
		bias.sendSignal()
		val output = OutputNeuron getOutput outputNeuron.neuron
		println("output: " + threshold(output))
		interactWithUser()

	interactWithUser()

	private def threshold(result: Double): Int = if result < 0 then -1 else 1

}
