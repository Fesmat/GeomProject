fun main(args: Array<String>) {

    var vertices_tri: Array<point> = arrayOf(point(0.0, 0.0), point(0.0, 1.0), point(1.0, 0.0))
    var triangle = Triangle(vertices_tri)
    println("Our triangle's area is ${triangle.area()}")

    var vertices_qua: Array<point> = arrayOf(point(0.0, 0.0), point(1.0, 1.0))
    var rectangle = Rectangle(vertices_qua)
    println("Our rectangle's area is ${rectangle.area()}")
}