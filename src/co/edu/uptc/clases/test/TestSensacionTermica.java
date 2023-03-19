package co.edu.uptc.clases.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import co.edu.uptc.clases.SensacionTermica;

public class TestSensacionTermica {
    
    SensacionTermica sensacion = new SensacionTermica();

    @Test
    public void testObtenerSensacionTermica(){
        String temperatura = "";

        temperatura = sensacion.sensacionTermica(9);
        assertEquals("hace mucho frio", temperatura);
    }
}
