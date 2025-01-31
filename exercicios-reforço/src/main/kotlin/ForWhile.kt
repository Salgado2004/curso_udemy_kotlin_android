/*
    # For
    1. Imprima os números de 1 a 50 na mesma linha em ordem crescente.
    2. Imprima os números de 1 a 50 na mesma linha em ordem decrescente.
    3. Usando a resolução do exercício 1, não imprima os números múltiplos de 5
    4. Faça a soma de todos os números no intervalo de 1 a 500
    5. Escreva um programa capaz de receber um número inteiro N e imprimir uma escala de tamanho N usando o caracter #
    # While
    1. Considere uma caixa d'água de 2 mil litros. Rômulo gostaria de encher a caixa d'água com balões de água de 7 litros. Quantos balões cabem na caixa sem que o volume seja excedido?
    2. FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
        a. Quando um número for divisível por 3, imprimir Buzz
        b. Quando um número for divisível por 5, imprimir Fizz
        c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz
    3. Escreva um programa capaz de receber um texto e imprimi-lo invertido
    4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres 'x' e 'o' e retorna true ou false. Caso não exista nem 'x' nem 'o', retornar false
*/

fun main() {
    // for #1
    for (i in 1..50)
        print("$i ")

    println()

    // for #2
    for (i in 50 downTo 1)
        print("$i ")

    println()

    // for #3
    for (i in 1..50) {
        if (i % 5 == 0)
            continue
        print("$i ")
    }

    println()

    // for #4
    var soma = 0
    for(i in 1..50){
        soma+=i
    }
    println("Soma de 1 a 500: $soma")

    // for #5
    piramide("5")

    // while #1
    var caixaDagua = 0
    var baloes = 0
    while(caixaDagua + 7 < 2000){
        caixaDagua += 7
        baloes++
    }
    println("Cabem $baloes balões sem exceder o volume da caixa d'água")

    // while #2
    var i = 0
    while (i <= 50){
        i++
        print(" $i ")
        if (i% 5 == 0){
            print("Fizz")
        }
        if (i % 3 == 0) {
            print("Buzz")
        }
    }
    println()

    // while #3
    val texto = "Meu nome é Julius."
    i = texto.length-1
    while(i >= 0){
        print("${texto[i]}")
        i--
    }
    println()

    // while #4
    println(verificadorString("xxooox"))
    println(verificadorString("wdsfgkdnowsid"))
    println(verificadorString("xxxxo"))
    println(verificadorString("oooooooooxzzzzzz"))
}

fun piramide(entrada: String) {
    val n = entrada.toInt()
    for(i in 1..n){
        for(j in 1..i)
            print("#")
        println()
    }
}

fun verificadorString(texto: String): Boolean {
    var i = 0
    var countX = 0
    var countO = 0
    while(i < texto.length){
        if (texto[i] == 'x' || texto[i] == 'X')
            countX++
        if (texto[i] == 'o' || texto[i] == 'O')
            countO++
        i++
    }
    if (countO == 0 && countX == 0)
        return false

    return countX == countO
}
