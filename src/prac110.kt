class Car(
    var type: String,
    var model: Int,
    var price: Double,
    var owner: String,
    var milesDrive: Int
) {

    fun getCarInformation() {
        println("Car Information: $type, $model")
    }

    fun getOriginalCarPrice() {
        println("Original Car Price: $price")
    }

    fun getCurrentCarPrice() {
        val currentPrice = price - (milesDrive * 10)
        println("Current Car Price: $currentPrice")
    }

    fun displayInformation() {
        getCarInformation()
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        getOriginalCarPrice()
        getCurrentCarPrice()
        println("-------------------")
    }
}

fun main() {

    val carList = ArrayList<Car>()

    print("Enter number of cars: ")
    val n = readln().toInt()

    for (i in 1..n) {

        println("\nEnter details of Car $i")

        print("Enter Car Type: ")
        val type = readln()

        print("Enter Model Year: ")
        val model = readln().toInt()

        print("Enter Price: ")
        val price = readln().toDouble()

        print("Enter Owner Name: ")
        val owner = readln()

        print("Enter Miles Driven: ")
        val miles = readln().toInt()

        val car = Car(type, model, price, owner, miles)
        carList.add(car)
    }

    println("\n******** Car Information ********")

    for (car in carList) {
        car.displayInformation()
    }
}