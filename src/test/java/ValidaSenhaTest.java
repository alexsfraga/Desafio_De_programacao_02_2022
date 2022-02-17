import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste para a Classe ValidaSenha
 *
 * @author Alex Fraga
 */
class ValidaSenhaTest {

    static ValidaSenha validaSenha;

    @DisplayName("Verifica se senha dentro do padrão é valida")
    @ParameterizedTest
    @ValueSource(strings = {"Ya1!aa", "aY1!ae"})
    public void testValidacaoDaSenha(String pass){
        //String pass = "Ya1!aa";
        int resultado = validaSenha.validarSenha(pass);
        assertEquals(6, resultado);
    }

    @DisplayName("Verifica senhas que estao fora do padrão")
    @ParameterizedTest
    @ValueSource(strings = {"Yae!aa", "aY1!a","1ae!aa"})
    public void testNaoValidacaoDaSenha(String pass){
        //String pass = "Ya1!aa";
        int resultado = validaSenha.validarSenha(pass);
        assertNotEquals(6, resultado);
    }

    @BeforeEach
    void setUp() {
        validaSenha = new ValidaSenha();
    }
}