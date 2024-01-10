package EjerciciosU3_3

fun funcionFrutas(frutas1: List<String>, frutas2: List<String>): Triple<Set<String>, Set<String>, Set<String>> {
    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    val frutasComunes = setFrutas1 intersect setFrutas2
    val frutasSoloEnFrutas1 = setFrutas1 subtract setFrutas2
    val frutasSoloEnFrutas2 = setFrutas2 subtract setFrutas1

    return Triple(frutasComunes, frutasSoloEnFrutas1, frutasSoloEnFrutas2)
}

fun main() {
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    val (frutasComunes, frutasSoloEnFrutas1, frutasSoloEnFrutas2) = funcionFrutas(frutas1, frutas2)

    println("Conjunto de frutas comunes: $frutasComunes")
    println("Conjunto de frutas solo en frutas1: $frutasSoloEnFrutas1")
    println("Conjunto de frutas solo en frutas2: $frutasSoloEnFrutas2")
}
