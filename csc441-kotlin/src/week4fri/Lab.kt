package week4fri

fun main() {
    println("---Requirement 1 - Two Names---")
    val studentName = "Avery"
    val profName: String? = null

    println("---Requirement 2 - A Safe Call---")
    println(profName?.length)

    println("---Requirement 3 - The Elvis Operator---")
    println(profName?.length ?: 0)

    println("---Requirement 4 - The ?.let Block---")
    profName?.let {
        println("Professor Name: $it")
    }

    println("---Requirement 5 - toIntOrNull()---")
    val notANumber = "salsa".toIntOrNull()
    println(notANumber ?: "That wasn't a number")

    println("---Requirement 6 - A listOf---")
    val classList = listOf("CSC441", "CSC421", "MIS340", "REL364")
    println(classList)

    println("---Requirement 7 - A mutableListOf---")
    val classMutableList = mutableListOf("CSC441", "CSC421", "MIS340", "REL364")
    classMutableList.add("MTH421")
    classMutableList.remove("CSC421")
    println(classMutableList)
    println("${classMutableList.size} classes")

    println("---Requirement 8 - A List of Numbers---")
    val heartRate = listOf(89, 125, 99, 136, 85, 113)
    println(heartRate)
    println("Average heart rate: ${heartRate.average()}")
    println("Sum of ${heartRate.size} heart rates: ${heartRate.sum()}")
    println(heartRate.filter { it >= 100})
}