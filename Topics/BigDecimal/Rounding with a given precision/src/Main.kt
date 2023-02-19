import java.math.RoundingMode

fun main() {
    val number = readln().toBigDecimal()
    val newScale = readln().toInt()
    println(number.setScale(newScale, RoundingMode.HALF_DOWN))
}