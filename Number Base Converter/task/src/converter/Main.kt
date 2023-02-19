package converter

const val RESULT_ACCURACY = 5

var fromRadix = 10
var toRadix = 10
var value = ""

fun main() {

    while (true) {
        println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        val readString = readln()
        if (readString == "/exit") return
        val stringArray = readString.split(" ")
        fromRadix = stringArray[0].toInt()
        toRadix = stringArray[1].toInt()

        while (true) {
            println("Enter number in base $fromRadix to convert to base $toRadix (To go back type /back)")
            value = readln()
            if (value == "/back") break
            println("Conversion result: ${conversion(fromRadix, toRadix, value)}")
        }
    }
}

fun conversion(fromRadix: Int, toRadix: Int, value: String): String {

    if (value.indexOf('.') < 0) return value.toBigInteger(fromRadix).toString(toRadix)
    val array = value.split(".")
    return "${conversion(fromRadix, toRadix, array[0])}.${conversionFraction(fromRadix, toRadix, array[1])}"

}

fun conversionFraction(fromRadix: Int, toRadix: Int, s: String): String {
    val length = s.length
    var zeroCount = 0

    for (i in 0 until length) {
        if (s[i] != '0') break
        zeroCount++
    }
    if (zeroCount == length) return "0".repeat(RESULT_ACCURACY)
    var number = s.toBigInteger(fromRadix)
    val toRadixBigInteger = "10".toBigInteger(toRadix)
    val one = "1${"0".repeat(length)}".toBigInteger(fromRadix)
    val result: MutableList<Char> = mutableListOf()

    for (i in 0 until RESULT_ACCURACY) {
        number *= toRadixBigInteger
        result.add((number / one).toString(toRadix).first())
        number %= one
    }

    return result.joinToString("")
}
