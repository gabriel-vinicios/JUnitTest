package calculadora;

import org.junit.Test;
import org.junit.Assert;

public class testCalculadora {
    @Test
    public void testGetAdicao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        Assert.assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
