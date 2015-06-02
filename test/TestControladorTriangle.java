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
public class TestControladorTriangle {

    private float input;
    private float input2;
    private float esperado;
    private Modelo op;

    public TestControladorTriangle (float input,float input2, float esperado) {
        this.input = input;
        this.input2 = input2;
        this.esperado = esperado;
    }

    

    @Parameterized.Parameters
    public static Collection areaTriangle() {
        return Arrays.asList(new Object[][]{
            {10,5,(float)25},
            {5,2,(float)5},
            {4,3,(float)6},
            {3,2,(float)3}
        });
    }

    @Test
    public void testeoControlador() {
        System.out.println("Número parametrizado es: " + input + input2 + ". El valor esperado es :" + esperado);
        assertTrue(Controlador.areaTriangle(new Modelo(input,input2)) == esperado);
    }

}