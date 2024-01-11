package EjerciciosU3_3

fun obtenerNombres(): Pair<Set<String>, Set<String>> {
    val nombresPrimaria = mutableSetOf<String>()
    val nombresSecundaria = mutableSetOf<String>()
    var salir = false

    println("Introduce los nombres de los alumnos de primaria (no introducir nada para finalizar):")
    while (!salir) {
        print("Introduce el nombre del alumno: ")
        val nombrePrimaria = readln()
        if (nombrePrimaria.isEmpty()) {
            salir = true
        }
        nombresPrimaria.add(nombrePrimaria)
    }

    var salir2 = false

    println("Introduce los nombres de los alumnos de secundaria (no introducir nada para finalizar):")
    while (!salir2) {
        print("Introduce el nombre del alumno: ")
        val nombreSecundaria = readln()
        if (nombreSecundaria.isEmpty()) {
            salir2 = true
        }
        nombresSecundaria.add(nombreSecundaria)
    }

    return nombresPrimaria to nombresSecundaria
}

fun mostrarResultados(nombresPrimaria: Set<String>, nombresSecundaria: Set<String>) {
    println("Nombres de todos los alumnos sin repeticiones:")
    val nombreAlumnos = nombresPrimaria.union(nombresSecundaria)
    println(nombreAlumnos)

    println("Nombres que se repiten entre los alumnos de primaria y secundaria:")
    val nombresRepetidos = nombresPrimaria.intersect(nombresSecundaria)
    println(nombresRepetidos)

    println("Nombres de primaria que no se repiten en secundaria:")
    val nombresNoRepetidos = nombresPrimaria.subtract(nombresSecundaria)
    println(nombresNoRepetidos)

    println("¿Todos los nombres de primaria están incluidos en secundaria?")
    val todosIncluidos = nombresSecundaria.containsAll(nombresPrimaria)
    println(todosIncluidos)
}

fun main() {
    val (nombresPrimaria, nombresSecundaria) = obtenerNombres()
    mostrarResultados(nombresPrimaria, nombresSecundaria)
}
