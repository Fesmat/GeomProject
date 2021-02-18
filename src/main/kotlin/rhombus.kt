import kotlin.math.abs

class Rhombus: FigureWithVertices {
    constructor(coord_in: Array<point>): super(coord_in) {
        if (coord_in.size == 4) vertices = coord_in
        else println("Не-а, это ж ромб")
    }

    fun area(): Double {
        return  2 * (0.5 * 
        abs(
            (vertices[1].x - vertices[0].x) * (vertices[2].y - vertices[0].y) -
            (vertices[2].x - vertices[0].x) * (vertices[1].y - vertices[0].y)
        ))
    }
}