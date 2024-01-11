package EjerciciosU1

fun pedirNombre(): String {
    println("Introduce tu nombre completo: ")
    val nombre = readln()

    return nombre
}

fun nombreMayuscula(nombre: String) {
    println(nombre.uppercase())
}

fun nombreMinuscula(nombre: String) {
    println(nombre.lowercase())
}

fun nombrePrimeraMayuscula(nombre: String) {
    println(nombre.capitalize())
}

fun main() {
    val nombre = pedirNombre()

    nombreMayuscula(nombre)
    nombreMinuscula(nombre)
    nombrePrimeraMayuscula(nombre)
}