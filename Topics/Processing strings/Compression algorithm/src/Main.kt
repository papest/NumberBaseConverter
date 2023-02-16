fun main() {
    val readString = readln()
    if (readString.isEmpty()) {
        println()
        return
    }

    var ch = readString[0]
    var count = 0
    print(ch)
    for (c in readString) {
        if (ch == c) {
            count++
        } else {
            print(count)
            count = 1
            ch = c
            print(c)
        }

    }
    print(count)

}