package controller

import business.ConviteBusiness
import model.Convite

class Portaria {

    private val conviteBusiness = ConviteBusiness()

    init {
        println("Inicializando Portaria")
        val controle = this.controle()
        println(controle)
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")
        if (idade < 18){
            return "Negado. Menores de idade não são permitidos"
        }

        val tipoConvite = Console.readString("Qual é o tipo do convite? ")
        if (!conviteBusiness.validaTipo(tipoConvite)){
            return "Negado. Tipo do convite inválido"
        }

        val codigoConvite = Console.readString("Qual é o código do convite? ")
        val convite = Convite(tipoConvite, codigoConvite)
        if (!conviteBusiness.validaCodigo(convite)){
            return "Negado. Código do convite inválido"
        }

        return "Welcome! :)"
    }
}