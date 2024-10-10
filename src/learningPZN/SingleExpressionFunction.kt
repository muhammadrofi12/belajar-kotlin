package learningPZN

// Single Expression Function digunakan jika kode blok sederhana, misal hanya 1 baris kode
// Dengan menggunakan tanda sama dengan (=) setelah deklarasi anam function
// Function ini akan otomatis mengembalikan expression (Return)

fun pangkatDua(a:Int): Int = a * a

fun hi(name: String): Unit = println("Hello $name")

fun hari(day: String) = day

fun main() {
    println(pangkatDua(4))

    hi("Rofi")
    println("Sekarang hari ${hari("Kamis")}" )

}