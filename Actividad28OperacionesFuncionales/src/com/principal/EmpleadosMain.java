package com.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
/*
 * Una tuberia (Pipeline) una secuencia de operaciones de agregado, que consta de un origen que puede ser fichero, BBDD, etc. 
 * Unicamente un origen y varias o ninguna operacion intermedia y una sola operacion terminal
 */
public class EmpleadosMain {

	public static void main(String[] args) {
		List<Empleado> empleados;
		empleados = Metodos.listadoLleno();
		//IPredicateImpl ipi = new IPredicateImpl();
		
		//Caso Practico, calcular el salario promedio de todos los empleados,
		//que no pertenecen al departamento de RRHH
		
		//Utilizando operaciones funcionales
		//En el metodo filter tambien se puede meter un new y crear un objeto dentro del metodo
		//Es una forma de usar la interfaz Predicate, desde una clase externa (IPredicateImpl) //Enfoque principiante
		//empleados.stream().filter(ipi);
		
		//Utilizar una clase anonima, porque solo se necesita para el metodo filter //Enfoque normal
		/*
		empleados.stream().filter(new Predicate<Empleado>() {

			@Override
			public boolean test(Empleado t) {
				return t.getDpto() != TipoDpto.RRHH;
			}
		});
		*/
		//Usando una expresion Lambda. Implementa el metodo test de la interfaz funcional Predicate//Enfoque profesional
		/*
		 * Para un uso mas profesional se va a poner todos los metodos con el punto delante en una linea diferente
		 * Expresion Lambda
		 * 	El metodo tiene un solo parametro se pueden quitar los parentesis
		 * 	El metodo tiene dos o mas parametros se mantienen los parentesis y se separan por comas
		 * 
		 * NOTA: Cuando la expresion lo unico que va a hacer es invocar al metodo que realiza el trabajo es mas 
		 * conveniente no utilizar la expresion lambda sino pasar la expresion por referencia
		 */
		double salarioMedio = 
		empleados.stream()
		.filter(e -> e.getDpto() != TipoDpto.RRHH)
		//.mapToDouble(e -> e.getSalario()); //Esto no se usa asi
		.mapToDouble(Empleado::getSalario)
		.average()
		.getAsDouble();
		
		System.out.println(salarioMedio);
		
		//Operaciones terminales en la tuberia (Pipeline)
		//Collect
		//Tenemos una lista de nombres duplicados y al final queremos una lista con los nombres no duplicados
		String[] arrNombres = {"David","David","Daniel","Daniel","Daniel","Guille","Guille","Pablo","Pablo","Pablo","Antonio", "Alfonso"};
		List<String> nombresDuplicados;
		nombresDuplicados  = new ArrayList<>(); 
		
		nombresDuplicados = Arrays.asList(arrNombres);
		
		//Imprimir nombresDuplicados
		//System.out.println(nombresDuplicados);
		//nombresDuplicados.stream().forEach(System.out::println); //Imprimir
		
		/*
		 * HashSet: No se puede ordenar nunca (Gana velocidad)
		 * TreeSet: Se puede ordenar (Ordenacion)
		 */
		Set<String> nombresNoDuplicados = new TreeSet<>();
				
		nombresNoDuplicados = nombresDuplicados.stream()
		.collect(Collectors.toSet());
		
		System.out.println(nombresNoDuplicados);
		
		/*
		 * Case Practico: Mostrar la lista ordenada:
		 * 	a) Segun el orden natural de sus elementos
		 * 	b) Respetando el orden natural, en orden alfabetico inverso
		 */
	}

}

/*
 * Para una lista con cualquier tipo de elementos (Herederos de empleados)
 * List<? super Empleado> listado;
 * 
 * Totalmente generica (No es recomendable)
 * Collection <?> listado;
 * 
 */
