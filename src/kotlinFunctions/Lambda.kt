package kotlinFunctions

// Kotllin lambda adalah fungsi yang tidak memiliki nama
// Di definiskan dengan kurung kurawal { }
// Sintaks lambda
// { parameter -> ekspresi }



fun main() {
    // val lambda = {x:Int -> x * 2}

    // println(lambda(5))

    // Lambda dengan lebih dari satu parameter
    val kelilingPersegiPanjang = {a:Int, b:Int -> 2 * (a + b)}

    println("hasil keliling persegi adalah ${kelilingPersegiPanjang(10,24)}")

    // Lambda dengan tipe pengembalian
    val lambda = { x: Int, y: Int -> "Hasil: ${x + y}" }
    // val lambda: (Int, Int) -> String = { x, y -> "Hasil: ${x + y}" }

    println(lambda(4,6))

    // perbandingan
    // Regular Function
    fun readyToLearnA(programmingLang: String): String {
        return "Hello $programmingLang"
    }

    // Fungsi with Lambda
    // val readyToLearnB: (String) -> String = {programmingLang: String -> "Hello $programmingLang"}
    val readyToLearnB = {programmingLang: String -> "Hello $programmingLang"}

    println(readyToLearnA("Kotlin - Regular Function"))
    println(readyToLearnB("Kotlin - Function with Lambda"))

    // Ciri-Ciri Lambda
    // Tidak perlu mendeklarasikan tipe tertentu untuk nilai yang dikembalikan.
    // Tidak memerlukan kata kunci fun dan pengubah visibilitas.
    // Parameter yang harus ditetapkan berada di dalam tanda kurung kurawal (brackets) {}.
    // Kata kunci return tidak diperlukan untuk mengembalikan nilai.
    // Ekspresi lambda dapat digunakan sebagai argumen untuk parameter dan dapat disimpan dalam variabel.

    // val length = nameLength("Muhammad Rofiul") // Perlu membuat function nameLength() terlebih dahulu
    // println("Name length $length")

    val nameLength = {message: String -> message.length}

    println(nameLength("Muhammad Rofiul"))

    // Lambda dapat digunakan dalam berbagai konteks, seperti:
    // Sebagai argumen fungsi
    // Sebagai nilai properti
    // Sebagai isi koleksi (seperti List atau Map)

    // Contoh lambda sebagai argumen fungsi
    fun calculation(x: Int, y: Int, operation: (Int, Int) -> Int) {
        val result = operation(x, y)
        println("Hasil: $result")
    }

    calculation(5, 4, { x, y -> x * y })
}


