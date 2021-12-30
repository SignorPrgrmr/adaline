package ir.tbz.uni.ann.core

import scala.collection.mutable

class InputNeuron(private val nextLayer: mutable.Map[NeuralNetworkInput, Double]) extends Neuron :
	
	override def sendSignal(netInput: Double): Unit =
		for (nni, w) <- nextLayer do nni put netInput * w

	override def updateWeights(deltas: Map[NeuralNetworkInput, Double]): Unit =
		for nni <- deltas.keys do
			nextLayer get nni match {
				case None => throw new RuntimeException("Not valid input for delta!!")
				case Some(w) =>
					val delta = deltas(nni)
					nextLayer += (nni -> (w + delta))
			}

object InputNeuron:
	
	def apply(nextLayer: mutable.Map[NeuralNetworkInput, Double]): NeuralNetworkInput = 
		NeuralNetworkInput(new InputNeuron(nextLayer), 1)