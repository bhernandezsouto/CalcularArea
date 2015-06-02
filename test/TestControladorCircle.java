import calcularsuperficie.Controlador;
import calcularsuperficie.Modelo;
import calcularsuperficie.Presentacion;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;


@RunWith(Parameterized.class)
public class TestControladorCircle {

    private float input;
   
    private float esperado;
    private Modelo op;

    public TestControladorCircle (float input, float esperado) {
        this.input = input;
        this.esperado = esperado;
    }

    

    @Parameterized.Parameters
    public static Collection areaCircle() {
        return Arrays.asList(new Object[][]{
            {10,(float)314.16},
            {5,(float)78.54},
            {4,(float)50.2656},
            {3,(float)28.2744}
        });
    }

    @Test
    public void testeoControlador() {
        System.out.println("Número parametrizado es: " + input + ". El valor esperado es :" + esperado);
        assertTrue(Controlador.areaCircle(new Modelo(input)) == esperado);
    }

}