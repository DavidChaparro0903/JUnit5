package co.edu.uptc.clases;

public class Factorial {
	
	
	public double factorial(int N) {
        double factorial;
        factorial =0;
        for(int i = 0; i <= N ; i++){ //para cada n�mero desde 1 hasta N                                               
            //se calcula su factorial
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }
        }
        return factorial;
	}

}
