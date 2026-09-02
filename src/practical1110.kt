import javax.swing.tree.TreeModel

//fun main()
//{
//   val c=Car("Bmw")
//   println(c.model)
//}
//class Car(m: String){
//    var model:String=""
//    var price:Double=0.0
//    init {
//        model=m
//    }
//}
fun main()
{
    val c=Car("Bmw", p=10000.0)
    println(c.model)
    println(c.price)
}
open class Car(var model: String){

    var price:Double=0.0
    constructor(m: String, p: Double,)  : this(model=m) {
        price=p

    }
}
class suzuki(m:String): Car(m){

}
