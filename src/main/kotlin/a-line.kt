import kotlin.math.abs

class a_line: FigureWithVertices {
    constructor(coord_in: Array<point>): super(coord_in){
        if (coord_in.size == 4) vertices = coord_in
        else println("-_-")
    }

    //площадь трапеции можно представить через сумму площадей двух треугольников

    fun area(): Double {
        return 0.5 * abs((vertices[1].x - vertices[0].x) * (vertices[2].y - vertices[0].y) - (vertices[2].x - vertices[0].x) * (vertices[1].y - vertices[0].y)) +
                0.5 * abs((vertices[2].x - vertices[1].x) * (vertices[3].y - vertices[1].y) - (vertices[3].x - vertices[1].x) * (vertices[2].y - vertices[1].y))

    }
}