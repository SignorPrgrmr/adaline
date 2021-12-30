package ir.tbz.uni.ann.core

trait Neuron {

	def sendSignal(netInput: Double): Unit
	def updateWeights(deltas: Map[NeuralNetworkInput, Double]): Unit

}
