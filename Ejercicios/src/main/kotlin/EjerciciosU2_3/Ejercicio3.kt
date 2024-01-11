package EjerciciosU2_3

fun pedir_Numero(): Int {
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

fun cuentaAtras(n: Int) {
    var num = n

    while (num >= 0) {
        if (num != 0) {
            print("$num,")
        } else {
            print(num)
        }
        num--
    }
}

fun main() {
    val n = pedir_Numero()
    cuentaAtras(n)
}
