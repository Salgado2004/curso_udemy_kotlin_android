/*
    Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os funcionários
    a poupares dinheiro para a aposentadoria que funciona da seguinte maneira:
    Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Este fundo de
    investimento possui rendimento de 0,2% ao mês.

    Ana adorou a ideia e vai investir. No entando, Paula decidiu que vai investir os mesmos 5% por conta própria já que
    conhece investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.

    Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e que
    estão investindo 5% do seu salário. Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?
 */

fun main() {
    val salario = 10000f
    var meses = 0
    var saldoAna = 0f
    var saldoPaula = 0f

    while (saldoPaula <= saldoAna){
        saldoAna = rende(saldoAna + 2 * (salario * 0.05f), 0.002f)
        saldoPaula = rende(saldoPaula + (salario * 0.05f), 0.008f)
        meses++
        println("Mês $meses - Paula: R$$saldoPaula x Ana: R$$saldoAna")
    }
}

fun rende(saldo: Float, rendimento: Float): Float {
    return saldo*rendimento + saldo
}