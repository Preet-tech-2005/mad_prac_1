fun main() {

    val matrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        )
    )

    val matrix2 = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        )
    )

    val matrix3 = Matrix(
        arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(3, 0, 4)
        )
    )

    println("===================================")
    println("        MATRIX ADDITION")
    println("===================================")

    println("Matrix A")
    println(matrix1)

    println("Matrix B")
    println(matrix2)

    val add = matrix1 + matrix2

    println("Result (A + B)")
    println(add)

    println("===================================")
    println("      MATRIX SUBTRACTION")
    println("===================================")

    val sub = matrix1 - matrix2

    println("Result (A - B)")
    println(sub)

    println("===================================")
    println("     MATRIX MULTIPLICATION")
    println("===================================")

    println("Matrix X")
    println(matrix3)

    println("Matrix Y")
    println(matrix2)

    val mul = matrix3 * matrix2

    println("Result (X × Y)")
    println(mul)

    println("===================================")
}