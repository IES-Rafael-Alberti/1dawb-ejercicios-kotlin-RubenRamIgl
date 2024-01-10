package EjerciciosU2_1

fun pedirPuntuacion(): Float {
    print("Introduce la puntuación: ")
    var puntuacion = readln()
    var salir = false

    while (!salir) {
        if (puntuacion.replace(".", "").isNumeric()) {
            salir = true
        } else {
            println("El valor introducido no es válido")
            print("Introduce la puntuación: ")
            puntuacion = readln()
        }
    }

    return puntuacion.toFloat()
}

fun definirNivel(puntuacion: Float): Triple<String, Int, Float> {
    val dinero = 2400
    val extra = dinero * puntuacion
    val total = dinero + (dinero * puntuacion)
    val nivel: String

    when {
        puntuacion == 0.0f -> nivel = "Inaceptable"
        puntuacion == 0.4f -> nivel = "Aceptable"
        puntuacion >= 0.6f -> nivel = "Meritorio"
        else -> {
            println("Error, la puntuación no es válida")
            return Triple("", 0, 0f)
        }
    }

    return Triple(nivel, dinero, total)
}

fun main() {
    val puntuacion = pedirPuntuacion()

    val (nivel, dinero, total) = definirNivel(puntuacion)
    println("Tu nivel es $nivel y tu sueldo es de $dinero € con $total € de extra ($total €)")
}
