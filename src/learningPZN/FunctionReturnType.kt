package learningPZN

fun tambah(a:Int, b:Int): Int{
    val total = a + b
    return total
}

fun bagi(a:Int, b:Int): Int {
    if (b == 0){
        return 0
    } else {
        val total = a / b
        return total
    }
}

fun main() {
    println(tambah(10, 5))

    val hasil = tambah(100, 25)
    println(hasil)

    println(bagi(100, 25))
    println(bagi(100, 0))
}