package masyu

import maysu.Line
import org.scalatest.{Matchers, WordSpec}

class LineSpec extends WordSpec with Matchers {

  "A Line" should {
    "be able to be constructed horizontally and vertically" in {
      noException should be thrownBy Line(start = (0, 0), end = (0, 1))
    }

    "not be able to be constructed diagonally" in {
      an [IllegalArgumentException] should be thrownBy Line(start = (0, 0), end = (1, 1))
    }
  }

}
