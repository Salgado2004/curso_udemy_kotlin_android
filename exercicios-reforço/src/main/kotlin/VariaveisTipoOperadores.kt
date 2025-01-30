/*
    a. Crie um novo arquivo com uma função main
    b. Declare uma variável mutável capaz de armazenar seu nome completo
    c. Declare uma variável de texto sem valor algum
    d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você calça
    e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000)
    f. Declare uma variável capaz de armazenar a população do Brasil (211.000.000)
    g. Imprima o valor do PIB per capita
    h. Rode seu programa de maneira que não possua erros de compilação ou execução
*/

fun main(){
    var nome: String = "Leonardo Felipe Salgado"
    var texto: String

    val numero: Byte = 39
    val pib: Long = 1869000000000
    val populacao: Int = 211000000
    println("Valor do PIB per capita do Brasil = R$${pib/populacao}")
}