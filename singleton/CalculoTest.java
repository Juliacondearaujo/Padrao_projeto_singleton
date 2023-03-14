package padroescriacao_exercicio.singleton;

import org.junit.jupiter.api.Test;
import padroescriacao.singleton.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculoTest {

    @Test
    public void deveRetornarCalculoCerto() {
        Calculadora.getInstance().setCelsius(0);
        assertEquals(32, Calculadora.getInstance().getCalculo());
    }

    @Test
    public void deveRetornarCalculoCerto2() {
        Calculadora.getInstance().setCelsius(10);
        assertEquals(50, Calculadora.getInstance().getCalculo());
    }

}
