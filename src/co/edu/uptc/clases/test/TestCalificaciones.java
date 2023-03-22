package co.edu.uptc.clases.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import co.edu.uptc.clases.Calificacion;

public class TestCalificaciones {

    Calificacion cal =  new Calificacion();
	
	/**
	 * Notas promedio <= 10
	 */
	@Test
	public void testPromedioExcelente() {
		int a = 9;
		String result= cal.calificacion(a, a, a);;
		assertEquals("Excelente" , result);
	}
	/**
	 * Notas promedio <= 8
	 */
	@Test
	public void testPromedioBuena() {
		int a = 8;
		String result= cal.calificacion(a, a, a);;
		assertEquals("Buena" , result);
	}
	
	/**
	 * Notas promedio <= 7
	 */
	@Test
	public void testPromedioAceptable() {
		int a = 7;
		String result= cal.calificacion(a, a, a);;
		assertEquals("Aceptable" , result);
	}
	
	/**
	 * Notas promedio <= 6
	 */
	@Test
	public void testPromedioReprobado() {
		int a = 5;
		String result= cal.calificacion(a, a, a);;
		assertEquals("Reprobado" , result);
	}

}
