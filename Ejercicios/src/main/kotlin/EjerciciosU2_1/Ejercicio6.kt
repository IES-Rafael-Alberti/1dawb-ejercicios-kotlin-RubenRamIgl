package EjerciciosU2_1

fun pedirNombre(): String {
    print("Introduce tu nombre: ")
    val nombre = readln()
    return nombre
}

fun pedirSexo(): String {
    var sexo: String
    do {
        print("Introduce tu sexo (M/F): ")
        sexo = readln()?.toUpperCase().toString()
    } while (sexo != "M" && sexo != "F")

    return sexo
}

fun asignarGrupo(nombre: String, sexo: String): String {
    val inicialNombre = nombre.substring(0, 1).toUpperCase()
    var grupo = ""

    if ((inicialNombre < "M" && sexo == "F") || (inicialNombre > "N" && sexo == "M")) {
        grupo = "A"
    } else {
        grupo = "B"
    }

    return grupo
}

fun main() {
    val nombre = pedirNombre()
    val sexo = pedirSexo()

    println("Estás en el grupo ${asignarGrupo(nombre, sexo)}.")
}
