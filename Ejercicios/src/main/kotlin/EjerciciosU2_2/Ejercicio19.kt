package EjerciciosU2_2

fun menu() {
    var salir = false

    while (!salir) {
        println("opcion 1: comenzar")
        println("opcion 2: imprimir listado")
        println("opcion 3: finalizar programa")
        print("Elige una opcion: ")

        val opcion = readln()?.toInt()

        when (opcion) {
            1 -> println("programa iniciado")
            2 -> println("lista")
            3 -> {
                println("saliste del programa")
                salir = true
            }
            else -> {
                println("Error, opción no válida")
            }
        }
    }
}

fun main() {
    menu()
}