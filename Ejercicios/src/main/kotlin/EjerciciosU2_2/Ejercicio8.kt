fun altura(): Int {
    print("Introduce la altura del triángulo: ")
    var n: Int?

    do {
        val input = readln()
        n = input?.toIntOrNull()

        if (n == null || n < 0) {
            println("Error, número no válido")
            print("Introduce la altura del triángulo: ")
        }

    } while (n == null || n < 0)

    return n
}

fun triangulo(n: Int) {
    for (i in 1..n) {
        for (j in (2 * i - 1) downTo 1 step 2) {
            print("$j ")
        }
        println()
    }
}

fun main() {
    val n = altura()
    triangulo(n)
}
