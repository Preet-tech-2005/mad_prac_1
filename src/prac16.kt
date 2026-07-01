fun main()
{
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    println(add(number1, number2))
}
fun add(number1:Int, number2: Int): Int {
    return number1+number2
}
fun sub(number1:Int, number2:Int): Int {
    return number1-number2
}
fun multiply(number1:Int, number2:Int): Int {
    return number1*number2
}