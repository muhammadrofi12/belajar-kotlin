fun main() {
    var grade = 'Y'

    println("Grade " + grade++)
    println("Grade " + grade++)
    println("Grade " + grade++)
    println("")
    println("Grade " + grade--)
    println("Grade " + grade--)
    println("Grade " + grade--)

    val language: String = "Kotlin"
    println("Infinite Learning \nBelajar String " + language)
    val stringText = "Muhammad Rofi"
    val firstChar = stringText[0]
    println("First character of $stringText is $firstChar")

    // karakter escape
    // t = add tabs
    // n = new line
    // ' = add single qoute character
    // " = add double qoute character
    // \\ = add blacklash character
    println("Halo nama saya Rofi. \n\tSaya tinggal di Bogor. " +
            "\nSaya mengikuti program MSIB di\\ \"Infinite Learning\"")

    //Raw String
    val paragraf = """
        |           Tugas Tech Kotlin
        |----------------------------------------
        |Muhammad Rofi, program mobile sesi pagi.
        |       STT Terpadu Nurul Fikri.
        |----------------------------------------
        |   Kampus Merdeka - Infinite Learning
    """.trimMargin()

    println(paragraf)


    println("\n")
    // Integer Types
    val byteValue: Byte = 127
    val shortValue: Short = 32767
    val intValue: Int = 2147483647
    val longValue: Long = 9223372036854775807

    // Floating Point Types
    val floatValue: Float = 3.14F
    val doubleValue: Double = 3.141592653589793

    // Char and String
    val charValue: Char = 'A'
    val stringValue: String = "Hello, Kotlin!"

    // Boolean
    val booleanValue: Boolean = true

    val x: Int = 100
    val y: Int = 20

    println("x > y = ${(x > y)}" ) // true
    println("x < y = ${(x < y)}" ) // false
    println("x >= y = ${(x >= y)}" ) // true
    println("x <= y = ${(x <= y)}" ) // false
    println("x == y = ${(x == y)}" ) // false
    println("x != y = ${(x != y)}" ) // true

    // Number
    // Deklarasi variabel dengan tipe data berbeda
    val a: Int = 20000        // Integer (bilangan bulat)
    val d: Double = 200.50    // Double (bilangan desimal dengan presisi ganda)
    val f: Float = 150.75f    // Float (bilangan desimal dengan presisi tunggal)
    val l: Long = 10000000005L // Long (bilangan bulat panjang)
    val s: Short = 20         // Short (bilangan bulat pendek)
    val r: Byte = Byte.MAX_VALUE // Byte (nilai byte maksimum)

    // Menampilkan nilai variabel
    println("-----------")
    println("Int Value is $a")
    println("Double Value is $d")
    println("Float Value is $f")
    println("Long Value is $l")
    println("Short Value is $s")
    println("Byte Value is $r")
    println("--------------")
    // Array
    val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    println("Byte Value: $byteValue")
    println("Short Value: $shortValue")
    println("Int Value: $intValue")
    println("Long Value: $longValue")
    println("Float Value: $floatValue")
    println("Double Value: $doubleValue")
    println("Char Value: $charValue")
    println("String Value: $stringValue")
    println("Boolean Value: $booleanValue")
    println("Array Value: ${intArray.joinToString()}")
}