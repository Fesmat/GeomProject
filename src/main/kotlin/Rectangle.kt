import kotlin.math.abs

class Rectangle(
    var x1: Double, var x2: Double,
    var y1: Double, var y2: Double
) {
    // Конструктор класса принимает
    // только левую верхнюю
    // и правую нижнюю точки

    fun Area(): Double {
        val area: Double
        val a: Double
        val b: Double
        a = abs(x1 - x2)
        b = abs(y1 - y2)
        area = a * b
        return area
    }
}
