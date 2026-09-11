package week3fri

fun main() {
    println("---Step 1 - A Range Loop---")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    println("---Step 2 - A downTo Loop---")
    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()

    println("---Step 3 - A mutableListOf---")
    val packingList = mutableListOf("Clothes", "Phone", "Camera", "Passport")

    println("---Step 4 - Print That List Two Ways---")
    for (item in packingList) {
        println(item)
    }

    for ((index, item) in packingList.withIndex()) {
        println("$index: $item")
    }

    println("---Step 5 - A for With until---")
    for (i in 0 until packingList.size) {
        println("$i: ${packingList[i]}")
    }

    println("---Step 6 - A when With a Subject---")
    val day = 3

    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        else -> println("Saturday")
    }

    println("---Step 7 - A val Assigned From An if---")
    val years = 20
    val ageGroup = if (years < 18) "Child" else "Adult"
    println(ageGroup)
}