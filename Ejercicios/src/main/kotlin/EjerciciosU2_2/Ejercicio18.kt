package EjerciciosU2_2
fun pedir_Numeros(): List<Int> {
    val numeros = mutableListOf<Int>()
    var salir = false

    while (!salir) {
        print("Introduce un número (-1 para salir): ")
        val n = readln()

        if (esNumeroEntero(n)) {
            numeros.add(n.toInt())
        } else if (n == "-1") {
            salir = true
        } else {
            println("Error, número no válido")
        }
    }

    return numeros
}

fun esNumeroEntero(s: String): Boolean {
    return try {
        s.toInt()
        true
    } catch (e: NumberFormatException) {
        false
    }
}

fun sumarNumeros(numeros: List<Int>): Int {
    return numeros.sum()
}

fun contarPares(numeros: List<Int>): Int {
    return numeros.count { it % 2 == 0 }
}

fun main() {
    val numeros = pedir_Numeros()
    println("La suma de los números positivos es: ${sumarNumeros(numeros)}")
    println("Se introdujeron ${contarPares(numeros)} números pares")
}

