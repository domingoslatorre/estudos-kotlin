package fundamentos

fun main(args: Array<String>) {
    val alunos = listOf("John", "Gabi", "Melissa")

    //Forma concatenada
    println("Alunos da lista: " + alunos[0] + ", " + alunos[1] + ", " + alunos[2])

    //Template String
    println("Alunos da lista: ${alunos[0]}, ${alunos[1]}, ${alunos[2]}")


    val maiorDeIdade = false

    println("Você ${if(maiorDeIdade) "" else "não " }pode tirar a CNH")
}