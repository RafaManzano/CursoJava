package com.principal;

import java.beans.FeatureDescriptor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
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
		
		List<Vuelo> listaVuelo = new ArrayList<>();
		listaVuelo.add(new Vuelo("Madrid", 35.20, LocalDateTime.now(), LocalDateTime.of(LocalDate.now(), LocalTime.of(7, 35)), 3, new ArrayList<>(Arrays.asList(listaPasajero.get(0), listaPasajero.get(1), listaPasajero.get(2)))));
		listaVuelo.add(new Vuelo("Cuba", 1200.25, LocalDateTime.now(), LocalDateTime.of(LocalDate.of(2019, Month.AUGUST,9), LocalTime.of(3, 25)), 3, new ArrayList<>(Arrays.asList(listaPasajero.get(3), listaPasajero.get(4), listaPasajero.get(5)))));
		listaVuelo.add(new Vuelo("Estocolmo", 150.10, LocalDateTime.of(LocalDate.of(2019,Month.AUGUST,6), LocalTime.of(7,0)), LocalDateTime.of(LocalDate.now(), LocalTime.now()), 2, new ArrayList<>(Arrays.asList(listaPasajero.get(6), listaPasajero.get(7)))));
		
		//System.out.println(listaVuelo);
		
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
		/*
		Map<String, List<Pasajero>> pasajerosPorDestino = listaVuelo.stream()
				.collect(Collectors.groupingBy(Vuelo::getDestino, Collectors.Vuelo::getPasajero));
		 */
	}

}
