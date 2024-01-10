package EjerciciosU2_1

fun pedirNumero(): Float {
    print("Introduce un número: ")
    var n1 = readln()
    var salir = false

    while (!salir) {
        if (n1.isNumeric()) {
            salir = true
        } else {
            println("Error, debes introducir un número")
            print("Introduce un número: ")
            n1 = readln()
        }
    }

    return n1.toFloat()
}

fun pedirDivisor(): Float {
    print("Introduce el número por el que vas a dividir: ")
    var n2 = readln()?.toString() ?: ""
    var salir = false

    while (!salir) {
        if (n2.replace(".", "").isNumeric()) {
            salir = true
        } else {
            println("Error, debes introducir un número")
            print("Introduce el número por el que vas a dividir: ")
            n2 = readln()
        }
    }

    return n2.toFloat()
}

fun division(n1: Float, n2: Float): Float {
    return if (n2 != 0f) {
        n1 / n2
    } else {
        println("Error, el número no puede ser dividido entre 0")
        0f
    }
}

fun main() {
    val n1 = pedirNumero()
    val n2 = pedirDivisor()

    println("$n1 / $n2 = ${division(n1, n2)}")
}

fun String.isNumeric(): Boolean {
    return this.toDoubleOrNull() != null
}
