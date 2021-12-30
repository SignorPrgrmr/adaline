package ir.tbz.uni.ann.core

class OutputNeuron extends Neuron :

	private var output: Option[Double] = None

	override def sendSignal(netInput: Double): Unit = output = Some(netInput)

	override def updateWeights(deltas: Map[NeuralNetworkInput, Double]): Unit = ()

object OutputNeuron:

	def getOutput(neuron: Neuron): Double =
		neuron match {
			case outputNeuron: OutputNeuron =>
				outputNeuron.output match {
					case None => throw new RuntimeException("There is no result set for this output neuron." +
						" Please check the count of inputs and the signals sent for this neuron.")
					case Some(result) => result
				}

			case _ => throw new RuntimeException("Invalid type for neuron. Please give an output neuron as parameter.")
		}

	def apply(inputCount: Int): NeuralNetworkInput = NeuralNetworkInput(new OutputNeuron(), inputCount)

