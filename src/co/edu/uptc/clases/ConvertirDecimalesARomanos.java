package co.edu.uptc.clases;

public class ConvertirDecimalesARomanos {

	public String convertirDecARomanos(int numerodecimal) {
		int i, miles, centenas, decenas, unidades;
	      String romano = "";
	      miles = numerodecimal / 1000;
	      centenas = numerodecimal / 100 % 10;
	      decenas = numerodecimal / 10 % 10;
	      unidades = numerodecimal % 10;

	      //millar
	      for (i = 1; i <= miles; i++) {
	             romano = romano + "M";
	      }

	      //centenas
	      if (centenas == 9) {
	          romano = romano + "CM";
	      } else if (centenas >= 5) {
	                 romano = romano + "D";
	                 for (i = 6; i <= centenas; i++) {
	                      romano = romano + "C";
	                 }
	      } else if (centenas == 4) {
	                 romano = romano + "CD";
	      } else {
	                 for (i = 1; i <= centenas; i++) {
	                      romano = romano + "C";
	             }
	      }

	      //decenas
	      if (decenas == 9) {
	          romano = romano + "XC";
	      } else if (decenas >= 5) {
	                 romano = romano + "L";
	                 for (i = 6; i <= decenas; i++) {
	                      romano = romano + "X";
	                 }
	      } else if (decenas == 4) {
	                 romano = romano + "XL";
	      } else {
	                 for (i = 1; i <= decenas; i++) {
	                      romano = romano + "X";
	                 }
	      }

	      //unidades
	      if (unidades == 9) {
	          romano = romano + "IX";
	      } else if (unidades >= 5) {
	                 romano = romano + "V";
	                 for (i = 6; i <= unidades; i++) {                                                           
	                      romano = romano + "I";
	                 }
	      } else if (unidades == 4) {
	                 romano = romano + "IV";
	      } else {
	                 for (i = 1; i <= unidades; i++) {
	                      romano = romano + "I";
	                 }
	      }
	      return romano;
	}

}
