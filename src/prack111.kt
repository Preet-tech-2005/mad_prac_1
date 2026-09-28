class Matriix(
    private val data: Array<IntArray>,
    private val rows: Int,
    private val cols: Int
) {

    operator fun plus(other: Matriix): Matriix {
        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }

        return Matriix(result, rows, cols)
    }

    operator fun minus(other: Matriix): Matriix {
        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }

        return Matriix(result, rows, cols)
    }

    operator fun times(other: Matriix): Matriix {
        val result = Array(rows) { IntArray(other.cols) }

        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matriix(result, rows, other.cols)
    }

    override fun toString(): String {
        var str = "($rows x $cols Matriix):\n"

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                str += "${data[i][j]}\t"
            }

            str += "\n"
        }

        return str
    }
}

fun main() {

    val firstMatriix = Matriix(
        arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(3, 0, 4)
        ),
        2,
        3
    )

    val secondMatriix = Matriix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        ),
        3,
        2
    )

    val secondMatriix1 = Matriix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        ),
        3,
        2
    )

    println("****************Addition****************")

    print("Matriix:1 ")
    print(secondMatriix1)

    print("Matriix:2 ")
    print(secondMatriix)

    val add = secondMatriix1 + secondMatriix

    println("Addition: $add")

    println("****************Subtraction****************")

    print("Matriix:1 ")
    print(secondMatriix1)

    print("Matriix:2 ")
    print(secondMatriix)

    val sub = secondMatriix1 - secondMatriix

    println("Subtraction: $sub")

    println("****************Multiplication****************")

    print("Matriix:1 ")
    print(firstMatriix)

    print("Matriix:2 ")
    print(secondMatriix)

    val mul = firstMatriix * secondMatriix

    println("Multiplication: $mul")
}