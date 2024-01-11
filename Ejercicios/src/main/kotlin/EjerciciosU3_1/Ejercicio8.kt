package EjerciciosU3_1

fun pedirPalabra(): String {
    print("Introduce una palabra: ")
    val palabra = readLine() ?: ""
    return palabra
}

fun esPalindromo(palabra: String): Boolean {
    return palabra == palabra.reversed()
}

fun main() {
    val palabra = pedirPalabra()

    if (esPalindromo(palabra)) {
        println("La palabra es un palíndromo")
    } else {
        println("La palabra no es un palíndromo")
    }
}
