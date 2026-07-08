// Parent Class
open class Product(
    var productName: String,
    var quantity: Int,
    var amountPerQuantity: Double
) {

    // Secondary Constructor
    constructor() : this("Unknown", 0, 0.0)

    open fun displayProduct() {
        println("Product Name       : $productName")
        println("Quantity           : $quantity")
        println("Amount Per Quantity: $amountPerQuantity")
    }
}

// Child Class
class Laptop(
    productName: String,
    quantity: Int,
    amountPerQuantity: Double,
    var cpu: String,
    var ram: String,
    var hdd: String
) : Product(productName, quantity, amountPerQuantity) {

    // Secondary Constructor
    constructor() : this(
        "Unknown",
        0,
        0.0,
        "Unknown",
        "Unknown",
        "Unknown"
    )

    fun displayLaptop() {
        displayProduct()
        println("CPU                : $cpu")
        println("RAM                : $ram")
        println("HDD                : $hdd")
        println("--------------------------------")
    }
}

fun main() {

    val laptopList = ArrayList<Laptop>()

    laptopList.add(Laptop("Dell", 2, 55000.0, "Intel i5", "8 GB", "512 GB SSD"))
    laptopList.add(Laptop("HP", 1, 60000.0, "Intel i7", "16 GB", "1 TB SSD"))
    laptopList.add(Laptop("Lenovo", 3, 50000.0, "Ryzen 5", "8 GB", "512 GB SSD"))
    laptopList.add(Laptop("Asus", 2, 70000.0, "Ryzen 7", "16 GB", "1 TB SSD"))
    laptopList.add(Laptop("Acer", 4, 45000.0, "Intel i3", "8 GB", "256 GB SSD"))

    println("******** Laptop Details ********\n")

    for (laptop in laptopList) {
        laptop.displayLaptop()
    }
}