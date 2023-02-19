import java.math.BigDecimal
import java.math.RoundingMode

const val COUNT = 3

fun main() {
    var average = BigDecimal.ZERO

    for (i in 0 until COUNT) {
        average += readln().toBigDecimal()
    }
    average /= COUNT.toBigDecimal()

    println(average.setScale(0, RoundingMode.DOWN))

}