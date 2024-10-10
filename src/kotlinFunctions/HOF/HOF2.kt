package kotlinFunctions.HOF

// Mengembalikan Fungsi sebagai Hasil
// fungsi operation mengembalikan fungsi lambda berdasarkan nilai type
fun operation(type: String): (Int, Int) -> Int {
    return when (type) {
        "add" -> { a, b -> a + b }
        "multiply" -> { a, b -> a * b }
        "rank" -> {a, _ -> a * a} // Menggunakan _ untuk mengabaikan suatu parameter
        else -> { a, b -> 0 }
    }

}

fun main() {
    val addOperation1 = operation("add")
    val result1 = addOperation1(4, 6)
    println("Result1: $result1")

    val addOperation2 = operation("rank")
    val result2 = addOperation2(4, 0)  // Parameter kedua tetap diperlukan
    println("Result2 = $result2")
}
