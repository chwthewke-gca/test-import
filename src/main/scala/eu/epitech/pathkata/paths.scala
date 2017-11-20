package eu.epitech.pathkata

case class Point( x: Int, y: Int )

case class Segment( origin: Point, destination: Point )

case class Path( segments: List[Point] )

case class PathList( paths: List[Path] )
