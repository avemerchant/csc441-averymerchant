package week4wed

fun main() {
    println("---Requirement 1 - describeToday()---")
    describeToday()

    println("---Requirement 2 - favoriteThing(): String---")
    println(favoriteThing())

    println("---Requirement 3 - pickOne(Int): String---")
    println(pickOne(2))

    println("---Requirement 4 - pickOneShort(Int): String---")
    println(pickOneShort(3))

    println("---Requirement 5 - pickWithDefault(String, Int): String---")
    println(pickWithDefault())
}

fun describeToday() {
    println("Today I had class")
}

fun favoriteThing(): String {
    return "My favorite pizza topping is pepperoni"
}

fun pickOne(number: Int): String {
    return when (number) {
        1 -> "Pineapple"
        2 -> "Pepperoni"
        3 -> "Sausage"
        else -> "Every topping"
    }
}

fun pickOneShort(number: Int): String = when (number) {
    1 -> "Pineapple"
    2 -> "Pepperoni"
    3 -> "Sausage"
    else -> "Every topping"
}

fun pickWithDefault(number: Int = 1, name: String = "you"): String {
    val topping = when (number) {
        1 -> "Pineapple"
        2 -> "Pepperoni"
        3 -> "Sausage"
        else -> "Every topping"
    }
    return "$name got $topping"
}
