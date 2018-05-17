package fundamentos

fun main(args: Array<String>) {
    //Tipos Númericos

    //Inteiros
    //Byte 8 Bits (-128 a 127)
    val x1: Byte = -128;
    println(Long.MIN_VALUE)
    println(Long.MAX_VALUE)

    //x1 > 128 : Error: Kotlin: The integer literal does not conform to the expected type Byte

    //Short 16 Bits (-32768 a 32767)
    val x2: Short = 32767;

    //Int 32 Bits (- 2_147_483_648 a 2_147_483_647)
    val x3: Int = 2_147_483_647;

    //Long 64 Bits
    val x4: Long = 9223372036854775807

    //Reais

    //Float 32 Bits
    val x5: Float = 3.14F

    //Double 64 Bits
    val x6: Double = 3.14

    //Caractere
    val x7: Char = 'A' // '2', 'x', '^'

    //Booleano
    val x8: Boolean = false
    println(x8.not())
    println(x8.and(true))
    println(x8.or(true))
    println(x8.xor(true))

    //Imprime todos os valores
    println(listOf(x1, x2, x3, x4, x5, x6, x7, x8))

    println(10 is Int)
    println(100000000000 is Long)
    println(1.0 is Double)

    //Tudo é objeto, acessar métodos de uma classe em um literal
    //Decrementa em 1.0 o número
    println(3.40.dec())


}