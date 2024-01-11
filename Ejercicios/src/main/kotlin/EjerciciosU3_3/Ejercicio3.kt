package EjerciciosU3_3

fun conjuntoPotencia(s: Set<Int>): List<Set<Int>> {
    val listaS = s.toList()
    val n = listaS.size

    val potencia = mutableListOf<Set<Int>>()
    for (i in 0 until Math.pow(2.0, n.toDouble()).toInt()) {
        val subset = mutableSetOf<Int>()
        for (j in 0 until n) {
            if ((i / Math.pow(2.0, j.toDouble())).toInt() % 2 == 1) {
                subset.add(listaS[j])
            }
        }
        potencia.add(subset)
    }

    return potencia
}

fun main() {
    val conjunto = setOf(6, 1, 4)
    val resultado = conjuntoPotencia(conjunto)

    println("Conjunto potencia de $conjunto:")
    for (subset in resultado) {
        println(subset)
    }
}
