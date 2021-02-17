import kotlin.math.abs

class Rectangle : FigureWithVertices {
    // Так как у квадрата есть вершины, то можем
    // унаследовать его от класса фигуры с вершинами

    constructor(coord_in: Array<point>) : super(coord_in) {
        if (coord_in.size == 2) vertices = coord_in
        else println("Ладно.")
    }
    // В конструктор передаем координаты вершин
    // Вершиы передаются в виде списка

    fun area(): Double {
        return abs(vertices[0].x - vertices[1].x) * abs(vertices[0].y - vertices[1].y)
    }
}
