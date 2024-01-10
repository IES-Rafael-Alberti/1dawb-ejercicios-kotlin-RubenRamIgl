package EjerciciosU2_2

fun pedir_Frase(): String {
    var frase = ""
    var salir = false

    while (!salir) {
        print("Introduce una frase: ")
        var frase = readln()

        if (frase == "") {
            println("Frase vacía")
        } else {
            salir = true
        }
    }

    return frase
}

fun palabraLarga(frase: String): String {
    val listaFrase = frase.split(" ")
    var palabraLarga = listaFrase[0]
    var longitud = palabraLarga.length

    for (palabra in listaFrase) {
        if (palabra.length > longitud) {
            palabraLarga = palabra
            longitud = palabra.length
        }
    }

    return palabraLarga
}

fun contarLetras(palabra: String): Int {
    return palabra.length
}

fun main() {
    val frase = pedir_Frase()
    val palabra = palabraLarga(frase)
    val cantidadLetras = contarLetras(palabra)

    println("La palabra más larga es: $palabra y contiene $cantidadLetras letras")
}
