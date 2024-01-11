package EjerciciosU1

fun pedirTelefono(): String {
    println("Introduce un número de teléfono con un prefijo y una extensión (+prefijo-numero-extension): ")
    val telefono = readln()

    return telefono
}

fun telefonoSolo(telefono: String) {
    val partesTelefono = telefono.split("-")

    println("El prefijo sin teléfono ni extensión es " + partesTelefono[1])
}

fun main() {
    val telefono = pedirTelefono()

    telefonoSolo(telefono)
}