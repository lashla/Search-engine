package search

fun main() {
    println("Enter the number of people:")
    val inputLinesQuantity = readLine()!!.toInt()
    search(inputLinesQuantity)
}

fun search (inputLinesQuantity: Int) {
    var temp = mutableListOf<String>()
    var inputLines = mutableListOf<String>()
    println("Enter all people:")
    repeat (inputLinesQuantity) {
        inputLines.add(readLine()!!.toString())
    }
    println("\nEnter the number of search queries:")
    val numberOfSearches = readLine()!!.toInt()
    repeat(numberOfSearches) {
        println("\nEnter data to search people:")
        val searchData = readLine()!!.toString()
        for (element in 0 until inputLines.size){
            if (inputLines[element].contains(searchData) || 
                inputLines[element].contains(searchData.toLowerCase()) || 
                inputLines[element].contains(searchData.toUpperCase())) {   
                temp.add(inputLines[element])
            }
        }
        if (temp.size != 0) {
            println("\nPeople found:")
            for(element in 0 until temp.size){
                println(temp[element])
            }
            temp.clear()
        } else {
            println("No matching people found.")
        }
    }
}
