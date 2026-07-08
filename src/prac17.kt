fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}

fun main() {
    print("Enter a number: ")
    val number = readln().toInt()

    val result = factorial(number)

    println("Factorial of $number is $result")
}