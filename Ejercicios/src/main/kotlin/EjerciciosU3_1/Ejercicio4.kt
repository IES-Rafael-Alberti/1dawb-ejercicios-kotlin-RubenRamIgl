package EjerciciosU3_1

fun pedirNumeros(): List<Int> {
    val numeros = mutableListOf<Int>()
    var salir = false

    while (!salir) {
        print("Introduce un número (no introducir nada para salir): ")
        val n = readln()

        if (n == "") {
            salir = true
        } else {
            numeros.add(n.toInt())
        }
    }

    numeros.sort()
    return numeros
}

fun imprimirNumeros(numeros: List<Int>) {
    println(numeros)
}

fun main() {
    val numeros = pedirNumeros()
    imprimirNumeros(numeros)
}
