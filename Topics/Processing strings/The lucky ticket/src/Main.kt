@SuppressWarnings("MagicNumber")
fun main() {
    val tN = readln()
    println(
        if (tN[0].code + tN[1].code + tN[2].code == tN[3].code + tN[4].code + tN[5].code) {
            "Lucky"
        } else {
            "Regular"
        }
    )
}