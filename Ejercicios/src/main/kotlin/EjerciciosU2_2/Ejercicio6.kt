package EjerciciosU2_2

import EjerciciosU2_1.isNumeric

fun altura(): Int {
    print("Introduce la altura del triángulo: ")
    var n = readln()
    var salir = false

    while (!salir) {
        if (n.isNumeric() && n.toInt() >= 0) {
            salir = true
        } else {
            println("Error, número no válido")
            print("Introduce la altura del triángulo: ")
            n = readLine().toString()
        }
    }

    return n.toInt()
}

fun triangulo(n: Int) {
    for (cont in 1..n) {
        println("*".repeat(cont))
    }
}

fun main() {
    val n = altura()
    triangulo(n)
}
