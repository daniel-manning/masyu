package maysu

sealed trait Circle
case object Black extends Circle
case object White extends Circle

case class Grid(size:Int, circles:List[(Circle, Point)])
