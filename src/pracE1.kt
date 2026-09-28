fun main() {

    println("Enter first number:")
    var num1 = readln().toInt()

    println("Enter second number:")
    var num2 = readln().toInt()

    println("\n--- Swapping Using Third Variable ---")

    println("Before Swapping: num1 = $num1, num2 = $num2")

    var temp = num1
    num1 = num2
    num2 = temp

    println("After Swapping: num1 = $num1, num2 = $num2")

    println("\nEnter first number again:")
    num1 = readln().toInt()

    println("Enter second number again:")
    num2 = readln().toInt()

    println("\n--- Swapping Without Third Variable ---")

    println("Before Swapping: num1 = $num1, num2 = $num2")

    num1 = num1 * num2
    num2 = num1 / num2
    num1 = num1 / num2

    println("After Swapping: num1 = $num1, num2 = $num2")
}