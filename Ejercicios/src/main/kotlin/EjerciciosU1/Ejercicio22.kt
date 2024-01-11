package EjerciciosU1

fun pedirFrase(): String {
    println("Introduce una frase: ")
    val frase = readln()

    return frase
}

fun pedirVocal(): String {
    var salir = true
    var vocal = ""

    while (!salir) {
        println("Introduce una vocal: ")
        var vocal = readln()

        if (vocal in "aeiou") {
            return vocal
            salir = false
        } else {
            println("Introduce una vocal en minúsculas correcta")
        }
    }
    return vocal
}

fun fraseFinal(frase: String, vocal: String) {
    val fraseFinal = frase.replace(vocal, vocal.uppercase())
    println(fraseFinal)
}

fun main() {
    val frase = pedirFrase()
    val vocal = pedirVocal()

    fraseFinal(frase, vocal)
}



