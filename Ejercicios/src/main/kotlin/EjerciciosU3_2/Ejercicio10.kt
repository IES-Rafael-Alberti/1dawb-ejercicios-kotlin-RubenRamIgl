package EjerciciosU3_2

fun mostrarMenu() {
    println("Menú:")
    println("1. Añadir cliente")
    println("2. Eliminar cliente")
    println("3. Mostrar cliente")
    println("4. Listar todos los clientes")
    println("5. Listar clientes preferentes")
    println("6. Terminar")
}

fun añadirCliente(baseDatos: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce el NIF del cliente: ")
    val nif = readln()
    print("Introduce el nombre del cliente: ")
    val nombre = readln()
    print("Introduce la dirección del cliente: ")
    val direccion = readln()
    print("Introduce el teléfono del cliente: ")
    val telefono = readln()
    print("Introduce el correo del cliente: ")
    val correo = readln()
    print("¿Es cliente preferente? (si/no): ")
    val preferente = readln().toLowerCase() == "si"

    val cliente: MutableMap<String, Any> = mutableMapOf(
            "nombre" to nombre,
            "direccion" to direccion,
            "telefono" to telefono,
            "correo" to correo,
            "preferente" to preferente
    )

    baseDatos[nif] = cliente
    println("Cliente $nombre añadido correctamente.")
}

fun eliminarCliente(baseDatos: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce el NIF del cliente a eliminar: ")
    val nif = readln()

    if (nif in baseDatos) {
        val clienteEliminado = baseDatos.remove(nif)
        println("Cliente ${clienteEliminado?.get("nombre")} eliminado correctamente.")
    } else {
        println("Cliente no encontrado en la base de datos.")
    }
}

fun mostrarCliente(baseDatos: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce el NIF del cliente a mostrar: ")
    val nif = readln()

    if (nif in baseDatos) {
        val cliente = baseDatos[nif]
        println("Datos del cliente:")
        println("NIF: $nif")
        if (cliente != null) {
            for ((clave, valor) in cliente) {
                println("${clave.capitalize()}: $valor")
            }
        }
    } else {
        println("Cliente no encontrado en la base de datos.")
    }
}

fun listarClientes(baseDatos: Map<String, MutableMap<String, Any>>) {
    println("Lista de todos los clientes:")
    for ((nif, cliente) in baseDatos) {
        println("NIF: $nif, Nombre: ${cliente["nombre"]}")
    }
}

fun listarClientesPreferentes(baseDatos: Map<String, MutableMap<String, Any>>) {
    println("Lista de clientes preferentes:")
    for ((nif, cliente) in baseDatos) {
        if (cliente["preferente"] == true) {
            println("NIF: $nif, Nombre: ${cliente["nombre"]}")
        }
    }
}

fun main() {
    val baseDatos = mutableMapOf<String, MutableMap<String, Any>>()
    var salir = false

    while (!salir) {
        mostrarMenu()
        print("Selecciona una opción (1-6): ")
        val opcion = readln()

        when (opcion) {
            "1" -> añadirCliente(baseDatos)
            "2" -> eliminarCliente(baseDatos)
            "3" -> mostrarCliente(baseDatos)
            "4" -> listarClientes(baseDatos)
            "5" -> listarClientesPreferentes(baseDatos)
            "6" -> {
                println("Programa terminado.")
                salir = true
            }
            else -> println("Opción no válida")
        }
    }
}
