package learningPZN

// Function dengan parameter yang sudah disetting menjadi default
fun sayHello(firstName: String, lastName: String? = null) {
    if (lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Rofiul")
    sayHello("Rofiul", "Arham")
}

// Secara default function tidak mengembalikan data
// namanya : Unit