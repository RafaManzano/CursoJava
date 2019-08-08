package com.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MainCP2 {

	public static void main(String[] args) {
		List<Estudiante> listaEstudiante = new ArrayList<>();
		//List<Estudiante> listaOrdenada = null;
		listaEstudiante.add(new Estudiante("Rafael", "Manzano", "Medina", "rafa@java.com", TipoSexo.HOMBRE, LocalDate.now(), TipoFacultad.INFORMATICA, 5.0, TipoSesion.MORNING, 24));
		listaEstudiante.add(new Estudiante("Enriqueta", "Acevedo", "Ibarra", "e@java.com", TipoSexo.MUJER, LocalDate.now(), TipoFacultad.INFORMATICA, 7.0, TipoSesion.AFTERNOON, 16));
		listaEstudiante.add(new Estudiante("Carolina", "Acosta", "Garbajosa", "c@java.com", TipoSexo.MUJER, LocalDate.now(), TipoFacultad.INFORMATICA, 19.0, TipoSesion.MORNING, 20));
		listaEstudiante.add(new Estudiante("Jose", "Alarcon", "Gasol", "j@java.com", TipoSexo.HOMBRE, LocalDate.now(), TipoFacultad.MEDICINA, 2.0, TipoSesion.AFTERNOON, 32));
		listaEstudiante.add(new Estudiante("Hipolito", "Lopez", "Yelotro", "h@java.com", TipoSexo.HOMBRE, LocalDate.now(), TipoFacultad.MEDICINA, 5.0, TipoSesion.MORNING, 28));
		listaEstudiante.add(new Estudiante("Jose Israel", "Perez", "Abrines", "ji@java.com", TipoSexo.HOMBRE, LocalDate.now(), TipoFacultad.MEDICINA, 3.0, TipoSesion.AFTERNOON, 18));
		listaEstudiante.add(new Estudiante("Cristina", "Camacho", "Navarro", "cr@java.com", TipoSexo.MUJER, LocalDate.now(), TipoFacultad.EMPRESARIALES, 8.0, TipoSesion.MORNING, 22));
		listaEstudiante.add(new Estudiante("Hugo", "Navarro", "Llull", "hu@java.com", TipoSexo.HOMBRE, LocalDate.now(), TipoFacultad.EMPRESARIALES, 6.0, TipoSesion.AFTERNOON, 14));
		listaEstudiante.add(new Estudiante("Arturo", "Mendoza", "Benji", "ar@java.com", TipoSexo.HOMBRE, LocalDate.now(), TipoFacultad.EMPRESARIALES, 20.0, TipoSesion.MORNING, 24));
		
		//4. Calcular el total de asignaturas matriculadas por todos los estudiantes
		Double totalAsignatura = listaEstudiante.stream()
				.mapToDouble(Estudiante::getTotalMatriculas).sum();
		//System.out.println(totalAsignatura);
		
		//5. Crear una colección que contenga el numero total de estudiantes matriculados por facultad
		Map<TipoFacultad, Long> totalEstudiantesPorFacultad = listaEstudiante.stream()
				.collect(Collectors.groupingBy(Estudiante::getFacultad, Collectors.counting()));
		//System.out.println(totalEstudiantesPorFacultad);
		
		//6. Crear una colección que contenga a los estudiantes agrupados por facultad
		Map<TipoFacultad, List<Estudiante>> estudiantesPorFacultad = listaEstudiante.stream()
				.collect(Collectors.groupingBy(Estudiante::getFacultad));
		//System.out.println(estudiantesPorFacultad);
		
		//7. Recorrer la colección creada en el punto anterior, es decir, el mapa de estudiantes agrupados por facultad y 
		//visualizar el nombre de los estudiantes del sexo Femenino	mayores de 18 años.
		for(Map.Entry<TipoFacultad, List<Estudiante>> entry : estudiantesPorFacultad.entrySet()) {
			entry.getValue().stream()
			.filter(e -> e.getEdad() > 18 && e.getSexo().equals(TipoSexo.MUJER));//
			//.forEach(e -> System.out.println(e.getNombre()));
		}
		
		//8. Crear una colección de estudiantes agrupados por Sesión.
		Map<TipoSesion, List<Estudiante>> estudiantesPorSesion = listaEstudiante.stream()
				.collect(Collectors.groupingBy(Estudiante::getSesion));
		//System.out.println(estudiantesPorSesion);
		
		//9. Crear una colección que contenga los nombres de los estudiantes agrupados por Sesión, y que sean solamente de la 
		//Facultad de Informática. Visualizar los nombres de los estudiantes en orden alfabético, es decir, en orden natural
		
		Map<TipoSesion, List<Estudiante>> estudiantesPorSesionDeInformatica = listaEstudiante.stream()
				.filter(e -> e.getFacultad().equals(TipoFacultad.INFORMATICA))
				.collect(Collectors.groupingBy(Estudiante::getSesion));
		
		
		for(Map.Entry<TipoSesion, List<Estudiante>> entry : estudiantesPorSesionDeInformatica.entrySet()) {
			List<Estudiante> listaOrdenada = entry.getValue();
			 listaOrdenada.sort(Estudiante::compareTo);
			for(Estudiante e: listaOrdenada) {
				//System.out.println(e.toString());
			}
		}
		
		//10. Recorrer la colección obtenida en el punto 9, es decir, en el punto anterior, y mostrar solamente los nombres de 
		//los estudiantes que estudian en la Sesión de la mañana, en orden alfabético inverso.
		for(Map.Entry<TipoSesion, List<Estudiante>> entry : estudiantesPorSesionDeInformatica.entrySet()) {
			List<Estudiante> listaOrdenada = entry.getValue();
			Collections.sort(listaOrdenada, (e1,e2) -> e2.compareTo(e1));
			for(Estudiante e: listaOrdenada) {
				System.out.println(e.toString());
			}
		}
		
	}

}
