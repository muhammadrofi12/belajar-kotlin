package controlFlow

fun main() {
    // 1. Menggunakan continue dalam perulangan
    println("Menggunakan continue dalam perulangan:")
    for (i in 1..5) {
        if (i == 3) continue // Lompat iterasi saat i sama dengan 3
        println(i)
    }

    // 2. Menggunakan break dalam perulangan
    println("\nMenggunakan break dalam perulangan:")
    for (i in 1..5) {
        if (i == 4) break // Hentikan perulangan saat i sama dengan 4
        println(i)
    }

    // 3. Menggabungkan continue dan break
    println("\nMenggabungkan continue dan break:")
    for (i in 1..10) {
        if (i % 2 == 0) continue // Lompat iterasi untuk angka genap
        if (i == 7) break // Hentikan perulangan saat i sama dengan 7
        println(i)
    }

    // 4. Menggunakan continue dalam perulangan dengan array
    val numbers = arrayOf(10, 20, 30, 40, 50)
    println("\nMenggunakan continue dalam perulangan dengan array:")
    for (number in numbers) {
        if (number == 30) continue // Lompat iterasi saat elemen sama dengan 30
        println(number)
    }

    // 5. Menggunakan break dalam perulangan dengan range
    println("\nMenggunakan break dalam perulangan dengan range:")
    for (i in 1..10) {
        if (i == 6) break // Hentikan perulangan saat i sama dengan 6
        println(i)
    }
}
