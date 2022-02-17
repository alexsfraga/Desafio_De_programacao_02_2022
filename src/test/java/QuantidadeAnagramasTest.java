import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste para a Classe QuantidadeAnagramas
 *
 * @author Alex Fraga
 */
class QuantidadeAnagramasTest {

    static QuantidadeAnagramas quantidadeAnagramas;

    @DisplayName("Verifica o calculo da quantidade de anagramas das palavras")
    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testNumeroDeAnagramas(int resultado, String palavra) {
        int numeroDeAnagramas = quantidadeAnagramas.getQuantidadeDeAnagramas(palavra);
        assertEquals(resultado, numeroDeAnagramas);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(3,"Ovo"),
                Arguments.of(3,"ovo"),
                Arguments.of(3,"oVo"),
                Arguments.of(3,"oVO")
        );
    }

    @BeforeAll
    public static void newQuantidadeAnagramas() {
        quantidadeAnagramas = new QuantidadeAnagramas();
    }

}