package kotlinFunctions.HOF
// Contoh Analogi:
// Printer (Higher-Order Function) = print
// File Dokumen (Fungsi lain yang dapat diterima) = document
// Mencetak Dokumen (Fungsi yang dapat menerima argumen) = printDocument


// Cara Kerja:
// print (Higher-Order Function) menerima argumen document (fungsi lain).
// printDocument (fungsi yang dapat menerima argumen) menerima document sebagai argumen.
// printDocument mencetak dokumen dengan menggunakan document sebagai input.
// print mengembalikan hasil dari printDocument (dokumen yang telah dicetak).

fun print(document: () -> String) {
    println(document())
}

fun documentWord(): String {
    return "This is a Word document."
}

fun documentPDF(): String {
    return "This is a PDF document."
}

fun main() {
    print(::documentWord)
    println() // This is a Word document.

    print(::documentPDF)
    println() // This is a PDF document.
}