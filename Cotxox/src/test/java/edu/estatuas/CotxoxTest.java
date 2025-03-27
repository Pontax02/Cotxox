package edu.estatuas;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CotxoxTest {

    private static Carrera carrera;

    @BeforeClass
    public static void setUpClass() {

        carrera = new Carrera("4916119711304546");
    }
    @Test
    public void ConstructorTest() {

        assertEquals("4916119711304546",carrera.getTarjetaCredito());

    }


}
