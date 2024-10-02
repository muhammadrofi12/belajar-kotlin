fun main() {
    val company = "Infinite Learning"
    // Tanpa String Template
    print("We are study in " + company)

    // Menggunakan String Template
    println("\nWe are study in ${company}")

    print("Menggunakan Ekspresu dalam string")
    val score = 80
    println("\nResult ${if (score >= 80) "You Win!!" else "Please try again!" }")
}
