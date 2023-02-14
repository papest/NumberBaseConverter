const val BITS_IN_EXBIBYTE = "9223372036854775808"
fun main() {

    val a = readLine()!!.toBigInteger()
    val bitsInExbibyte = BITS_IN_EXBIBYTE.toBigInteger()

    println(a * bitsInExbibyte)

}