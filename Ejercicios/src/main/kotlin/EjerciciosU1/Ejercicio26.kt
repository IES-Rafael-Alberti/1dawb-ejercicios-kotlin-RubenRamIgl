package EjerciciosU1

fun pedirCompra(): String {
    println("Introduce una lista de compra separada por comas: ")
    val compra = readln()

    return compra
}

fun mostrarCompra(compra: String) {
    val listaCompra = compra.split(",")

    for (i in listaCompra) {
        println(i)
    }
}

fun main() {
    val compra = pedirCompra()

    mostrarCompra(compra)
}