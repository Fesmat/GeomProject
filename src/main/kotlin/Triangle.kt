import kotlin.math.abs

class Triangle(var x1: Double, var x2: Double, var x3: Double, var y1: Double, var y2: Double, var y3: Double) {
    fun Area(): Double {
        var area: Double
        area = 0.5 * abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1))
        return area
    }
}