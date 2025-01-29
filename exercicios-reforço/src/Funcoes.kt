/*
    1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.
    Ex. Saída desejada:
        - 2 anos equivalem a: 24 meses, 730 dias, 17520 horas, 1051200 minutos, 63072000 segundos

    2. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres
    3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)
    4. Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6 km)
    5. Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x"
    6. Sobre as funções criadas nos exercícios 2, 3, e 4. É possível transformá-las em funções de uma única linha? Se sim, transforme-as
 */

fun main() {
    tempoDeUmAno(2)
    println(lenght("abcdefghijklmnopqrstuvwxyz"))
    println(cubo(2))
    println("1 milha é igual a ${conversorToKm(1f)} km")
    println(stringSwitcher("Casinha Amarelinha"))
}

fun tempoDeUmAno(anos: Int) {
    val meses = anos * 12
    val dias: Int = (anos * 365) + anos / 4
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos anos equivalem a: $meses meses, $dias dias, $horas horas, $minutos minutos, $segundos segundos")
}

fun lenght(str: String) = str.length

fun cubo(n: Int) = n * n * n

fun conversorToKm(milha: Float) = milha * 1.6f

fun stringSwitcher(str: String) = str.replace("a", "x", true).lowercase()