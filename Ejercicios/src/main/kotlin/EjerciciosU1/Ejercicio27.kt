package EjerciciosU1

fun nombreProducto(): String {
    println("Introduce el nombre del producto: ")
    val producto = readln()

    return producto
}

fun precioProducto(): Float {
    println("Introduce el precio del producto: ")
    val precio = readln().toFloat()

    return precio
}

fun unidadesProdcuto(): Int {
    println("Introduce las unidades del producto: ")
    val unidades = readln().toInt()

    return unidades
}

fun totalProducto(precio: Float, unidades: Int): Float {
    val precioTotal = precio * unidades

    return precioTotal
}

fun mostrarDatos(nombre: String, precio: Float, unidades: Int, precioTotal: Float) {
    val formato = "%s Precio: %,9.2f Número de unidades: %03d Precio total: %,11.2f"
    val resultado = formato.format(nombre, precio, unidades, precioTotal)
    println(resultado)
}

fun main() {
    val nombre = nombreProducto()
    val precio = precioProducto()
    val unidades = unidadesProdcuto()
    val precioTotal = totalProducto(precio, unidades)

    mostrarDatos(nombre, precio, unidades, precioTotal)
}