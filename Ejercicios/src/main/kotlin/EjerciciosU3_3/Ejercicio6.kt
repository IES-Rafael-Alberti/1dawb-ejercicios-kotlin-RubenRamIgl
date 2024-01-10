package EjerciciosU3_3

fun funcionLetras() {
    val alfabeto = ('a'..'z').toSet()
    val vocales = setOf("a", "e", "i", "o", "u")

    val consonantes = alfabeto - vocales

    val letrasComunes = vocales intersect consonantes

    println("Conjunto de consonantes: $consonantes")
    println("Conjunto de letras comunes: $letrasComunes")
}

fun main() {
    funcionLetras()
}
