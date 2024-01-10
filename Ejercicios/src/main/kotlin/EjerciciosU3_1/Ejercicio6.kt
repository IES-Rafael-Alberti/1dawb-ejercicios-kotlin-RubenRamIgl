package EjerciciosU3_1

fun pedirAsignaturas(): MutableList<String> {
    val asignaturas = mutableListOf<String>()
    var salir = false

    while (!salir) {
        print("Introduce una asignatura (no introducir nada para salir): ")
        val asignatura = readLine()

        if (asignatura == "") {
            salir = true
        } else {
            asignaturas.add(asignatura!!)
        }
    }

    return asignaturas
}

fun pedirNotas(asignaturas: List<String>): List<Double> {
    val notas = mutableListOf<Double>()
    val asignaturasAprobadas = mutableListOf<String>()

    for (i in asignaturas.indices) {
        print("${asignaturas[i]}: ")
        val nota = readln().toDouble()
        notas.add(nota)

        if (nota >= 5.0) {
            asignaturasAprobadas.add(asignaturas[i])
        }
    }

    val nuevasAsignaturas = mutableListOf<String>()
    nuevasAsignaturas.addAll(asignaturasAprobadas)

    return notas
}

fun mostrarDatos(asignaturas: List<String>, notas: List<Double>) {
    for (i in asignaturas.indices) {
        println("En ${asignaturas[i]} has sacado un ${notas[i]}")
    }
}

fun main() {
    val asignaturas = pedirAsignaturas()
    val notas = pedirNotas(asignaturas)

    mostrarDatos(asignaturas, notas)
}
