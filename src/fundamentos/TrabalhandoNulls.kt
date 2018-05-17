package fundamentos

fun main(args: Array<String>) {
    var x: Int? = null //safe call operator

    //Não é necessário se preocupar com Null Pointer Exceptions
    println(x?.dec())

    //Quero acessar mesmo que null
    //println(x!!.dec())

    //Elvis operator
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão"
    println(obrigatorio)

    val macarao: String? = "Penne"
    val molho: String? = null
    println("Macarrão selecionado: ${macarao ?: "Espaguete"}")
    println("Molho selecionado: ${molho ?: "Tomate"}")

}