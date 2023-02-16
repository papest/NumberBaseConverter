fun main() {

    val readString = readln().lowercase()
    var count = 0

    readString.split("[^aeiouy]+".toRegex()).forEach { a ->
        count += if (a.isEmpty()) 0 else a.length / 2 + a.length % 2 - 1
    }
    readString.split("[aeiouy]+".toRegex()).forEach { a ->
        count += if (a.isEmpty()) 0 else a.length / 2 + a.length % 2 - 1
    }

    println(count)

}