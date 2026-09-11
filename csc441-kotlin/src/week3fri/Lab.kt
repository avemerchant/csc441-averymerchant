package week3fri

fun main() {
    println("---Step 1 - Ranges---")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    for (letter in 'a'..'e') {
       print("$letter ")
    }
    println()

    println("---Step 2 - Counting Other Ways---")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 0..100 step 25) {
        print("$i ")
    }
    println()

    println("---Step 3 - Looping a List---")
    val shoppingList = mutableListOf("Milk", "Bread", "Coffee")

    for (item in shoppingList) {
        println(item)
    }

    for ((index, item) in shoppingList.withIndex()) {
        println("$index: $item")
    }

    shoppingList.forEachIndexed { index, item -> println("$index is $item")}

    println("---Step 4 - Until, and an Index Mistake---")
    for (i in 0 until shoppingList.size) {
        println("$i: ${shoppingList[i]}")
    }

    println("---Step 5 - When---")
    val day = "Sunday"

    when (day) {
        "Monday" -> println("5 days till weekend")
        "Tuesday" -> println("4 days till weekend")
        "Wednesday" -> println("3 days till weekend")
        else -> println("Weekend is close")
    }

    println("---Step 6 - When That Produces a Value, and a Trap---")
    val age = 40

    val amIOld = when (age) {
        in 1..50 -> false
        in 20..100 -> true
        else -> true
    }

    println(amIOld)

    println("---Step 7 - If That Produces a Value---")
    val years = 10
    val level = if (years > 20) "Senior" else "Junior"
    println(level)
}