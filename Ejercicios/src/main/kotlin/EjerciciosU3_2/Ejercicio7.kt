package EjerciciosU3_2

fun crearCesta(): Map<String, Float> {
    val cesta = mutableMapOf<String, Float>()
    var salir = false

    while (!salir) {
        print("Introduce un artículo (no introducir nada para terminar): ")
        val articulo = readln()

        if (articulo.isEmpty()) {
            salir = true
        } else {
            print("Introduce su precio: ")
            val precio = readln().toFloat()
            cesta[articulo] = precio
        }
    }

    return cesta
}

fun mostrarCesta(cesta: Map<String, Float>) {
    println("Lista de la compra:")
    var total = 0.0

    for ((articulo, precio) in cesta) {
        println("$articulo: $precio euros")
        total += precio
    }

    println("Coste total: $total euros")
}

fun main() {
    val cestaCompra = crearCesta()
    mostrarCesta(cestaCompra)
}
