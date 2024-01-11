package EjerciciosU3_3

fun datosClientes(listaCompras: List<Triple<String, Int, Double>>): Set<String> {
    val domicilios = mutableSetOf<String>()

    for (compra in listaCompras) {
        domicilios.add(compra.third.toString())
    }

    return domicilios
}

fun main() {
    val listaCompras = listOf(
            Triple("Nuria Costa", 5, 12780.78),
            Triple("Jorge Russo", 7, 699.0),
            Triple("Nuria Costa", 7, 532.90),
            Triple("Julián Rodriguez", 12, 5715.99),
            Triple("Jorge Russo", 15, 958.0)
    )

    val domiciliosClientes = datosClientes(listaCompras)

    println("Domicilios a los que se debe enviar una factura:")
    for (domicilio in domiciliosClientes) {
        println(domicilio)
    }
}
