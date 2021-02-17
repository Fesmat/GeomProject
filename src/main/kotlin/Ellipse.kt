import kotlin.math.PI
class Ellipse: Figure {

    // В эллипсе точки пожно передать только дискретизацией окружности
    // но для того, чтобы найти эти точки,
    // потребуется оооочень много времени
    // поэтому унаследуем от класса свободной фигуры и передадим
    // меньшую и большую полуоси

    var min_axe : Double
    var max_axe : Double
    constructor(a : Double, b : Double) : super() {
        min_axe = a
        max_axe = b
    }
    fun area() : Double {
        return PI * min_axe * max_axe
    }
}