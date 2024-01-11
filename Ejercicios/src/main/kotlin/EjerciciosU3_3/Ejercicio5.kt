package EjerciciosU3_3

fun numeros(): Triple<Set<Int>, Set<Int>, Set<Int>> {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }.toSet()

    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()

    val paresYMultiplosDeTres = pares intersect multiplosDeTres

    return Triple(pares, multiplosDeTres, paresYMultiplosDeTres)
}

fun imprimirResultados(pares: Set<Int>, multiplosDeTres: Set<Int>, paresYMultiplosDeTres: Set<Int>) {
    println("Conjunto de números pares: $pares")
    println("Conjunto de números múltiplos de tres: $multiplosDeTres")
    println("Intersección entre pares y múltiplos de tres: $paresYMultiplosDeTres")
}

fun main() {
    val (pares, multiplosDeTres, paresYMultiplosDeTres) = numeros()

    imprimirResultados(pares, multiplosDeTres, paresYMultiplosDeTres)
}
