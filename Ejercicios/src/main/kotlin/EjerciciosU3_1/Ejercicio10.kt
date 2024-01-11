package EjerciciosU3_1

fun guardarPrecios(): List<Int> {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)
    return precios
}

fun mostrarPrecios(precios: List<Int>) {
    val maximo = precios.maxOrNull()
    val minimo = precios.minOrNull()

    println("El precio más alto es $maximo y el precio más bajo es $minimo")
}

fun main() {
    val precios = guardarPrecios()
    mostrarPrecios(precios)
}
