package collection

fun main() {
    val numbers = listOf(5, 10, 15, 20, 25)

    // Filter angka yang lebih dari 10
    val filteredNumbers = numbers.filter { it > 10 }

    // Mengalikan angka yang sudah difilter dengan 2
    val doubledNumbers = filteredNumbers.map { it * 2 }

    // Menghitung jumlah elemen setelah filter
    val countNumbers = doubledNumbers.count()

    // Mencari elemen pertama yang lebih besar dari 20
    val firstGreaterThanTwenty = doubledNumbers.firstOrNull { it > 20 }

    // Menjumlahkan semua elemen
    val sumNumbers = doubledNumbers.sum()

    // Output hasil
    println("Angka yang lebih dari 10: $filteredNumbers")
    println("Angka setelah dikali 2: $doubledNumbers")
    println("Jumlah elemen: $countNumbers")
    println("Elemen pertama yang lebih dari 20: $firstGreaterThanTwenty")
    println("Jumlah total elemen: $sumNumbers")
}
