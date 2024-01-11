package EjerciciosU2_1

fun pedirContraseña(): String {
    print("Introduce una contraseña: ")
    val contraseña=readln()
    return contraseña
}

fun validarContrasena(): String {
    print("Introduce de nuevo la contraseña: ")
    val contraseña=readln()
    return contraseña
}

fun sonIguales(contrasena: String, pregunta: String): Boolean {
    return contrasena.equals(pregunta, ignoreCase = true)
}

fun main() {
    val contrasena = pedirContraseña()
    val pregunta = validarContrasena()

    if (sonIguales(contrasena, pregunta)) {
        println("La contraseña es correcta")
    } else {
        println("La contraseña es incorrecta")
    }
}
