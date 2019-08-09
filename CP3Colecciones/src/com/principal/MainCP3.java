package com.principal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MainCP3 {

	public static void main(String[] args) {
		
		List<Pasajero> listaPasajero = new ArrayList<>();
		listaPasajero.add(new Pasajero("Rafael", "Manzano", "Medina", LocalDate.of(1995, Month.JUNE, 23), TipoSexo.HOMBRE));
		listaPasajero.add(new Pasajero("Enriqueta", "Acevedo", "Ibarra", LocalDate.of(1980, Month.JANUARY, 23), TipoSexo.MUJER));
		listaPasajero.add(new Pasajero("Carolina", "Acosta", "Garbajosa", LocalDate.of(2000, Month.MAY, 10), TipoSexo.MUJER));
		listaPasajero.add(new Pasajero("Jose", "Alarcon", "Gasol", LocalDate.of(1972, Month.SEPTEMBER, 2), TipoSexo.HOMBRE));
		listaPasajero.add(new Pasajero("Hipolito", "Lopez", "Yelotro", LocalDate.of(1995, Month.APRIL, 11), TipoSexo.HOMBRE));
		listaPasajero.add(new Pasajero("Jose Israel", "Perez", "Abrines", LocalDate.of(1962, Month.DECEMBER, 25), TipoSexo.HOMBRE));
		listaPasajero.add(new Pasajero("Cristina", "Camacho", "Navarro", LocalDate.of(1978, Month.MARCH, 23), TipoSexo.MUJER));
		listaPasajero.add(new Pasajero("Hugo", "Navarro", "Llull", LocalDate.of(2002, Month.NOVEMBER, 15), TipoSexo.HOMBRE));
		
		//listaPasajero.add(new Pasajero("Arturo", "Mendoza", "Benji", LocalDate.of(1995, Month.JUNE, 23), TipoSexo.HOMBRE));
		//System.out.println(listaPasajero);
		
		List<Pasajero> pasajeroMadrid = new ArrayList<Pasajero>();
		pasajeroMadrid.add(new Pasajero("Rafael", "Manzano", "Medina", LocalDate.of(1995, Month.JUNE, 23), TipoSexo.HOMBRE));
		pasajeroMadrid.add(new Pasajero("Enriqueta", "Acevedo", "Ibarra", LocalDate.of(1980, Month.JANUARY, 23), TipoSexo.MUJER));
		pasajeroMadrid.add(new Pasajero("Carolina", "Acosta", "Garbajosa", LocalDate.of(2000, Month.MAY, 10), TipoSexo.MUJER));
		
		List<Pasajero> pasajeroCuba = new ArrayList<Pasajero>();
		pasajeroMadrid.add(new Pasajero("Jose", "Alarcon", "Gasol", LocalDate.of(1972, Month.SEPTEMBER, 2), TipoSexo.HOMBRE));
		pasajeroMadrid.add(new Pasajero("Hipolito", "Lopez", "Yelotro", LocalDate.of(1995, Month.APRIL, 11), TipoSexo.HOMBRE));
		pasajeroMadrid.add(new Pasajero("Jose Israel", "Perez", "Abrines", LocalDate.of(1962, Month.DECEMBER, 25), TipoSexo.HOMBRE));
		
		List<Pasajero> pasajeroEstocolmo = new ArrayList<Pasajero>();
		pasajeroEstocolmo.add(new Pasajero("Cristina", "Camacho", "Navarro", LocalDate.of(1978, Month.MARCH, 23), TipoSexo.MUJER));
		pasajeroEstocolmo.add(new Pasajero("Hugo", "Navarro", "Llull", LocalDate.of(2002, Month.NOVEMBER, 15), TipoSexo.HOMBRE));
		
		
		List<Vuelo> listaVuelo = new ArrayList<>();
		listaVuelo.add(new Vuelo("Madrid", 35.20, LocalDateTime.now(), LocalDateTime.of(LocalDate.now(), LocalTime.of(7, 35)), 3, pasajeroMadrid));
		listaVuelo.add(new Vuelo("Cuba", 1200.25, LocalDateTime.now(), LocalDateTime.of(LocalDate.of(2019, Month.AUGUST,9), LocalTime.of(3, 25)), 3, pasajeroCuba));
		listaVuelo.add(new Vuelo("Estocolmo", 150.10, LocalDateTime.of(LocalDate.of(2019,Month.AUGUST,6), LocalTime.of(7,0)), LocalDateTime.of(LocalDate.now(), LocalTime.now()), 2, pasajeroEstocolmo));
		
		System.out.println(listaVuelo);
		
		//1. Obtener un listado de los vuelos que tienen el numero de plazas completo
		List<Vuelo> vuelosCompletos = listaVuelo.stream()
				.filter(v -> v.getNumeroPlazas() == 3)
				.collect(Collectors.toList());
		//System.out.println(vuelosCompletos);
		
		//2. Obtener un listado de los vuelos que tienen fecha de salida prevista para el día de hoy
		List<Vuelo> fechaSalidaHoy = listaVuelo.stream()
				.filter(v -> LocalDate.now().equals(v.getFechaYHoraSalida().toLocalDate()))
				.collect(Collectors.toList());
		//System.out.println(fechaSalidaHoy);
		
		//3. Obtener un listado de los vuelos cuya duración sea mayor de 10 horas
		List<Vuelo> vueloLargo = listaVuelo.stream()
				.filter(v -> ChronoUnit.HOURS.between(v.getFechaYHoraSalida(), v.getFechaYHoraLlegada()) > 10)
				.collect(Collectors.toList());
		//System.out.println(vueloLargo);
		
		//4. Obtener un listado de los vuelos que pueden demorar mas de un día en llegar a su destino
		List<Vuelo> vueloDemoradoMas1Dia = listaVuelo.stream()
				.filter(v -> ChronoUnit.DAYS.between(v.getFechaYHoraSalida(), v.getFechaYHoraLlegada()) > 1)
				.collect(Collectors.toList());
		System.out.println(vueloDemoradoMas1Dia);
		
		//5. Obtener una colección que almacene un listado de pasajeros agrupado por el destino del vuelo.
		
		Map<String, List<List<Pasajero>>> pasajerosPorDestino = listaVuelo.stream()
				.collect(Collectors.groupingBy(Vuelo::getDestino, Collectors.mapping(Vuelo::getPasajero, Collectors.toList())));
		System.out.println(pasajerosPorDestino);
		 
		
		//6. Crear una colección que almacene los vuelos que están programados para salir en la semana
		//próxima, es decir, dentro de 7 días
		List<Vuelo> vuelosEnUnaSemana = listaVuelo.stream()
				.filter(v -> ChronoUnit.DAYS.between(v.getFechaYHoraSalida(), LocalDateTime.of(2019, Month.AUGUST, 15, 0, 0)) < 7)
				.collect(Collectors.toList());
		//System.out.println(vuelosEnUnaSemana);
		
		//7. Crear una colección que almacene los pasajeros, por el sexo y la edad del pasajero
		List<Pasajero> listaOrdenadaSE = listaPasajero;
		Collections.sort(listaOrdenadaSE);
		//System.out.println(listaOrdenadaSE);
		
		//8. Mostrar la colección anterior ordenada por el nombre y los apellidos de los pasajeros en orden
		//natural.
		List<Pasajero> listaOrdenadaNA = listaOrdenadaSE;
		Collections.sort(listaOrdenadaNA);
		//System.out.println(listaOrdenadaNA);
		
		//9. Mostrar la colección del punto 7 ordenada en orden alfabético inverso por el primer apellido.
		Collections.sort(listaOrdenadaSE, (e1,e2) -> e2.getPrimerApellido().compareTo(e1.getPrimerApellido()));
		System.out.println(listaOrdenadaSE);
		
		//10. Obtener una colección que almacene el nombre y el apellido de los pasajeros, agrupado por las
		//horas de duración de su viaje
		
		/*
		Map<Long, String> horasPasajeros = listaVuelo.stream()
				.collect(Collectors.groupingBy(Vuelo::tiempoTranscurrido, Collectors.mapping(Vuelo::getPasajero, Collectors.toList().toString())));
		*/
		
		//listaVuelo.stream().collect(Collectors.toMap(Vuelo::tiempoTranscurrido, Collectors.mapping(Vuelo::getPasajero, downstream)));
		
		Map<Long, List<String>> nombrePasajeroHoras = new TreeMap<>();
		
		for(Vuelo v: listaVuelo) {
			List<Pasajero> p = v.getPasajero();
			Long tiempo = v.tiempoTranscurrido();
			List<String> s = new ArrayList<>();
			
			for(Pasajero pj : p) {
				s.add(pj.toString());
			}
			nombrePasajeroHoras.put(tiempo, s);
		}
		
		//11. Mostrar el listado de pasajeros ordenado de mayor a menor por la duración del viaje
		Map<Long, List<String>> nombrePasajeroHorasInvertido = new TreeMap<>((e1,e2) -> e2.compareTo(e1));
		nombrePasajeroHorasInvertido.putAll(nombrePasajeroHoras);
		
		System.out.println(nombrePasajeroHorasInvertido);
		
		//12. Enviar un mensaje a los pasajeros cuyo vuelo saldrá en las próximas 3 horas.
		listaVuelo.stream()
		.filter(e -> ChronoUnit.HOURS.between(e.getFechaYHoraLlegada().toLocalTime(), LocalTime.now()) < 3)
		.forEach(e -> System.out.println("El vuelo con destino " + e.getDestino() + " sale en menos de 3h"));
		
		//13. Enviar un mensaje a los pasajeros cuyo vuelo saldrá en los próximos 3 días
		listaVuelo.stream()
		.filter(e -> Duration.between(e.getFechaYHoraLlegada().toLocalDate(), LocalDate.now()).toHours() < 3)
		.forEach(e -> System.out.println("El vuelo con destino " + e.getDestino() + " sale en menos de 3 dias"));
		
		//14. Crear una colección que almacene el listado de pasajeros agrupado por el día en que tiene lugar su
		//vuelo, considerando que el vuelo tiene lugar en el mes en curso. Al mostrar la colección
		//resultante, mostrar el nombre del día de la semana en español.
		/*
		Map<Object, List<List<Pasajero>>>  diaVuelo = listaVuelo.stream()
		.filter(e -> ChronoUnit.MONTHS.between(e.getFechaYHoraLlegada(), LocalDate.now()) == 0)
		.collect(Collectors.groupingBy(Vuelo::obtenerDia));
		
		System.out.println(diaVuelo);
		*/
		//15. Crear una colección de los vuelos que no están previstos para el mes en curso y mostrar el
		//nombre del mes para el cual esta prevista su fecha de salida, en español.
		
		
		
	}

}
