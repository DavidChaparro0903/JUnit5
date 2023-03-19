package co.edu.uptc.clases.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import co.edu.uptc.clases.ConvertirDecimalesARomanos;

//Cobertura de decision ( convetir a numero romanos)
public class TestRomanosCoberturaDesicion {
	ConvertirDecimalesARomanos convertidor2 = new ConvertirDecimalesARomanos();
	
	@Test
	public void testConvierteDecimales() {
		String romano= "";
		
		romano = convertidor2.convertirDecARomanos(1);
        assertEquals("I", romano);
        
		romano = convertidor2.convertirDecARomanos(3);
        assertEquals("III", romano);
        
		romano = convertidor2.convertirDecARomanos(4);
        assertEquals("IV", romano);
        
		romano = convertidor2.convertirDecARomanos(5);
        assertEquals("V", romano);
        
		romano = convertidor2.convertirDecARomanos(6);
        assertEquals("VI", romano);
        
		romano = convertidor2.convertirDecARomanos(9);
        assertEquals("IX", romano); 
		
    }
}
