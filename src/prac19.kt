fun main() {
    val a4 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(a4.max())
    var max=a4[0]
    for (i in a4) {
        if(i > max){
            max=i
        }

    }
    println(max)
}