fun main() {
    val company = "Infinite Learning"
    // Tanpa String Template
    print("We are study in " + company)

    // Menggunakan String Template
    println("\nWe are study in ${company}")

    print("Menggunakan Ekspresi dalam string")

    val score = 80
    println("\nResult ${if (score >= 80) "Kamu Lulus!!" else "Maaf Anda belum lulus, silakan coba lagi nanti!" }")
}
