package com.principal;

public class Estudiante extends Persona {
	
	private Integer totalAsignaturas;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String nombre, TipoSexo sexo, String telefono) {
		super(nombre, sexo, telefono);
	}

	public Estudiante(Integer totalAsignaturas) {
		super();
		this.totalAsignaturas = totalAsignaturas;
	}
}
