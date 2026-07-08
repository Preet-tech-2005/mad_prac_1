fun main() {

    print("Enter first number: ")
    var a = readln().toInt()

    print("Enter second number: ")
    var b = readln().toInt()

    println("\nBefore Swapping")
    println("a = $a")
    println("b = $b")

    // Swapping using third variable
    val temp = a
    a = b
    b = temp

    println("\nAfter Swapping")
    println("a = $a")
    println("b = $b")
}