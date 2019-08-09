package com.principal;

import java.time.LocalDate;

public class Pasajero implements Comparable<Pasajero>{

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private LocalDate fechaNacimiento;
	private TipoSexo sexo;
	
	
	public Pasajero() {
		nombre = "No Definido";
		primerApellido = "No Definido";
		segundoApellido = "No Definido";
		fechaNacimiento = null;
		sexo = TipoSexo.NODEFINIDO;
	}


	public Pasajero(String nombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento,
			TipoSexo sexo) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPrimerApellido() {
		return primerApellido;
	}


	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}


	public String getSegundoApellido() {
		return segundoApellido;
	}


	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public TipoSexo getSexo() {
		return sexo;
	}


	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return nombre + ", " + primerApellido + ", "
				+ segundoApellido;
	}
	
	/*
	@Override
	public int compareTo(Pasajero e2) {
		return this.getSexo().compareTo(e2.getSexo()) == 0 ?
				this.getFechaNacimiento().compareTo(e2.getFechaNacimiento()) :
				this.getSexo().compareTo(e2.getSexo())	;
	}
	*/
	
	@Override
	public int compareTo(Pasajero e2) {
		return this.getPrimerApellido().compareTo(e2.getPrimerApellido()) == 0 ?
				this.getSegundoApellido().compareTo(e2.getSegundoApellido()) == 0 ? 
						this.getNombre().compareTo(e2.getNombre()) : 
						this.getSegundoApellido().compareTo(getSegundoApellido()):
				this.getPrimerApellido().compareTo(e2.getPrimerApellido());
	}
	
	
	
}
