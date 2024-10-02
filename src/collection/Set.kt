package collection

// Set adalah jenis koleksi di Kotlin yang tidak menyimpan elemen secara berurutan dan hanya memperbolehkan nilai unik
// Artinya, tidak ada elemen yang berulang dalam koleksi ini, yang sangat bermanfaat untuk menjamin keunikan elemen dalam berbagai kasus penggunaan.

fun main() {
    // Immutable Set => digunakan untuk membuat set yang hanya-bisa-dibaca
    // Setelah dibuat, elemen tidak dapat diubah, ditambah, atau dihapus.
    val mySet = setOf(1, 2, 3)

    // Mutable Set => digunakan untuk membuat set yang elemennya dapat diubah
    val myMutableSet = mutableSetOf(1, 2, 3)

    myMutableSet.add(4) // Menambahkan elemen baru
    myMutableSet.remove(1) // Menghaous elemen

    print(myMutableSet)
    print("\n")

    // Melihat nilai dalam set
    if (5 in mySet) {
        println("Angka 2 terdapat dalam set")
    } else {
        println("Not Found")
    }

    // Gabungan dan Irisan
    val setA = setOf(1,2,3)
    val setB = setOf(6,7,8,2,3)

    val unionSet = setA.union(setB) // Gabungan
    val intersectionSet = setA.intersect(setB) // Irisan

    println(unionSet)
    println(intersectionSet)
}