package EjerciciosU2_2

fun pedirFrase(): String {
    print("Introduce una palabra: ")
    val palabra = readln()
    return palabra
}

fun mostrarEco(palabra: String): String {
    val palabras = palabra.split(" ")
    val ultima = palabras.last()
    return buildString {
        repeat(2) {
            append(ultima).append(" ")
        }
    }
}

fun main() {
    var salir = false

    while (!salir) {
        val frase = pedirFrase()
        if (frase.toLowerCase() == "salir") {
            println("Saliste del programa")
            salir = true
        } else {
            println("$frase ${mostrarEco(frase)}")
        }
    }
}
