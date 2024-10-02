package controlFlow

fun main() {
    val rangeInt = 1..10
    println(rangeInt)

    // Mengatur Step Step adalah interval antara nilai dalam Range.
    // Default step adalah 1.
    // val rangeInt = 1..10 step 2
    println(rangeInt.step)

    // Menggunakan rangeTo()
    val rangeTo = 1.rangeTo(10)
    println(rangeTo)

    // Menggunakan downTo => membuat range terbalik
    val downToRange = 10.downTo(1)
    println(downToRange)

    // Range untuk tipe karakter
    val rangeChar = 'A'..'H'
    println(rangeChar)
}
