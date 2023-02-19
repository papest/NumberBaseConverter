import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val startingAmount = readln().toBigDecimal()
    var yearlyPercent = readln().toBigDecimal()
    yearlyPercent = yearlyPercent.setScale(yearlyPercent.scale() + 2)
    val years = readln().toInt()
    val hundred = "100".toBigDecimal()
    val amountOfMoney = startingAmount * (yearlyPercent / hundred + BigDecimal.ONE).pow(years)

    println("Amount of money in the account: ${amountOfMoney.setScale(2, RoundingMode.CEILING)}")

}