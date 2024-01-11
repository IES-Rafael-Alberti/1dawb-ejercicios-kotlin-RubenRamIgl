package EjerciciosU2_3

fun pedir_Numero2() {
    var salir = false

    while (!salir) {
        print("Introduce un número: ")
        val entrada = readln()

        try {
            val n = entrada.toInt()
            if (n < 0) {
                throw NumberFormatException()
            }
            println("Número válido")
            salir = true
        } catch (e: NumberFormatException) {
            println("Error, número no válido")
        }
    }
}

fun main() {
    pedir_Numero2()
}
