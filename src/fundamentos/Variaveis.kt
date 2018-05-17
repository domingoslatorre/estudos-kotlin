package fundamentos

//Linguagem Fortemente Tipada / Tipo Inferido
fun main(args: Array<String>) {

    //var - prefixo de variável

    var x: Int //Definindo tipo

    var y = 18; //Atribuindo valor (tipo inferido)

    x = 3 //Atribuindo valor

    //Cuidados com Inferência
    //Cuidado 1
    //var z  Erro. Defina o tipo ou inicialize a variável
    //Error: Kotlin: This variable must either have a type annotation or be initialized

    //Cuidado 2
    //y = 1.5
    //Error: Kotlin: The floating-point literal does not conform to the expected type Int

    println(x + y)

}