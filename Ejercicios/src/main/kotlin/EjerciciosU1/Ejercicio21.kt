package EjerciciosU1

class Reves {
    fun pedirFrase(): String {
        println("Introduce una frase: ")
        val frase = readln()

        return frase
    }

    fun reves(frase: String) {
        val fraseReves = frase.reversed()

        println(fraseReves)
    }
}

fun main() {
    val Reves = Reves()

    val frase = Reves.pedirFrase()

    Reves.reves(frase)
}
