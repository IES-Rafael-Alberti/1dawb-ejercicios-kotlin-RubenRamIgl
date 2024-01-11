package EjerciciosU3_2

fun crearDiccionario(): Map<String, Float> {
    val mapa = mapOf("Plátano" to 1.35f, "Manzana" to 0.80f, "Pera" to 0.85f, "Naranja" to 0.70f)
    return mapa
}

fun pedirDatos(diccionario: Map<String, Float>) {
    var salir = false

    while (!salir) {
        print("Introduce una fruta (no introducir nada para salir): ")
        var fruta = readln()

        if (fruta.isEmpty()) {
            salir = true
        } else {
            print("Introduce los kilos: ")
            var kilos = readln().toFloat()

            try {
                if (fruta in diccionario) {
                    val precio = diccionario[fruta]?.times(kilos.toFloat())
                    println("El precio de $kilos kilos de $fruta es: $precio")
                } else {
                    println("La fruta no está en el diccionario")
                }
            } catch (e: NumberFormatException) {
                println("Error, introduce un número de kilos válido")
            }
        }
    }
}

fun main() {
    val diccionario = crearDiccionario()
    pedirDatos(diccionario)
}
