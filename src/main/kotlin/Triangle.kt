import kotlin.math.abs

class Triangle:Figure {
    constructor(coord_in: Array<point>): super(coord_in) {
        if(coord_in.size == 3) vertices = coord_in
        else println("Are you crazy?")
    }

    fun Area(): Double {
        return  0.5 * abs((vertices[1].x - vertices[0].x) * (vertices[2].y - vertices[0].y) -
                (vertices[2].x - vertices[0].x) * (vertices[1].y - vertices[0].y))
    }
}