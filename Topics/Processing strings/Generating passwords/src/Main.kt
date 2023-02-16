const val UPPERCASE_LETTERS = "AB"
const val LOWERCASE_LETTERS = "ab"
const val NUMBER_LETTERS = "01"
@SuppressWarnings("MagicNumber")
fun main() {

    val readString = readln().split(" ")
    val a = readString[0].toInt()
    val b = readString[1].toInt()
    val c = readString[2].toInt()
    val n = readString[3].toInt()

    for (i in 0 until a) {
        print(UPPERCASE_LETTERS[i % 2])
    }
    for (i in 0 until b) {
        print(LOWERCASE_LETTERS[i % 2])
    }
    for (i in 0 until n - a - b) {
        print(NUMBER_LETTERS[i % 2])
    }

}