package com.principal;

import java.util.*;

public class ObjectOrderingMain {

	public static void main(String[] args) {
		String[] arrNombres = {"David","David","Zara" , "Daniel","Daniel","Daniel","Guille","Guille","Pablo","Pablo","Pablo","Antonio", "Alfonso"};
		List<String> nombresDuplicados;
		nombresDuplicados  = new ArrayList<>(); 
		
		nombresDuplicados = Arrays.asList(arrNombres);
		
		//Crear una lista de empleados
		List<Empleado> empleados = Metodos.listadoLleno();
		
		//Imprimir la lista segun el orden natural de sus elementos
		Collections.sort(nombresDuplicados);
		
		//System.out.println(nombresDuplicados);
		
		
		//Imprimir la lista segun el orden natural por la Interfaz Collection implementando Comparable de java.lang
		//Collections.sort(empleados);
		
		//System.out.println(empleados);

		//Ordenamos por el salario, pero no se puede cambiando el compareTo de la clase
		//Se pueden poner los tipos, pero si son los mismos no seria necesario y queda el codigo mas limpio, Eclipse no te autocompleta
		Collections.sort(empleados, (e, e1) -> e1.getSalario().compareTo(e.getSalario()));
		
		System.out.println(empleados);
		
	}

}
