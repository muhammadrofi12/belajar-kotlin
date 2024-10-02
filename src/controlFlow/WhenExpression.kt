package controlFlow

fun main() {
    val mentor = 3
    val result = when (mentor) {
        1 -> "Marsani"
        2 -> "Reza"
        3 -> "Reynaldi"
        4 -> "Raihan"
        else -> "Rofi"
    }
    println(result)

    // When Expression Multiple Option
    // Kita dapat mengecek lebih dari satu nilai dalam satu baris.
    val number = 8
    when (number) {
        1, 2 -> println("One or Two")
        3 -> println("Three")
        else -> println("Other Number")
    }

    // When Expression In
    // Untuk mengecek keberadaan nilai dalam range atau koleksi.
    when (number) {
        in 1..5 -> println("Between 1 and 5")
        in 6..10 -> println("Between 6 and 10")
        else -> println("Outside Range")
    }

    // When Expression Is
    // Mengecek tipe dari variabel.
    val response: Any = 12345
    when (response) {
        is String -> println("It's a String")
        is Number -> println("It's a Number")
        else -> println("It's something else")
    }

    // when pengganti if-else
    // Bisa digunakan tanpa variabel untuk menggantikan
    val age = 18
    when {
        age < 18 -> println("Uderage")
        age == 18 -> println("Just mature")
        else -> println("Adult")
    }
}