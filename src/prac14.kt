fun main()
{
    println("Integer value: " )
    val number=readln().toInt()

    println(
        if (number%2==0)
        "Even"
        else
        "odd"
    )
}