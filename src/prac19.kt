fun main() {

    val numbers = ArrayList<Int>()

    print("Enter the number of elements: ")
    val n = readln().toInt()

    println("Enter $n elements:")

    for (i in 0 until n) {
        print("Element ${i + 1}: ")
        numbers.add(readln().toInt())
    }

    var max = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i]
        }
    }

    println("\nArrayList = $numbers")
    println("Maximum Number = $max")
}