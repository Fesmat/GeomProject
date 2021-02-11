fun main(args: Array<String>) {

    var i:Int = 0

    var our_vertices: Array<point> = arrayOf(point(0.0, 0.0), point(0.0, 1.0), point(1.0,0.0))
    var our_triangle:Triangle = Triangle(our_vertices)

    println("Our triangle's area is ${our_triangle.Area()}")
}