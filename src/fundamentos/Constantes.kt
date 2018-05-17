package fundamentos

fun main(args: Array<String>) {

    //val - prefixo de valor (constante)

    val x: Int  //Definindo tipo
    x = 3 //Atribuindo valor

    val y: Int = 10 //Definindo tipo e atribuindo valor

    val z = 18; //Atribuindo valor (tipo inferido)

    //Cuidados
    //x = 8  Erro. Valor de uma constante não pode ser modificado
    //Error: Kotlin: Val cannot be reassigned

    //Podemos acessar constantes do Java
    println(Math.PI)

    //Calcular a área de uma circunferência
    val raio = 12.00
    val area = raio * raio * Math.PI

    println(area)


}