package com.principal;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Persona persona;
		persona = new Persona();
		
		System.out.println("La persona se llama " + persona.getNombre());
		System.out.println("de apellido " + persona.getPrimerApellido());
		
		Persona daniel = new Persona("Daniel", "Hidalgo", "Murillo", 23);
		
		System.out.println(daniel);
		
		System.out.println(daniel.esMenorDeEdad() ? "Menor de edad" : "Mayor de edad");
		
		System.out.println("Total de objetos personas creados hasta el momento: " + Persona.getTotalPersonas());
		
		System.out.println("***************Personas con sexo******************************************************");
		
		Persona rafa = new Persona("Rafael", "Manzano", "Medina", 24, TipoSexo.HOMBRE);
		Persona blanca = new Persona("Blanca", "Fustero", "Oria", 26, TipoSexo.MUJER);
		Persona encarni = new Persona("Encarnacion", "Mayo", "Fernandez", 29, TipoSexo.MUJER);
		
		//Mostrar el nombre de las personas que son del sexo Mujer
		//Solucion: Agregar las personas a una coleccion (Contenedor, parecido a un array)
		List<Persona> personas;
		
		personas = new ArrayList<>();
		
		personas.add(rafa);
		personas.add(blanca);
		personas.add(encarni);
		personas.add(daniel);
		personas.add(persona);
		
		//Usando for extendido, no he realizado el for normal (mal llamado forEach)
		for(Persona p : personas) {
			if(p.getSexo() != null && p.getSexo() == TipoSexo.MUJER) {
				System.out.println(p.getNombre() + " es una " + p.getSexo());
			}
		}
		
		System.out.println("Total de objetos personas creados hasta el momento: " + Persona.getTotalPersonas());
		
		
		

	}

}
