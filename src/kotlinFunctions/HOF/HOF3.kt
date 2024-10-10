package kotlinFunctions.HOF

// Lambda dan Function Reference
// Kotlin memanfaatkan lambda dan function reference untuk mendefinisikan
// atau meneruskan fungsi ke HOF secara ringkas.

fun double(x: Int): Int = x * 2

fun applyFunction(x: Int, f: (Int) -> Int): Int {
    return f(x)
} // applyFunction adalah HOF yang menerima parameter f berupa function reference ::double.

fun main() {
    val result = applyFunction(5, ::double)
    println("Result: $result")
}
