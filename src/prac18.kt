fun main()
{
    val a1= arrayOf('a','b','c','d','e','f')
    println(a1.joinToString())
    val a2=Array<Int>(5){10}
    println(a2.joinToString())
    val a3=Array<Int>(5){i->i*2}
    a3.shuffle()

    a3.sort()
    println(a3.joinToString())
}