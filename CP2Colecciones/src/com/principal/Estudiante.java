package com.principal;

import java.time.LocalDate;

public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String correo;
	private TipoSexo sexo;
	private LocalDate fechaMatriculacion;
	private TipoFacultad facultad;
	private Double totalMatriculas;
	private TipoSesion sesion;
	private Integer edad;
	
	
	public Estudiante() {
		nombre = "Vacio";
		primerApellido = "Vacio";
		segundoApellido = "Vacio";
		correo = "Vacio";
		sexo = TipoSexo.NODEFINIDO;
		fechaMatriculacion = LocalDate.now();
		facultad = TipoFacultad.NODEFINIDO;
		totalMatriculas = 0.0;
		sesion = TipoSesion.NODEFINIDO;
		edad = 0;
	}
	
	


	public Estudiante(String nombre, String primerApellido, String segundoApellido, String correo, TipoSexo sexo,
			LocalDate fechaMatriculacion, TipoFacultad facultad, Double totalMatriculas, TipoSesion sesion,
			Integer edad) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.correo = correo;
		this.sexo = sexo;
		this.fechaMatriculacion = fechaMatriculacion;
		this.facultad = facultad;
		this.totalMatriculas = totalMatriculas;
		this.sesion = sesion;
		this.edad = edad;
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


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public TipoSexo getSexo() {
		return sexo;
	}


	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}


	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}


	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}


	public TipoFacultad getFacultad() {
		return facultad;
	}


	public void setFacultad(TipoFacultad facultad) {
		this.facultad = facultad;
	}


	public Double getTotalMatriculas() {
		return totalMatriculas;
	}


	public void setTotalMatriculas(Double totalMatriculas) {
		this.totalMatriculas = totalMatriculas;
	}


	public TipoSesion getSesion() {
		return sesion;
	}


	public void setSesion(TipoSesion sesion) {
		this.sesion = sesion;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}




	@Override
	public String toString() {
		return nombre + ", " + primerApellido + ", " + segundoApellido + ", " + correo + ", " + sexo + ", "	+ fechaMatriculacion + ", " + facultad + ", " + totalMatriculas + 
				", " + sesion + ", " + edad;
	}




	@Override
	public int compareTo(Estudiante o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
	
	
	
	
	
}
