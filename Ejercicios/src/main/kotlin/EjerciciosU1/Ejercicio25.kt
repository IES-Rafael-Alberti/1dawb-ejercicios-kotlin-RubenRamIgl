package EjerciciosU1

fun pedirFecha(): String {
    println("Introduce una fecha(dd/mm/aaaa): ")
    val fecha = readln()

    return fecha
}

fun fechaSeparada(fecha: String) {
    val partesFecha = fecha.split("/")

    println("El día es ${partesFecha[0]}, el mes es ${partesFecha[1]}, y el año es ${partesFecha[2]}")
}

fun main() {
    val fecha = pedirFecha()

    fechaSeparada(fecha)
}