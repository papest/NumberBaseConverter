const val PARAMETER_NAME_INDEX = 0
const val PARAMETER_VALUE_INDEX = 1
const val PARAMETERS_INDEX = 1
fun main() {

    val params = readln().split('?')[PARAMETERS_INDEX]
    val arrayOfParams = params.split('&')
    var pass = ""

    for (s in arrayOfParams) {
        val a = s.split('=')
        println("${a[PARAMETER_NAME_INDEX]} : ${a[PARAMETER_VALUE_INDEX].ifEmpty { "not found" }}")
        if (a[PARAMETER_NAME_INDEX] == "pass") {
            pass = a[PARAMETER_VALUE_INDEX]
        }
    }

    if (pass.isNotEmpty()) {
        println("password : $pass")
    }

}