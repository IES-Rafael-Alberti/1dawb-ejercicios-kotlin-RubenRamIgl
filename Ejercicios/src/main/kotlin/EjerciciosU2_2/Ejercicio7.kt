package EjerciciosU2_2

fun imprimirTablas() {
    val tablas = 10

    var cont = 0

    while (cont <= tablas) {
        for (cont2 in 0..tablas) {
            println("$cont x $cont2 = ${cont * cont2}")
        }
        cont++
        println("\n")
    }
}

fun main() {
    imprimirTablas()
}
