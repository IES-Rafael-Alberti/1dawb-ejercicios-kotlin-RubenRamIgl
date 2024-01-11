package EjerciciosU3_2

fun pedirDatos() {
    val diccionario = mutableMapOf<String, String>()
    var salir = false

    while (!salir) {
        print("Nombre: ")
        val nombre = readln()
        print("Edad: ")
        val edad = readln()
        print("Sexo: ")
        val sexo = readln()
        print("Teléfono: ")
        val telefono = readln()
        print("Correo electrónico: ")
        val correo = readln()

        diccionario["Nombre"] = nombre
        diccionario["Edad"] = edad
        diccionario["Sexo"] = sexo
        diccionario["Teléfono"] = telefono
        diccionario["Correo electrónico"] = correo

        println("Contenido del diccionario:")
        for ((clave, valor) in diccionario) {
            println("$clave: $valor")
        }

        salir = true
    }
}

fun main() {
    pedirDatos()
}
