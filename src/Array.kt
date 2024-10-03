fun main() {
    val animals: Array<String> = arrayOf("Cat", "Dog", "Elephant", "Giraffe") // array string
    //val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5) // array int
    val life = arrayOf("Rofi", 2, 9.4, "Rumah") // array general

    println(animals[0])
    println(life.get(1))
    println("--------------------")
    println(animals[1])

    animals[0] = "Lion"
    animals.set(1, "Wolf")

    println(animals[0])
    println(animals.get(1))
    println(animals.get(2))

    // Jenis Array Primitif
    val intArray = intArrayOf(1, 2, 3, 4, 5) // Array primitif untuk tipe Int
    val longArray = longArrayOf(100L, 200L, 300L) // Array primitif untuk tipe Long
    val shortArray = shortArrayOf(10, 20, 30) // Array primitif untuk tipe Short
    val byteArray = byteArrayOf(1, 2, 3) // Array primitif untuk tipe Byte
    val charArray = charArrayOf('A', 'B', 'C') // Array primitif untuk tipe Char
    val floatArray = floatArrayOf(1.1f, 2.2f, 3.3f) // Array primitif untuk tipe Float
    val doubleArray = doubleArrayOf(1.11, 2.22, 3.33) // Array primitif untuk tipe Double
    val booleanArray = booleanArrayOf(true, false, true) // Array primitif untuk tipe Boolean

    println("Int Array: ${intArray.joinToString()}")
    println("Long Array: ${longArray.joinToString()}")
    println("Short Array: ${shortArray.joinToString()}")
    println("Byte Array: ${byteArray.joinToString()}")
    println("Char Array: ${charArray.joinToString()}")
    println("Float Array: ${floatArray.joinToString()}")
    println("Double Array: ${doubleArray.joinToString()}")
    println("Boolean Array: ${booleanArray.joinToString()}")
}
