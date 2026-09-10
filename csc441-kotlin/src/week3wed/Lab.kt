package week3wed

import java.security.KeyStore

fun main() {
//    Requirement 1
    val firstName = "Avery"
    val major = "Computer Science"
    val favFood = "Enchiladas"

//    Requirement 2
    var cscCourses = 6
    cscCourses += 1

//    Requirement 3
    val minor = "Applied Statistics"
    val creditsTaken = 94
    val creditsThisSemester = 16
    val gpa = 3.876
    val senior = true

//    Requirement 4
    println("Name: $firstName")
    println("Major: $major")
    println("Minor: $minor")
    println("GPA: $gpa")
    println("Credits Taken: $creditsTaken")
    println("Credits Taken After This Semester: ${creditsTaken + creditsThisSemester}")
    println("CSC Courses Taken: ${cscCourses - 1}")
    println("CSC Courses Taken After This Class: $cscCourses")
    println("Length of Name: ${firstName.length} letters")

//    Requirement 5
    println("What's your major?")
    val yourMajor = readlnOrNull()
    println("Your Major: $yourMajor")
}