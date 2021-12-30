package ir.tbz.uni.ann.sample.data

case class AndOrSampleData(x1: Byte, x2: Byte, y: Byte)

object AndOrSampleData:
	
	lazy val andSampleData: List[AndOrSampleData] = createAndSampleData
	lazy val orSampleData: List[AndOrSampleData] = createOrSampleData

	private def createAndSampleData: List[AndOrSampleData] =
		List(
			AndOrSampleData(1, 1, 1),
			AndOrSampleData(1, 0, -1),
			AndOrSampleData(0, 1, -1),
			AndOrSampleData(0, 0, -1)
		)
		
	private def createOrSampleData: List[AndOrSampleData] =
		List(
			AndOrSampleData(1, 1, 1),
			AndOrSampleData(1, 0, 1),
			AndOrSampleData(0, 1, 1),
			AndOrSampleData(0, 0, -1)
		)
