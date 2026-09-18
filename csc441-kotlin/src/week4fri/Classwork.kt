package week4fri

fun main() {
    println("---Step 1 - Two Kinds of String---")
    val firstName: String = "Avery"
    val middleName: String? = null

    println(firstName.length)

    println("---Step 2 - Safe Call---")
    println(middleName?.length)

    println("---Step 3 - Safe Call, Elvis---")
    println(middleName?.length ?: 0) // Default value of 0

    println("---Step 4 - Let---")
    middleName?.let { // Will only run if middleName is not null
        println("Middle name is : $it") // it refers to middleName
    }

    println("---Step 5 - The Risky One---")
    val maybeNumber: Int? = 100
    println(maybeNumber!! + 1) // Possible, not recommended

    println("---Step 6 - Where Nulls Actually Come From---")
    val notANumber = "banana".toIntOrNull()
    println(notANumber ?: "That wasn't a number")

    val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo")
    println(capitals["Canada"] ?: "Not in the map")

    val emptyList = listOf<Int>()
    println(emptyList.maxOrNull() ?: "Empty list")

    println("---Step 7 - List and MutableList---")
    val shoppingList = listOf("bread", "butter", "water")
    val toDoList = mutableListOf("homework", "laundry")

    toDoList.add("dishes")
    toDoList.remove("laundry")

    println(shoppingList)
    println(toDoList)
    println("Items: ${ toDoList.size }")

//    shoppingList.add("milk")

    println("---Step 8 - Things List Can Do---")
    val scores = listOf(90, 72, 85, 64, 98)
    println(scores.sum())
    println(scores.average())
    println(scores.maxOrNull())
    println(scores.sorted())
    println(scores.filter { it >= 80})
}