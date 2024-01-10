package EjerciciosU2_2

fun pedirNumeros(): Int {
    var n: String

    while (true) {
        print("Introduce un número (0 para salir): ")
        n = readln()

        if (n.all { it.isDigit() } && n.isNotEmpty()) {
            if (n.toInt() == 0) {
                break
            }
            return n.toInt()
        } else {
            println("Error, número no válido")
        }
    }

    return 0
}



fun sumarNumeros(): Int {
    var suma = 0
    var salir=false

    while (!salir) {
        val n = pedirNumeros()
        if (n != 0) {
            suma += n
        } else {
            salir=true
        }
    }
    return suma
}

fun main() {
    println("La suma de los números positivos es: " + sumarNumeros())
}
