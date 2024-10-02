fun sayHello(firstName: String, lastName: String) {
    // Fungsi untuk mencetak sapaan dengan nama depan dan nama belakang
    println("Hello $firstName $lastName")
}

fun main() {
    // 7. Functions
    // Memanggil fungsi sayHello dengan parameter "Muhammad" dan "Rofi"
    sayHello("Muhammad", "Rofi")


    // Fungsi untuk menjumlahkan dua bilangan integer dan mengembalikan hasilnya
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    // Menampilkan hasil penjumlahan dari 5 dan 10
    println("The sum of 5 and 10 is ${sum(5, 10)}.")
}
