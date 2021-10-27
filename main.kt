package search

fun main() {
    val inputLine = readLine()!!.toString()
    val inputSearchLine = readLine()!!.toString()
    println(search(inputLine, inputSearchLine))
}

fun search (inputLine: String, inputSearchLine: String): String {
    var temp: String
    val splittedInput = inputLine.split(" ")
    if (inputLine.contains(inputSearchLine)) {   
        temp = (splittedInput.indexOf(inputSearchLine) + 1).toString()
    } else {
        temp = "Not found"
    }
    return temp
}
