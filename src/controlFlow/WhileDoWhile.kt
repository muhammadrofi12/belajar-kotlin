package controlFlow

fun main() {
    // While Loop
    // while loop adalah bentuk dasar dari perulangan yang terus menerus selama kondisi yang diberikan bernilai true
    var count = 0
    while (count <= 5) {
        println("Count: IL ${count}")
        count++
    }

    // do-while loop
    // do-while loop mirip dengan while loop, tetapi memastikan bahwa blok kode dijalankan setidaknya sekali sebelum
    // kondisi diperiksa, karena pengecekan kondisi terjadi setelah blok kode dijalankan.
    var angka =1
    do {
        println("\nAngka: ${angka}")
        angka++
    } while (angka <= 1)
}