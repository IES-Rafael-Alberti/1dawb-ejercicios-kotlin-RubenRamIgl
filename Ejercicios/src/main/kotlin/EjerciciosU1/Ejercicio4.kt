package EjerciciosU1

fun celsius(): Float {
    println("Introduce los grados celsius: ")
    val celsius = readln().toFloat()

    return celsius
}

fun fahrenheit(celsius: Float) {
    val resultado = (celsius * 9 / 5) + 32

    println("$celsius grados celsius en grados fahrenheit es $resultado")
}

fun main(args: Array<String>) {
    val celsius = celsius()

    fahrenheit(celsius)
}