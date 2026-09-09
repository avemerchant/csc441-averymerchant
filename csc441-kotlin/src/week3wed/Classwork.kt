package week3wed

fun main() {
    println("---Step 1 - main and output---")
    println("CSC 441")
    println("Kotlin, first day")

    println("---Step 2 - val and var---")
    val course = "CSC 441"
    var weekNumber = 3
    weekNumber += 1

    println(course)
    println(weekNumber)

    println("---Step 3 - the four basic types---")
    val name = "Avery"
    val age = 19
    val gpa = 3.876
    val learning = true

    println(name)
    println(age)
    println(gpa)
    println(learning)

    println("---Step 4 - String templates---")
    println("$name learns $course.")
//    println(name + "" + "learns" + "" + course)
    println("Age next year: ${age + 1}")
    println("Name length: ${name.length} letters")

    println("---Step 5 - Reading input---")
    println("What's your name?")
    val yourName = readlnOrNull()
    println("Hello, $yourName")
}