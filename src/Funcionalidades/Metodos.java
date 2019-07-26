package Funcionalidades;

import java.util.Random;

import com.principal.Empleado;
import com.principal.Obrero;
import com.principal.Tecnico;

public class Metodos {

	public static void crearEmpleados(Empleado[] empresa) {
		Random random = new Random();
		Tecnico t;
		Obrero o;
		int numero = 0;
		
		
		for(int i = 0; i < empresa.length; i++) {
			numero = random.nextInt(4);
			if(numero == 2) {
				empresa[i] = t = new Tecnico();
			}
			else {
				empresa[i] = o = new Obrero();
			}
		}
	}
	
	public static void visualizarEmpleados(Empleado[] empresa) {
		for(int i = 0; i < empresa.length; i++) {
			empresa[i].pintar();
		}
	}
	
	public static void subirSueldos(Empleado[] empresa) {
		float aumento;
		Random random = new Random();
		for(int i = 0; i < empresa.length; i++) {
			aumento = random.nextFloat()*10;
			empresa[i].inctoSueldo(aumento);
		}
	}
	
}
