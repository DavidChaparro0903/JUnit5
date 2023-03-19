package co.edu.uptc.clases.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.edu.uptc.clases.ConvertirDecimalesARomanos;


// Cobertura de sentencia ( convetir a numero romanos)
public class TestRomanos {
	 ConvertirDecimalesARomanos convertidor2 = new ConvertirDecimalesARomanos();

		@Test
		// Prueba con números decimales
	    public void testConvierteDecimales() {
			String romano= "";
			
			romano = convertidor2.convertirDecARomanos(9);
	        assertEquals("IX", romano);
	        
			romano = convertidor2.convertirDecARomanos(6);
	        assertEquals("VI", romano);
						
			romano = convertidor2.convertirDecARomanos(4);
	        assertEquals("IV", romano);
	        
			romano = convertidor2.convertirDecARomanos(2);
	        assertEquals("II", romano);
	        
			
	    }
		
		@Test
		// Prueba con números decenas
	    public void testConvierteDecenas() {
			String romano= "";
			
			romano = convertidor2.convertirDecARomanos(90);
	        assertEquals("XC", romano);
	        
			romano = convertidor2.convertirDecARomanos(54);
	        assertEquals("LIV", romano);
						
			romano = convertidor2.convertirDecARomanos(42);
	        assertEquals("XLII", romano);
	        
			romano = convertidor2.convertirDecARomanos(23);
	        assertEquals("XXIII", romano);
	        
	       
	        
	    }
		
		@Test
		// Prueba con números centenas 
	    public void testConvierteCentenas() {
			String romano= "";
			
			romano = convertidor2.convertirDecARomanos(923);
	        assertEquals("CMXXIII", romano);
	        
			romano = convertidor2.convertirDecARomanos(517);
	        assertEquals("DXVII", romano);
						
			romano = convertidor2.convertirDecARomanos(617);
	        assertEquals("DCXVII", romano);
	        
			romano = convertidor2.convertirDecARomanos(400);
	        assertEquals("CD", romano);
	        
			romano = convertidor2.convertirDecARomanos(100);
	        assertEquals("C", romano);
	      
	    }
	    
		@Test
		// Prueba con números miles
	    public void testConvierteMiles() {
			String romano= "";
			
			romano = convertidor2.convertirDecARomanos(1617);
	        assertEquals("MDCXVII", romano);
	        
			romano = convertidor2.convertirDecARomanos(1000);
	        assertEquals("M", romano);
						

	      
	    }
}
