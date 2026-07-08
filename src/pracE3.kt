// Parent Class
open class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {

    // Secondary Constructor
    constructor() : this("Unknown", "Unknown", 0)

    open fun displayPerson() {
        println("First Name   : $firstName")
        println("Last Name    : $lastName")
        println("Age          : $age")
    }
}

// Child Class
class Student(
    firstName: String,
    lastName: String,
    age: Int,
    var enrollmentNo: String,
    var branch: String,
    var studentClass: String,
    var labBatch: String
) : Person(firstName, lastName, age) {

    // Secondary Constructor
    constructor() : this(
        "Unknown",
        "Unknown",
        0,
        "N/A",
        "N/A",
        "N/A",
        "N/A"
    )

    fun displayStudent() {
        displayPerson()
        println("Enrollment No: $enrollmentNo")
        println("Branch       : $branch")
        println("Class        : $studentClass")
        println("Lab Batch    : $labBatch")
        println("--------------------------------")
    }
}

fun main() {

    val studentList = ArrayList<Student>()

    studentList.add(Student("Preet", "Patel", 20, "24012011119", "CE", "B.Tech 3rd Year", "B1"))
    studentList.add(Student("Sahil", "Kalyani", 21, "24012011037", "CE", "B.Tech 3rd Year", "B2"))
    studentList.add(Student("Meshvi", "Patel", 20, "24012011109", "CE", "B.Tech 3rd Year", "B1"))
    studentList.add(Student("Heli", "vyas", 19, "24012011197", "CE", "B.Tech 3rd Year", "B3"))
    studentList.add(Student("Chetan", "Goswami", 20, "24012011028", "CE", "B.Tech 3rd Year", "B2"))

    println("******** Student Information ********\n")

    for (student in studentList) {
        student.displayStudent()
    }
}