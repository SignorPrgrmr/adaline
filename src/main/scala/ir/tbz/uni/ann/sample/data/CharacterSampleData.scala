package ir.tbz.uni.ann.sample.data

case class CharacterSampleData(character: Array[Array[Double]], target: Double)

object CharacterSampleData {

	lazy val sampleData: Array[CharacterSampleData] = createSampleData

	private def createSampleData: Array[CharacterSampleData] =
		Array[CharacterSampleData](
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 0, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 0, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 0, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 0, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 1, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 0, 1, 0, 0),
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](0, 1, 1, 0, 0),
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 0),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 0, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 0, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 0, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 0, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 1, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 1, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 1)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](1, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 1, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 1, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 1, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 1, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 1, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 1, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Double]](
					Array[Double](0, 1, 1, 1, 0),
					Array[Double](1, 0, 1, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](1, 0, 0, 0, 1),
					Array[Double](0, 1, 1, 1, 0)
				),
				-1
			)
		)

}
