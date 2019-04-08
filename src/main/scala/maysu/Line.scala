package maysu

case class Line(start:Point, end:Point){
  //Lines must be horizontal or vertical
  require((start._1 == end._1) || (start._2 == end._2))

}


