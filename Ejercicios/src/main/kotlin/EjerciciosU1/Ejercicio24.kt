package EjerciciosU1

fun pedirPr(): Float {
    println("Introduce un precio: ")
    var pr = readln().toFloat()

    return pr
}

fun separarPr(pr: Float) {
    val prSeparado = pr.toString().split(".")
    val e = prSeparado[0]
    val c = prSeparado[1]

    println("El precio es ,${e} euros y %2.f".format(c) + " céntimos")
}

fun main() {
    var pr = pedirPr()

    separarPr(pr)
}



