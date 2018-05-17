package fundamentos

//Função sem retorno
fun mostrarSoma(x1: Int, x2: Int) {
    println(x1 + x2)
}

//Função com retorno
fun somar(x1: Int, x2: Int = 1) : Int {
    return x1 + x2
}

fun main(args: Array<String>) {
    mostrarSoma(2, 5)
    println(somar(1, 8))
    println(somar(4))
}