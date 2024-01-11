package EjerciciosU3_2

fun crear_Diccionario(): Map<String, String> {
    print("Introduce las palabras en español e inglés separadas por dos puntos, y cada par separado por comas (ejemplo: perro:dog,gato:cat): ")
    val entradaUsuario = readln()

    val pares = entradaUsuario.split(",")
    val diccionario = mutableMapOf<String, String>()

    for (par in pares) {
        val (palabra, traduccion) = par.split(":")
        diccionario[palabra] = traduccion
    }

    return diccionario
}

fun traducirFrase(diccionario: Map<String, String>, frase: String): String {
    val palabras = frase.split(" ")
    val traduccion = mutableListOf<String>()

    for (palabra in palabras) {
        traduccion.add(diccionario.getOrDefault(palabra, palabra))
    }

    return traduccion.joinToString(" ")
}

fun main() {
    val diccionario = crear_Diccionario()

    print("Introduce una frase en español: ")
    val fraseEspanol = readln()
    val fraseTraducida = traducirFrase(diccionario, fraseEspanol)

    println("Frase traducida: $fraseTraducida")
}
