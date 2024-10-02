fun main() {
    // 1. Variables (val and var)
    val pi = 3.14  // Immutable variable
    var radius = 5  // Mutable variable
    println(pi)
    println(radius)

    //pi = 3.14159 // Error: Val cannot be reassigned
    radius = 10
    println(radius)

    // 2. Data Types (Int, Double, Boolean, String)
    val isCircle = true  // Boolean
    var area: Double = pi * radius * radius  // Double

    // 3. String Templates
    val shape = "circle"
    println("The shape is a $shape with radius $radius.")

    // 4. Nullable Types (String?)
    var name: String? = null  // Nullable type
    name = "Rofi"  // Assigning value to the nullable variable

    if (name != null) {
        println("The name is $name.")
    }

    // 5. Safe Calls and Elvis Operators
    val length = name?.length ?: 0  // Safe call with Elvis operator for null handling
    println("The length of the name is $length.")

    var dateOut: String? = null
    var status = "Booked"

    status = "Checkout"

    if (status.equals("Checkout")) {
        dateOut = "02/10/2024 22:20:32"
    }

    println(dateOut)
    println("----")

    // 6. If Expressions
    val a = 10
    val b = 20
    val max = if (a > b) a else b  // If expression to get the maximum of two numbers
    println("The maximum value is ${max}.")

    val examScore = 90

    if (examScore == 100) {
        println("Great Score!")
    } else if (examScore >= 80) {
        println("Good Effort!")
    } else {
        println("Nice try!")
    }

    println("-----")

    // 7. Functions
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    println("The sum of 5 and 10 is ${sum(5, 10)}.")
}
