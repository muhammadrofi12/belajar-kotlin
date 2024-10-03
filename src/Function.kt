fun sayHello(firstName: String, lastName: String) {
    // Fungsi untuk mencetak sapaan dengan nama depan dan nama belakang
    println("Hello $firstName $lastName")
}

fun deskripsi(
    fullName: String,
    semester: Int,
    campus: String,
    company: String,
    program: String,
) {
    println("""
        Perkenalkan aku $fullName.
        Aku dari $campus dan $semester,
        saat ini aku sedang belajar di $company,
        dengan program $program
    """.trimIndent())
}

fun main() {
    // 7. Functions
    // Memanggil fungsi sayHello dengan parameter "Muhammad" dan "Rofi"
    sayHello("Muhammad", "Rofi")

    // Memanggil fungsi deskripsi dengan parameternya
    deskripsi(
        fullName = "Muhammad Rofi",
        semester = 5,
        campus = "STT Terpadi Nurul Fikri",
        company = "Infinite Learning",
        program = "Mobile Development"
    )


    // Fungsi untuk menjumlahkan dua bilangan integer dan mengembalikan hasilnya
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    // Menampilkan hasil penjumlahan dari 5 dan 10
    println("The sum of 5 and 10 is ${sum(5, 10)}.")
}
