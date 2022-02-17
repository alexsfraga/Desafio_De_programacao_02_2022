import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste para a Classe EscadaTamanhoN
 *
 * @author Alex Fraga
 */

class EscadaTamanhoNTest {

    static EscadaTamanhoN escadaTamanhoN;

    @DisplayName("Verifica se o desenho da Escada retornado corresponde ao esperado de acordo com o valor de N")
    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testEscadaTamanhoN(int valorN,String expected){
        assertEquals(expected, escadaTamanhoN.construirEscada(valorN));
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(5,"    *\n   **\n  ***\n ****\n*****"),
                Arguments.of(6,"     *\n    **\n   ***\n  ****\n *****\n******"),
                Arguments.of(7,"      *\n     **\n    ***\n   ****\n  *****\n ******\n*******")
        );
    }

    @BeforeEach
    void setUp() {
        escadaTamanhoN = new EscadaTamanhoN();
    }
}