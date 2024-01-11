package EjerciciosU3_2

fun pedirAsignaturas(): Map<String, Int> {
    var asignaturas = mutableMapOf<String, Int>()
    var salir = false

    while (!salir) {
        print("Introduce una asignatura (no introducir nada para salir): ")
        var asignatura = readln()

        if (asignatura.isEmpty()) {
            salir = true
        } else {
            print("Introduce su número de créditos: ")
            var creditos = readln().toInt()

            asignaturas[asignatura] = creditos
        }
    }

    return asignaturas
}

fun mostrarCreditos(asignaturas: Map<String, Int>) {
    var totalCreditos = 0

    for ((asignatura, creditos) in asignaturas) {
        println("$asignatura tiene $creditos créditos")
        totalCreditos += creditos
    }

    println("El número total de créditos del curso es: $totalCreditos")
}

fun main() {
    val asignaturas = pedirAsignaturas()
    mostrarCreditos(asignaturas)
}
