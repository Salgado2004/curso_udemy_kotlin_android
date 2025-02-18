package business

import model.Convite

class ConviteBusiness {

    fun validaTipo(tipo: String) = tipo == "comum" || tipo == "premium" || tipo == "luxo"

    fun validaCodigo(convite: Convite) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")

        "luxo", "premium" -> convite.codigo.startsWith("xl")

        else -> false
    }
}