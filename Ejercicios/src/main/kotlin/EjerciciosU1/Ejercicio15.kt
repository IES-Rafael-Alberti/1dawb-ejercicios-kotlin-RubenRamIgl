package EjerciciosU1

fun pedirCapital(): Float {
    println("Introduce una cantidad de dinero: ")
    val capital = readln().toFloat()

    return capital
}

fun intereses(capital: Float) {
    println("Los ahorros con el interés añadido durante el primer año es: %.2f".format(((capital * (1 + 1 * 0.04)))))
    println("Los ahorros con el interés añadido durante el segundo año es:  %.2f".format(((capital * (1 + 2 * 0.04)))))
    println("Los ahorros con el interés añadido durante el tercer año es:  %.2f".format(((capital * (1 + 3 * 0.04)))))
}

fun main() {
    val capital = pedirCapital()

    intereses(capital)
}