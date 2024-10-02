package controlFlow

fun main() {
    // 1. Perulangan dengan List
    val fruits = listOf("Apple", "Banana", "Orange")
    println("Perulangan dengan List:")
    for (fruit in fruits) {
        println(fruit)
    }

    // 2. Perulangan dengan Range
    println("\nPerulangan dengan Range:")
    for (i in 1..5) {
        println(i)
    }

    // 3. Perulangan dengan Step
    println("\nPerulangan dengan Step:")
    for (i in 1..10 step 2) {
        println(i)
    }

    // 4. Perulangan Mundur (Descending)
    println("\nPerulangan Mundur:")
    for (i in 5 downTo 1) {
        println(i)
    }

    // 5. Perulangan dengan Indeks (Indexing)
    val colors = listOf("Red", "Green", "Blue")
    println("\nPerulangan dengan Indeks:")
    for ((index, color) in colors.withIndex()) {
        println("Color at index $index is $color")
    }

    // 6. Perulangan dengan Array
    val numbers = arrayOf(10, 20, 30, 40)
    println("\nPerulangan dengan Array:")
    for (number in numbers) {
        println(number)
    }

    // 7. Perulangan dengan Break dan Continue
    println("\nPerulangan dengan Break:")
    for (i in 1..10) {
        if (i == 5) break  // Keluar dari perulangan jika i sama dengan 5
        println(i)
    }

    println("\nPerulangan dengan Continue:")
    for (i in 1..5) {
        if (i == 3) continue  // Lompat iterasi saat i sama dengan 3
        println(i)
    }
}
