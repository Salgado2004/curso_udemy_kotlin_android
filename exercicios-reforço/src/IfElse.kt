/*
    1. Escreve um programa capaz de ler dois números inteiros que representam os lados de uma figura geométrica. Informar se formam um quadrado
    2. Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar se é um triângulo equilátero
    4. Escreva um programa para ser usado na portaria de um evento
        a. Peça a idade. Menores de idade não são permitidos. Mensagem: "Negado. Menores de idade não são permitidos"
        b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum destes. Mensagem: "Negado. Convite inválido"
        c. Peça o código do convite. Convites premium e luxo começam com "XL". Convites comuns começam com "XT". Caso o código não esteja nos padrões, negar a entrada. Mensagem: "Negado. Convite inválido"
        d. Caso todos os critérios sejam satisfeitos, exibir "Welcome :)"
 */

fun main() {
    println("Escolha o exercício: (1, 2 ou 4)")
    when (readln().trim()) {
        "1" -> quadrado()
        "2" -> triangulo()
        "4" -> portaria()
        "else" -> println("Opção inválida")
    }
}

fun quadrado() {
    println("Informe dois números inteiros que representam os lados de uma figura geométrica: ")
    val l1 = readln().toInt()
    val l2 = readln().toInt()
    if (l1 == l2)
        println("Os lados formam um quadrado")
    else
        println("Os lados formam um retângulo")
}

fun triangulo() {
    println("Informe três números inteiros que representam os lados de um triângulo: ")
    val l1 = readln().toInt()
    val l2 = readln().toInt()
    val l3 = readln().toInt()
    if (l1 == l2 && l1 == l3)
        println("É um triângulo equilátero")
    else if (l1 == l2 || l1 == l3 || l2 == l3)
        println("É um triângulo isóceles")
    else
        println("É um triângulo escaleno")
}

fun portaria() {
    println("Informe sua idade: ")
    val idade = readln().toInt()
    var mensagem = "Negado. Convite inválido"

    if (idade < 18) {
        mensagem = "Negado. Menores de idade não são permitidos"
    } else {
        println("Informe o tipo do seu convite")
        val tipo = readln().trim()
        println("Informe o código do seu convite")
        val cod = readln().trim()
        when (tipo) {
            "premium", "luxo" ->
                if (cod.startsWith("XL"))
                    mensagem = "Welcome :)"

            "comum" ->
                if (cod.startsWith("XT"))
                    mensagem = "Welcome :)"
        }
    }

    println(mensagem)
}