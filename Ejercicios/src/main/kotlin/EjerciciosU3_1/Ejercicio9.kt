package EjerciciosU3_1

fun pedir_Palabra(): String {
    print("Introduce una palabra: ")
    val palabra = readln()
    return palabra
}

fun contarVocales(palabra: String): List<Int> {
    var cuenta_a = 0
    var cuenta_e = 0
    var cuenta_i = 0
    var cuenta_o = 0
    var cuenta_u = 0

    for (letra in palabra) {
        val letraMin = letra.toLowerCase()

        when (letraMin) {
            'a' -> cuenta_a++
            'e' -> cuenta_e++
            'i' -> cuenta_i++
            'o' -> cuenta_o++
            'u' -> cuenta_u++
        }
    }

    return listOf(cuenta_a, cuenta_e, cuenta_i, cuenta_o, cuenta_u)
}

fun main() {
    val palabra = pedir_Palabra()
    val (cuenta_a, cuenta_e, cuenta_i, cuenta_o, cuenta_u) = contarVocales(palabra)

    println("La vocal a aparece $cuenta_a veces.")
    println("La vocal e aparece $cuenta_e veces.")
    println("La vocal i aparece $cuenta_i veces.")
    println("La vocal o aparece $cuenta_o veces.")
    println("La vocal u aparece $cuenta_u veces.")
}
