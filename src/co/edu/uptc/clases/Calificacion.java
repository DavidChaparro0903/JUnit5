package co.edu.uptc.clases;

public class Calificacion {
	
	public String calificacion(int nota1, int nota2, int nota3) {
		String cal = new String();
        int promedio=(nota1 + nota2 + nota3) / 3;
           	if (promedio<=10 && promedio>8) {
            		 cal="Excelente";
            	}else if (promedio<=8 && promedio>7 ) {
            		 cal="Buena";
					  } else if (promedio<=7 && promedio>6 ) {
						  cal="Aceptable";
				            } else {
				            	 cal="Reprobado";
				            }
        return cal; 
	}
	


}
