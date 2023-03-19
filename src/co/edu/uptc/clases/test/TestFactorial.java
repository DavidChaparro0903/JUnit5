package co.edu.uptc.clases.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import co.edu.uptc.clases.Factorial;


/**
 * 
 * @author David Galvis
 *
 *
 *Clase encargada de los test unitario para la clase factorial, la siguiente clase cuenta con 
 *4 metodos donde se hacen los casos de prueba para recorrer el metodo por distintas coberturas
 */
public class TestFactorial {
	
	private static Factorial fac; 

	
	@Test
	/*
	 * Cobertura de sentencia
	 * 
	 * Se puede observar que el valor 1 se puede recorrer la totalidad
	 * de las sentencias que tiene el metodo, ejecutando este por medio 
	 * de debug, lo podemos ver de forma detallada
	 * */
	public void getSentenceCoverage() {
		fac = new Factorial();
		assertEquals("El resultado no coincide",1.0, fac.factorial(1),0);
	}
	
	
	/**
	 * Cobertura de decision
	 * 
	 * Para la cobertura de cada una de las sentencias o condicionales (donde tendremos un
	 * verdadero o falso), se necesitan tres valores especificos divididos de la siguiente forma:
	 * x < 0
	 * x=0
	 * x>0
	 * @param expectedResult
	 * @param numberFactorial
	 */
	
	
	@ParameterizedTest()
	@CsvSource({
		"3628800.0,10",
		"1.0,0",
		"0.0,-1"
	})
	public void getDecisionCoverage(double expectedResult, int numberFactorial) {
		fac = new Factorial();
		assertEquals(expectedResult, fac.factorial(numberFactorial),0);
	}
	
	
	

	
	/**
	 * Cobertura de caminos
	 * Para la cobertura de cada uno de los caminos del metodo
	 * se necesitan tres valores especificos divididos de la siguiente forma:
	 * x < 0
	 * x=0
	 * x>0
	 * @param expectedResult
	 * @param numberFactorial
	 */
	
	@ParameterizedTest()
	@CsvSource({
		"6.0,3",
		"1.0,0",
		"0.0,-3"
	})
	public void getRoadCoverage(double expectedResult, int numberFactorial) {
		fac = new Factorial();
		assertEquals(expectedResult, fac.factorial(numberFactorial),0);
	}
	
	
	

	
	
	/**
	 * Cobertura de condicion
	 * El metodo al no tener condiciones subatomicas que se puedan dividir en multiples
	 * se hace el siguiente metodo de prueba para simular y cumplir con la cobertura
	 * de condicion
	 * x < 0
	 * x=0
	 * x>0
	 * @param expectedResult
	 * @param numberFactorial
	 */
	
	@ParameterizedTest()
	@CsvSource({
		"120.0,5",
		"1.0,0",
		"0.0,-10"
	})
	public void getConditionCoverage(double expectedResult, int numberFactorial) {
		fac = new Factorial();
		assertEquals(expectedResult, fac.factorial(numberFactorial),0);
	}
	
	
	
	
	
	

}
