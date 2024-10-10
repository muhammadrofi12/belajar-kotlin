package kotlinFunctions.HOF
// Higher-Order Function adalah fungsi yang menerima fungsi lain sebagai parameter, mengembalikan fungsi, atau keduanya.
// HOF memungkinkan kita menulis kode yang lebih fleksibel, modular, dan reusable dengan cara yang lebih fungsional.

// HOF kotlin pada umumnya
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun subtract(x: Int, y: Int): Int {
    return x - y
}

fun main() {
    val result1 = calculate(5, 3, ::add)
    println("Hasil penjumlahan = $result1")

    val result2 = calculate(5, 3, ::subtract)
    println("Hasil pengurangan = $result2")

    // Mengambil Fungsi sebagai Parameter: HOF dapat menerima fungsi sebagai parameter,
    // yang berarti kita bisa meneruskan logika khusus ke fungsi tersebut dan mengeksekusinya di dalam HOF.
    val result3 = calculate(5, 4) {x, y -> x * y}
    println("Hasil Perkalian = $result3")

}