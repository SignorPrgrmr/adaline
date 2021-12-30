package ir.tbz.uni.ann.sample.data

case class MultiOutputCharacterSampleData(character: Array[Array[Int]], targets: List[Double])

object MultiOutputCharacterSampleData {

    lazy val data: List[MultiOutputCharacterSampleData] = createSampleData

    private def createSampleData: List[MultiOutputCharacterSampleData] =
        List[MultiOutputCharacterSampleData](
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 0, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 0, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 0, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 0, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 0)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 0, 0, 0)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 0)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 0)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 1, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 0, 1, 0, 0),
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](0, 1, 1, 0, 0),
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1)
                ),
                List(1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 0),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 0, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 0, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 0, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 0, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 1, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 1, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 1)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 1, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 1, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 1, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 1, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 1, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 1, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 1, 1, 1, 0),
                    Array[Int](1, 0, 1, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](1, 0, 0, 0, 1),
                    Array[Int](0, 1, 1, 1, 0)
                ),
                List(-1, 1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](1, 1, 1, 1, 1),
                    Array[Int](1, 1, 1, 1, 1),
                    Array[Int](1, 1, 1, 1, 1),
                    Array[Int](1, 1, 1, 1, 1),
                    Array[Int](1, 1, 1, 1, 1)
                ),
                List(-1, -1)
            ),
            MultiOutputCharacterSampleData(
                Array[Array[Int]](
                    Array[Int](0, 0, 0, 0, 0),
                    Array[Int](0, 0, 0, 0, 0),
                    Array[Int](0, 0, 0, 0, 0),
                    Array[Int](0, 0, 0, 0, 0),
                    Array[Int](0, 0, 0, 0, 0)
                ),
                List(-1, -1)
            )
        )

}
