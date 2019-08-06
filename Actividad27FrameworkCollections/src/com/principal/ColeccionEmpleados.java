package com.principal;

import java.util.*;

public class ColeccionEmpleados {

	public static void main(String[] args) {
		// Creamos un listado de empleados
		List<Empleado> empleados = new ArrayList<>();
		Empleado es;
		double media = 0.0;
		int contador = 0;
		
		//Agregamos elementos a la coleccion
		
		//He realizado mis metodos aparte
		//empleados = Metodos.listadoEmpleado();
		empleados = Metodos.listadoLleno();
		
		//Recorrer la coleccion de empleados (3 formas y solo una de eliminar elementos a medida que la recoges)
		//Mostrar el nombre de los que trabajan en los RRHH
		//Primera forma (for mejorado, la coleccion se mantiene inmutable)
		/*
		for(Empleado e : empleados) {
			if(e.getDpto().equals(TipoDpto.RRHH)) {
				System.out.println(e.getNombre());
			}
		}
		*/
		//Segunda forma, usando un iterador que es la unica forma de eliminar elementos de la coleccion ITERATOR
		
		Iterator<Empleado> it;
		it = empleados.iterator();
		/*
		//Eliminar los empleados del dpto de CONTABILIDAD
		while(it.hasNext()) {
			if(it.next().getDpto() == TipoDpto.CONTABILIDAD) {
				it.remove();
			}
		}
		*/
		//Imprimir coleccion
		//System.out.println(empleados);
		
		//Caso Practico. A partir del fragmento de codigo anterior, recorrer la coleccion de empleados y eliminar los que pertenecen al
		//Dpto de Finanzas y el salario es inferior a 3000.00 euros
		/*
		it = empleados.iterator(); //Se usa para reiniciar el iterador y volver a la primera posicion
		while(it.hasNext()) {
			es = it.next();
			if(es.getDpto() == TipoDpto.FINANZAS && es.getSalario() < 3000.00) {
				it.remove();
			}
		}
		*/
		
		//Imprimir coleccion
		//System.out.println(empleados);

		
		//Caso Practico, usando un for mejorado y un iterador tambien, hallar el salario promedio de todos los empleados,
		//que no pertenecen al departamento de RRHH
		
		//For mejorado
		for(Empleado e : empleados) {
			if(e.getDpto() != TipoDpto.RRHH) {
				media += e.getSalario();
				contador++;
			}
		}
		System.out.println("El salario medio de los departamentos que no son RRHH es: " + (media / contador));
		
		//Iterator
		//Reset de variables
		media = 0; 
		contador = 0;
		it = empleados.iterator(); 
		
		while(it.hasNext()) {
			es = it.next();
			if(es.getDpto() != TipoDpto.RRHH) {
				media += es.getSalario();
				contador++;
			}
		}
		System.out.println("El salario medio de los departamentos que no son RRHH es: " + (media / contador));
	}

}
