package co.edu.uptc.clases.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import co.edu.uptc.clases.SensacionTermica;

/**
 * Clase principal del test, la cual albergara a los test realizados con
 * JUnit para las distintas pruebas unitarias referentes a la clase SensacionTermica
 */

public class TestSensacionTermica {

    SensacionTermica sensacion = new SensacionTermica();

    /**
     * Cobertura de Sentencia
     * 
     * Al haber 6 sentencias en este caso, pero unicamente 5 ejecutables, debido a que la variable mensaje siempre se ejecutara
     * Se usaran 5 casos de prueba para evaluar las 5 posibles sensaciones termicas, esto basado en las condiciones proporcionadas
     * por la clase que estamos evaluando.
     */
    @Test
    public void testObtenerSensacionTermica(){
        String temperatura = "";

        temperatura = sensacion.sensacionTermica(9);
        assertEquals("Hace mucho frio.", temperatura);
        
        temperatura = sensacion.sensacionTermica(14);
        assertEquals("Hace poco frio.", temperatura);
        
        temperatura = sensacion.sensacionTermica(24);
        assertEquals("Hace una temperatura normal.", temperatura);
        
        temperatura = sensacion.sensacionTermica(29);
        assertEquals("Hace poco calor.", temperatura);
        
        temperatura = sensacion.sensacionTermica(31);
        assertEquals("Hace mucho calor.", temperatura); 
    }

    /**
     * Cobertura de Decision
     * 
     * Al haber 5 condicionales, se requieren 5 casos de prueba para cada condicion, pues si se cumple una
     * las demas condiciones ya no son necesarias, por lo que la ejecucion termina, asi que tendremos en cuenta los
     * 5 posibles escenarios para la sensacion termica.
     */

     @Test
     public void testSensacionTermicaDecision(){
        String temperatura = "";

        temperatura = sensacion.sensacionTermica(8);
        assertEquals("Hace mucho frio.", temperatura);
        
        temperatura = sensacion.sensacionTermica(13);
        assertEquals("Hace poco frio.", temperatura);
        
        temperatura = sensacion.sensacionTermica(23);
        assertEquals("Hace una temperatura normal.", temperatura);
        
        temperatura = sensacion.sensacionTermica(28);
        assertEquals("Hace poco calor.", temperatura);
        
        temperatura = sensacion.sensacionTermica(40);
        assertEquals("Hace mucho calor.", temperatura); 
     }

    /**
     * Cobertura de Camino
     * 
     * Teniendo en cuenta los 5 condionales posibles, se puede decir que se cuentan con cinco distintos
     * caminos para llegar al final de la ejecucion, para lo cual probamos cinco distintas opciones, donde cada
     * opcion corresponde a un posible camino
     */

      @Test
      public void testSensacionTermicaCaminos(){
        String temperatura = "";

        temperatura = sensacion.sensacionTermica(5);
        assertEquals("Hace mucho frio.", temperatura);
        
        temperatura = sensacion.sensacionTermica(11);
        assertEquals("Hace poco frio.", temperatura);
        
        temperatura = sensacion.sensacionTermica(19);
        assertEquals("Hace una temperatura normal.", temperatura);
        
        temperatura = sensacion.sensacionTermica(27);
        assertEquals("Hace poco calor.", temperatura);
        
        temperatura = sensacion.sensacionTermica(38);
        assertEquals("Hace mucho calor.", temperatura); 
      }
}
