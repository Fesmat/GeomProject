class point(var x: Double, var y: Double) {}

open class Figure() {}

open class FigureWithVertices : Figure {

    var vertices: Array<point>

    constructor(vertices_in: Array<point>) : super() {
        vertices = vertices_in
    }

}