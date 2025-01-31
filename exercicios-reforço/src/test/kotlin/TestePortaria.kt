import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestePortaria {

    @Test
    @DisplayName("Valida idade < 18")
    fun validaMenorIdade(){
        Assertions.assertEquals(portaria2(17, "comum", "XT456" ), "Negado. Menores de idade não são permitidos")
    }

    @Test
    @DisplayName("Valida tpConvite 'banana'")
    fun validaTpConviteErrado(){
        Assertions.assertEquals(portaria2(21, "banana", "XT234"), "Negado. Convite inválido")
    }

    @Test
    @DisplayName("Valida convite 'comum' com cod incorreto")
    fun validaConviteComumCodErrado(){
        Assertions.assertEquals(portaria2(21, "comum", "abc"), "Negado. Convite inválido")
    }
    @Test
    @DisplayName("Valida convite 'luxo' com cod incorreto")
    fun validaConviteLuxoCodErrado(){
        Assertions.assertEquals(portaria2(21, "luxo", "abc"), "Negado. Convite inválido")
    }
    @Test
    @DisplayName("Valida convite 'comum' com cod correto")
    fun validaConviteComumCodCerto(){
        Assertions.assertEquals(portaria2(21, "comum", "XT456"), "Welcome :)")
    }
    @Test
    @DisplayName("Valida convite 'luxo' com cod correto")
    fun validaConviteLuxoCodCerto(){
        Assertions.assertEquals(portaria2(21, "luxo", "XL091"), "Welcome :)")
    }
}