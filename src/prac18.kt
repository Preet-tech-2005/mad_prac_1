fun main() {

    val array1 = arrayOf(5, 15, 25, 35, 45)

    println("Array using arrayOf():")
    println(array1.contentToString())

    val array2 = Array(5) { it + 1 }

    println("\nArray using Array():")
    println(array2.contentToString())

    val array3 = IntArray(5)

    println("\nIntArray:")
    println(array3.contentToString())

    val array4 = intArrayOf(30, 10, 50, 20, 40)

    println("\nArray using intArrayOf():")
    println(array4.contentToString())

    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    println("\n2D Array:")

    for (row in matrix) {
        println(row.contentToString())
    }

    println("\nEnter size of array:")

    val size = readln().toInt()

    val numbers = IntArray(size)

    println("Enter $size elements:")

    for (i in numbers.indices) {

        print("Element ${i + 1}: ")
        numbers[i] = readln().toInt()
    }

    println("\nOriginal Array:")
    println(numbers.contentToString())

    val builtIn = numbers.clone()

    builtIn.sort()

    println("\nSorted using Built-in Function:")
    println(builtIn.contentToString())

    val manual = numbers.clone()

    for (i in manual.indices) {

        var minIndex = i

        for (j in i + 1 until manual.size) {

            if (manual[j] < manual[minIndex]) {
                minIndex = j
            }
        }

        val temp = manual[i]
        manual[i] = manual[minIndex]
        manual[minIndex] = temp
    }

    println("\nSorted without Built-in Function:")
    println(manual.contentToString())
}