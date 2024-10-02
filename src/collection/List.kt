package collection

fun main() {
    // Immutable List => List yang tidak bisa diubah setekah dibuat,
    // Digunakan untuk data yang tidak memerlukan modifikasi
    val names = listOf<String>("Raihan", "Renaldi", "Reza", "Rofi")

    // Mutable List => ist yang dapat diubah,
    // Memungkinkan penambahan, penghapusan, atau pengeditan elemen.
    val numbers = mutableListOf<Int>(1, 2, 3, 4, 5)

    val mixedList = listOf<Any>(1, "Rofi", 3.0, '4') // type list random

    println(names)
    println(numbers)
}