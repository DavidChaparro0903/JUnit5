package co.edu.uptc.clases;


public class Principal {

	Factorial fact = new Factorial();
	Calificacion cal = new Calificacion();
	ConvertirDecimalesARomanos convert = new ConvertirDecimalesARomanos();
	SensacionTermica sens = new SensacionTermica();
	
	public double calcularFactorial(int n) {
		return fact.factorial(n);
	}
	
	public String mostrarCalificacion(int nota1, int nota2, int nota3) {
		return cal.calificacion(nota1, nota2, nota3);
	}
	
	public String convertirDecARomanos(int n) {
		return convert.convertirDecARomanos(n);
	}
	
	public String sensacionTermica(int n) {
		return sens.sensacionTermica(n);
	}
	
 // esto es un ejemplo

	public static void main(String[] args) {
		Principal p = new Principal();
		System.out.println(p.calcularFactorial(-10));
		System.out.println("holaaaaaaaaaaaa");
		
	}
}
