package EjerciciosU2_2

fun pedirEdad(): Int {
    print("Introduce tu edad: ")
    var edad: Int?

    do {
        val input = readln()
        edad = input?.toInt()

        if (edad == null) {
            println("Error, edad no válida")
            print("Introduce tu edad: ")
        }

    } while (edad == null)

    return edad
}

fun mostrarNumeros(edad: Int) {
    var cont = 1

    for (i in 1..edad) {
        print("$cont ")
        cont++
    }
}

fun main() {
    val edad = pedirEdad()
    mostrarNumeros(edad)
}
