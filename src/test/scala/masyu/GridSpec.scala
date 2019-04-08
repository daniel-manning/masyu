package masyu

import maysu.{Black, Grid, White}
import org.scalatest.{Matchers, WordSpec}

class GridSpec extends WordSpec with Matchers{

  "A Grid" should {
    "be able to be created" in {
      noException should be thrownBy Grid(6, List((Black, (0,0)), (White, (1,1))))
    }
  }

}
