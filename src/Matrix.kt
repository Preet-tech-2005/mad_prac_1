class Matrix(private val data: Array<IntArray>) {

    private val rows = data.size
    private val cols = data[0].size

    // Addition
    operator fun plus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result)
    }

    // Subtraction
    operator fun minus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result)
    }

    // Multiplication
    operator fun times(other: Matrix): Matrix {

        val result = Array(rows) { IntArray(other.cols) }

        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(result)
    }

    override fun toString(): String {

        var output = ""

        for (i in data.indices) {
            for (j in data[i].indices) {
                output += "${data[i][j]}\t"
            }
            output += "\n"
        }

        return output
    }
}