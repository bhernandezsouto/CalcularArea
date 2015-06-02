
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
public class TestControladorSquare {

    private float input;
    
    private float esperado;
    private Modelo op;

    public TestControladorSquare (float input, float esperado) {
        this.input = input;
        this.esperado = esperado;
    }

    

    @Parameterized.Parameters
    public static Collection areaSquare() {
        return Arrays.asList(new Object[][]{
            {10,100},
            {5,25},
            {4,16},
            {3,9}
        });
    }

    @Test
    public void testeoControlador() {
        System.out.println("Número parametrizado es: " + input + ". El valor esperado es :" + esperado);
        assertTrue("Prueba",Controlador.areaSquare(new Modelo(input)) == esperado);
    }

}