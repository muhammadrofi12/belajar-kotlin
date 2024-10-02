package collection

// Map adalah struktur data di Kotlin yang menyimpan elemen dalam format pasangan kunci-nilai (key-value pairs)

fun main() {
    // Immutable Map => Map yang read-only, tidak dapat diubah.
    val capitals = mapOf("France" to "Paris", "Germany" to "Berlin", "Learning" to "Sepuh")

    // Mutable Map => Map yang dapat diubah.
    val mutableCapitals = mutableMapOf("France" to "Paris", "Germany" to "Berlin", "Learning" to "Sepuh")
    println(mutableCapitals)

    mutableCapitals["USA"] = "Washington" // Menambahkan elemen baru

    mutableCapitals.remove("Germany") // Menghapus elemen

    // Menambahkan menggunakan metode put
    mutableCapitals.put("Spain", "Madrid")
    println(mutableCapitals)

    // Mengakses nilai menggunakan key
    val capitalOfFrance = mutableCapitals["France"]
    println(capitalOfFrance)

    // Mengahapus pasangan key-value
    mutableCapitals.remove("France")
    println(mutableCapitals)
}