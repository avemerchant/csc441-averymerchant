package week4wed

fun main() {
    println("---Step 1 - Function Returning Nothing---")
    todaysExercise()

    println("---Step 2 - Function Returning a Value---")
    println(todaysExercise1())

    println("---Step 3 - A Parameter---")
    println(todaysExercise2(3))
    println(todaysExercise2(9))

    println("---Step 4 - The Short Form---")
    println(todaysExercise3(3))

    println("---Step 5 - A Default Value---")
    println(todaysExercise4())
    println(todaysExercise4(dayNumber = 2))

    println("---Step 6 - Two Parameters and Naming Them---")
    println(todaysExercise5(2, "Avery"))
    println(todaysExercise5(name = "Sam"))
}

fun todaysExercise() {
    println("Push-ups")
}

fun todaysExercise1(): String {
    return "Push-ups"
}

fun todaysExercise2(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest day"
    }
}

fun todaysExercise3(dayNumber: Int): String = when (dayNumber) {
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Cycling"
    5 -> "Gym"
    else -> "Rest day"
}

fun todaysExercise4(dayNumber: Int = 1): String = when (dayNumber) {
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Cycling"
    5 -> "Gym"
    else -> "Rest day"
}

fun todaysExercise5(dayNumber: Int = 1, name: String = "you"): String {
    val exercise = when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest day"
    }
    return "$name is $exercise"
}