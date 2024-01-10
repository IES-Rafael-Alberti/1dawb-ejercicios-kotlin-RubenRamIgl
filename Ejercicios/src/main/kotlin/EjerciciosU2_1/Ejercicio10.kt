package EjerciciosU2_1

fun pedirTipo(): String {
    print("La pizza es vegetariana? (si/no): ")
    val respuesta = readln()
    return respuesta
}

fun pedirIngredientes(tipo: String): Pair<String, String> {
    var pizza: String
    var ingrediente = readln()

    if (tipo.toLowerCase() == "si") {
        var salir = false
        pizza = "vegetariana"
        println("Ingredientes vegetarianos: Pimiento y tofu")

        while (!salir) {
            print("Elige un ingrediente: ")
            ingrediente = readln().toLowerCase()

            if (ingrediente == "pimiento" || ingrediente == "tofu") {
                salir = true
            } else {
                println("Error, introduce un ingrediente correcto")
            }
        }
    } else {
        var salir = false
        pizza = "no vegetariana"
        println("Ingredientes no vegetarianos: Peperoni, jamón y salmón")

        while (!salir) {
            print("Elige un ingrediente: ")
            ingrediente = readln().toLowerCase()

            if (ingrediente == "peperoni" || ingrediente == "jamón" || ingrediente == "salmón") {
                salir = true
            } else {
                println("Error, introduce un ingrediente correcto")
            }
        }
    }

    return Pair(pizza, ingrediente)
}

fun main() {
    val tipo = pedirTipo()
    val (pizza, ingrediente) = pedirIngredientes(tipo)
    println("Su pizza es $pizza y sus ingredientes son mozzarella, tomate y $ingrediente")
}
