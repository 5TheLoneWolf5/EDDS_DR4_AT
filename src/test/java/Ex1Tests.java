import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex1Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void classificarNumeroAltoDeveImprimirAlto() {
        Classificacao.classificar(12);
        Assertions.assertEquals(Ex1TestsHelper.criarSaidaEsperada("ALTO"), outContent.toString());
    }

    @Test
    public void classificarNumeroMedioDeveImprimirMedio() {
        Classificacao.classificar(10);
        Assertions.assertEquals(Ex1TestsHelper.criarSaidaEsperada("MÉDIO"), outContent.toString());
    }

    @Test
    public void classificarNumeroCasoRaroDeveImprimirCasoRaro() {
        Classificacao.classificar(-9999);
        Assertions.assertEquals(Ex1TestsHelper.criarSaidaEsperada("CASO RARO"), outContent.toString());
    }

    @Test
    public void classificarNumeroBaixoDeveImprimirBaixo() {
        Classificacao.classificar(1);
        Assertions.assertEquals(Ex1TestsHelper.criarSaidaEsperada("BAIXO"), outContent.toString());
    }

}

class Ex1TestsHelper {
    public static String criarSaidaEsperada(String texto) {
        return texto + System.lineSeparator();
    }
}