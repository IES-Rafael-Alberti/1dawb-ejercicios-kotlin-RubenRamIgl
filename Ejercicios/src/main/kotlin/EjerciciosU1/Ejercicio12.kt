package EjerciciosU1

import kotlin.math.pow

fun pedirPeso(): Float {
    println("Introduce tu peso (en kg): ")
    val peso = readln().toFloat()

    return peso
}

fun pedirEstatura(): Float {
    println("Introduce tu estatura (en metros cuadrados): ")
    val estatura = readln().toFloat()

    return estatura
}

fun calcularIMC(peso: Float, estatura: Float) {
    val IMC = peso / estatura.pow(2)

    println("Tu índice de masa corporal es %.2f".format(IMC))
}

fun main() {
    val peso = pedirPeso()
    val estatura = pedirEstatura()

    calcularIMC(peso, estatura)
}