fun main() {
    val (s1, s2) = readln().split(" ")
    val n = s2.toInt()
    var result = s1

    if (n < s1.length) {
        val array = s1.toCharArray()
        for (i in n until s1.length) {
            array[i - n] = array[i]
        }
        for (i in 0 until n) {
            array[i + s1.length - n] = s1[i]
        }

        result = String(array)

    }
    println(result)
}