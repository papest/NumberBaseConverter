package converter

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
    return value.toBigInteger(fromRadix).toString(toRadix)

}
