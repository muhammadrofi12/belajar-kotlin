package learningPZN

fun hitungTotal(values: Array<Int>): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return  total
}

fun main() {
    val values = arrayOf(5,5,5,5)
    val result = hitungTotal(values)

    println(result)
}