package EjerciciosU2_2

fun numeroPositivo(): Int {
    print("Introduce un número positivo: ")
    var n: Int?

    do {
        val input = readln()
        n = input?.toIntOrNull()

        if (n == null || n < 0) {
            println("Error, número no válido")
            print("Introduce un número positivo: ")
        }

    } while (n == null || n < 0)

    return n
}

fun cuentaAtras(n: Int) {
    var cont = n

    while (cont >= 0) {
        print(if (cont == 0) cont else "$cont, ")
        cont--
    }
}

fun main() {
    val n = numeroPositivo()
    cuentaAtras(n)
}
