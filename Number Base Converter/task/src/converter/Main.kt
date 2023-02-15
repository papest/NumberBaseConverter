package converter

fun main() {

    println("Enter number in decimal system:")
    val readNumber = readln().toLong()
    println("Enter target base:")
    val radix = readln().toInt()
    println("Conversion result: ${readNumber.toBigInteger().toString(radix)}")

}