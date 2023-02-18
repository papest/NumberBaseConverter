package converter

var fromRadix = 10
var toRadix = 10
var value = ""

fun main() {

    while(true) {
        println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)")
        when (readln()) {
            "/exit" -> return
            "/from" -> {
                value = readDecimal()
                fromRadix = 10
                toRadix = readToRadix()
            }
            "/to" -> {
                value = readSource()
                toRadix = 10
                fromRadix = readFromRadix()
            }
        }
        println("Conversion ${toDecimal()}result: ${conversion(fromRadix, toRadix, value)}")
    }
}

fun conversion(fromRadix: Int, toRadix: Int, value: String): String {
    return value.toBigInteger(fromRadix).toString(toRadix)

}

fun toDecimal(): String {
    if (toRadix == 10) return "to decimal "
    return ""
}

fun readFromRadix(): Int {
    println("Enter source base:")
    return readln().toInt()
}

fun readToRadix(): Int {
    println("Enter the target base:")
    return readln().toInt()
}

fun readSource(): String {
    println("Enter source number:")
    return readln()
}

fun readDecimal(): String {
    println("Enter a number in decimal system:")
    return readln()
}

