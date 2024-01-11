package EjerciciosU1

fun pedirPrecio(): Float {
    print("Introduce el precio completo del producto: ")
    val total = readln().toFloat()

    return total
}

fun iva(total: Float) {
    val valorIva = total * 10 / 100
    val valorProducto = total - valorIva

    println(
        "El IVA pagado (10%) es de %.2f".format(valorIva) + " euros " +
                "y el importe sin IVA es de %.2f".format(valorProducto) + " euros"
    )
}

fun main() {
    val total = pedirPrecio()
    iva(total)
}