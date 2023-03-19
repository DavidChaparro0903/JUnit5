package co.edu.uptc.clases.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import co.edu.uptc.clases.ConvertirDecimalesARomanos;

// test de caminos (convertir numeros romanos)
public class TestRomanosCaminos3 {
	ConvertirDecimalesARomanos convertidor2 = new ConvertirDecimalesARomanos();
	
	@Test
	// Prueba con nÃºmeros unidades
	public void testConvierteDecimales() {
		String romano= "";
		        
		romano = convertidor2.convertirDecARomanos(2);
        assertEquals("II", romano);
        
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
