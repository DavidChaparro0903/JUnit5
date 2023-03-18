package co.edu.uptc.clases;

public class SensacionTermica {
	public String sensacionTermica(int temp) {
		String mensaje = new String();
		if(temp<10){
			mensaje = "Hace mucho frio.";
        }
        else{
            if(temp<15){
                mensaje = "Hace poco frio.";
            }
            else{
                if(temp<25){
                    mensaje = "Hace una temperatura normal.";
                }
                else{
                    if(temp<30){
                        mensaje = "Hace poco calor.";
                    }
                    else{
                        mensaje = "Hace mucho calor.";
                    }
                }
            }
        }
		return mensaje;
	}
}
