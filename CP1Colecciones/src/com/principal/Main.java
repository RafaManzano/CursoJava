package com.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

public class Main {

	public static void main (String[] args) {
		List<Empleado> empleados = new ArrayList<>();
		//2. Crear una lista de empleados, que contenga empleados de 3 departamentos
		//3. Agregar mas de tres empleados por departamento, de diferentes sexo.
		empleados.add(new Empleado());
		empleados.add(new Empleado("Rafael", "Manzano", "Medina", LocalDate.now(), LocalDate.now(), TipoDpto.CONTABILIDAD,"rafa@java.com", 1500.20, TipoSexo.HOMBRE));
		empleados.add(new Empleado("Maria", "Gutierrez", "Jimenez", LocalDate.now(), LocalDate.now(), TipoDpto.FINANZAS,"maria@java.com", 2800.0, TipoSexo.MUJER));
		empleados.add(new Empleado("Alex", "Reyes", "Jimenez", LocalDate.now(), LocalDate.now(), TipoDpto.RRHH,"alex@java.com", 3028.75, TipoSexo.HOMBRE));
		
		//4. Recuperar y visualizar el total de empleados de la lista de empleados
		//System.out.println(empleados);
		
		//5. Recuperar y visualizar el salario total de todos los empleados de la empresa
		Double totalSalario = empleados.stream()
				.mapToDouble(Empleado::getSalario).sum();
		//System.out.println(totalSalario);
		
		//6. Recuperar el nombre del empleado que tiene el mayor salario de los tres departamentos, es decir, de toda la empresa.
		String nombreEmpleadoMayorSalario = empleados.stream()
				.max(Empleado::compareTo).map(Empleado::getNombre).get();
		//System.out.println(nombreEmpleadoMayorSalario);
		
		//7. Recuperar el nombre del departamento donde trabaja el empleado que tiene el mayor salario de toda la empresa
		TipoDpto dptoEmpleadoMayorSalario = empleados.stream()
				.max(Empleado::compareTo).map(Empleado::getDpto).get();
		//System.out.println(dptoEmpleadoMayorSalario);
		
		//8. Determinar el sexo del empleado que tiene el mayor salario de toda la empresa
		TipoSexo sexoEmpleadoMayorSalario = empleados.stream()
				.max(Empleado::compareTo).map(Empleado::getSexo).get();
		//System.out.println(sexoEmpleadoMayorSalario);
		
		//9. Calcular y visualizar el total de empleados que trabajan en cada departamentos
		Map<TipoDpto, Long> empleadosPorDepartamento = empleados.stream()
				.collect(Collectors.groupingBy(Empleado::getDpto, Collectors.counting()));
		System.out.println(empleadosPorDepartamento);
		
		//10. Calcular y visualizar el salario promedio por departamento.
		Map<TipoDpto, Double> sueldoPorDepartamento = empleados.stream()
				.collect(Collectors.groupingBy(Empleado::getDpto, Collectors.averagingDouble(Empleado::getSalario)));
		//System.out.println(sueldoPorDepartamento);
		
		//11. Recuperar el nombre, el correo, y la fecha de alta en la empresa del trabajador cuyo salario sea superior a la media por departamento
		SortedSet<Empleado> sortEmpleado;
		for(Map.Entry<TipoDpto, Double> entry : sueldoPorDepartamento.entrySet()) {
			TipoDpto dpto = entry.getKey();
			Double valor = entry.getValue();
			
			empleados.stream()
			.filter(e -> e.getDpto().equals(dpto) && e.getSalario() >= valor)
			.collect(Collectors.mapping(, Collectors.toList());
			}
		
		
		
		
		
	}
}
