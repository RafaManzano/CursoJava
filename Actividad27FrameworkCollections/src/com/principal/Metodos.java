package com.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Esta en un archivo aparte porque considero que un listado de empleados no es comun a UN EMPLEADO (seria la clase)
 * entonces estos metodos estan en un fichero denom
 */
public class Metodos {

	/*
	 * Devolvera una lista de empleados
	 */
	public static List<Empleado> listadoEmpleado() {
		List<Empleado> empleadosTemp = null;
		empleadosTemp = new ArrayList<>();
		Scanner teclado = new Scanner(System.in); //Esto se usa para recoger lo que escribas desde teclado //Es una clase de Java
		char respuesta;
		Empleado e;
		
		do { 
			e = crearEmpleado(); //El metodo de crear empleado de abajo
			empleadosTemp.add(e);
			System.out.println("Quieres seguir introduciendo empleados (s/n)");
			respuesta = teclado.next().charAt(0);
		}
		while(respuesta != 'n');
		
		
		
		return empleadosTemp;
	}
	
	/*
	 * Con este metodo se crearia un empleado
	 * Se usa para el metodo de listadoEmpleado para cada vez que se ejecute el bucle y se anhade un nuevo empleado
	 * al listado
	 * El uso de este metodo es crear un empleado y devolverlo con el return
	 */
	public static Empleado crearEmpleado() {
		Empleado e = new Empleado();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre");
		e.setNombre(teclado.next());
		System.out.println("Introduzca el primer apellido");
		e.setPrimerApellido(teclado.next());
		System.out.println("Introduzca el segundo apellido");
		e.setSegundoApellido(teclado.next());
		System.out.println("Introduzca el departamento (R,I,F,C)");
		e.setDpto(obtenerDpto(Character.toLowerCase(teclado.next().charAt(0))));
		System.out.println("Introduzca el salario");
		e.setSalario(teclado.nextDouble());
		
		return e;
		
	}

	/*
	 * Este metodo se usa para convertir el caracter que escribira el usuario en el TipoDpto (Dpto Enum),
	 * A la hora de seleccionar el usuario el departamento que desea veo mas comodo que escriba una letra y con este
	 * metodo convierte ese caracter y se devuelve el enum
	 */
	public static TipoDpto obtenerDpto(char caracter) {
		TipoDpto dpto = null;
		switch(caracter) {
			case 'r':
				dpto = TipoDpto.RRHH;
			break;
			
			case 'i':
				dpto = TipoDpto.INFORMATICA;
			break;
			
			case 'f':
				dpto = TipoDpto.FINANZAS;
			break;
			
			case 'c':
				dpto = TipoDpto.CONTABILIDAD;
			break;
			
			default:
				dpto = TipoDpto.NODEFINIDO;
			break;
		}
		
		return dpto;
	}
	
	public static List<Empleado> listadoLleno(){
		List<Empleado> empleadosTemp = null;
		empleadosTemp = new ArrayList<>();
		
		// Dpto RRHH
		Empleado empleado1;
		Empleado empleado2;
		
		//Dpto INFORMATICA
		Empleado empleado3;
		Empleado empleado4;
		
		//Dpto FINANZAS
		Empleado empleado5;
		Empleado empleado6;
		
		// Dpto CONTABILIDAD
		Empleado empleado7;
		Empleado empleado8;
		
		empleado1 = new Empleado("Jorge", "Alonso", "López", TipoDpto.RRHH,2500.00);
		empleado2 = new Empleado("Sixto", "Berrio", "Rubio", TipoDpto.RRHH,2450.00);
		empleado3 = new Empleado("Antonio Jesus", "Cabeza", "Gordillo", TipoDpto.INFORMATICA,2480.00);
		empleado4 = new Empleado("David", "fernandez", "Duarte", TipoDpto.INFORMATICA,2485.00);
		empleado5 = new Empleado("Blanca", "Fustero", "Oria", TipoDpto.FINANZAS,2580.00);
		empleado6 = new Empleado("Daniel", "Hidalgo", "Murillo", TipoDpto.FINANZAS,3000.00);
		empleado7 = new Empleado("Carlos", "Lozano", "Roque", TipoDpto.CONTABILIDAD,2580.00);
		empleado8 = new Empleado("David", "Luna", "Gonzalez", TipoDpto.CONTABILIDAD,3000.00);
		
		
								
				
		empleadosTemp.add(empleado1);
		empleadosTemp.add(empleado2);
		empleadosTemp.add(empleado3);
		empleadosTemp.add(empleado4);
		empleadosTemp.add(empleado5);
		empleadosTemp.add(empleado6);
		empleadosTemp.add(empleado7);
		empleadosTemp.add(empleado8);
		
		
		
		return empleadosTemp;
	}
	  
}
