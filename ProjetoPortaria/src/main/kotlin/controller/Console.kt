package controller

class Console private constructor() {
    companion object {
        fun readInt(mensagem: String): Int {
            do {
                print(mensagem)
                val input = readln();
                try {
                    val num = input.toInt();
                    if (num > 0)
                        return num
                    throw IllegalArgumentException()
                } catch (ex: IllegalArgumentException) {
                    println("Valor informado inválido.")
                }
            } while (true)
        }

        fun readString(mensagem: String): String {
            do {
                print(mensagem)
                val input = readln();
                try {
                    if (input != "")
                        return input.lowercase()
                    throw IllegalArgumentException()
                } catch (ex: IllegalArgumentException) {
                    println("Valor informado inválido.")
                }
            } while (true)
        }
    }
}