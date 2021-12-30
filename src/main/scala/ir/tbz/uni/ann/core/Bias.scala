package ir.tbz.uni.ann.core

import scala.collection.mutable

class Bias(private val nextLayer: mutable.Map[NeuralNetworkInput, Double]) :
	
	def sendSignal(): Unit =
		for (nni, b) <- nextLayer do nni put b
		
	def updateBiases(deltas: Map[NeuralNetworkInput, Double]): Unit =
		for nni <- deltas.keys do
			nextLayer get nni match {
				case None => throw new RuntimeException("Invalid input as biases!!")
				case Some(b) => 
					val delta = deltas(nni)
					nextLayer += (nni -> (b + delta))
			}
