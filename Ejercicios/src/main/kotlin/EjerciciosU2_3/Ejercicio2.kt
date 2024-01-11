package EjerciciosU2_3

fun pedirNumero(): Int {
    var salir = false
    var n = 0

    while (!salir) {
        print("Introduce un número: ")
        val entrada = readln()

        try {
            n = entrada.toInt()
            if (n < 0) {
                throw NumberFormatException()
            }
            salir = true
        } catch (e: NumberFormatException) {
            println("Error, número no válido")
        }
    }

    return n
}

fun contarImpares(n: Int) {
    var cont = 1

    while (cont <= n) {
        if ((cont == n - 1 || cont == n) && cont % 2 != 0) {
            print("$cont")
        } else if (cont % 2 != 0) {
            print("$cont,")
        }
        cont++
    }
}

fun main() {
    val n = pedirNumero()
    contarImpares(n)
}
