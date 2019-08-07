package com.principal;

import java.time.LocalDate;

public class Empleado implements Comparable<Empleado>{
	//Propiedades basicas
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private LocalDate fechaAlta;
	private LocalDate fechaBaja;
	private TipoDpto dpto;
	private String correo;
	private Double salario;
	private TipoSexo sexo;
	
	
	
	public Empleado() {
		nombre = "Vacio";
		primerApellido = "Vacio";
		segundoApellido = "Vacio";
		fechaAlta = LocalDate.now();
		fechaBaja = LocalDate.now();
		dpto = TipoDpto.NODEFINIDO;
		correo = "Vacio";
		salario = 0.0;
		sexo = TipoSexo.NODEFINIDO;
	}



	public Empleado(String nombre, String primerApellido, String segundoApellido, LocalDate fechaAlta,
			LocalDate fechaBaja, TipoDpto dpto, String correo, Double salario, TipoSexo sexo) {
		
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.dpto = dpto;
		this.correo = correo;
		this.salario = salario;
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



	public LocalDate getFechaAlta() {
		return fechaAlta;
	}



	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public LocalDate getFechaBaja() {
		return fechaBaja;
	}



	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}



	public TipoDpto getDpto() {
		return dpto;
	}



	public void setDpto(TipoDpto dpto) {
		this.dpto = dpto;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
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
				+ segundoApellido + ", " + fechaAlta + ", " + fechaBaja + ", " + dpto
				+ ", " + correo + ", " + salario + ", " + sexo;
	}



	@Override
	public int compareTo(Empleado o) {
		return this.getSalario().compareTo(o.getSalario());
	}
	
	
	
	
}
