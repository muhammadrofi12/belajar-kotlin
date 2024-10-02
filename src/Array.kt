fun main() {
    val animals: Array<String> = arrayOf("Cat", "Dog", "Elephant", "Giraffe") // array string
    val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5) // array int
    val life = arrayOf("Rofi", 2, 9.4, "Rumah") // array general

    println(animals[0])
    println(life.get(1))
    println("--------------------")
    println(animals[1])

    animals[0] = "Lion"
    animals.set(1, "Wolf")

    println(animals[0])
    println(animals.get(1))
    println(animals.get(2))
}
