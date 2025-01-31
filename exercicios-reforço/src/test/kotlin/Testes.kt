import org.junit.jupiter.api.*

class Testes {

    @Test
    @DisplayName("Teste fun 'xxoo'")
    fun testVerificador() {
        Assertions.assertAll(
            { Assertions.assertTrue(verificadorString("xxoo")) },
            { Assertions.assertTrue(verificadorString("xXoo")) },
            { Assertions.assertTrue(verificadorString("xxOo")) }
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {
        TODO("Preciso implementar esse teste")
    }

    @Test
    @Disabled
    fun vaiFalhar() {
        fail("Eu quero que falhe mesmo")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(verificadorString("xxoo"))

        Assertions.assertEquals(rende(100f, 0.01f), 101f)
    }

    @Test
    fun exception() {
        assertThrows<NumberFormatException> { piramide("abc") }
    }
}