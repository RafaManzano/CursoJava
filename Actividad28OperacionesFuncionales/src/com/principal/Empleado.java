package com.principal;

public class Empleado {

	//PROPIEDADES
		private String nombre;
		private String primerApellido;
		private String segundoApellido;
		private TipoDpto dpto;
		private Double salario;
		
		//CONSTRUCTORES
		public Empleado() {
			nombre = " ";
			primerApellido = " ";
			segundoApellido = " ";
			dpto = TipoDpto.NODEFINIDO;
			salario = 0.0;
		}
		
		public Empleado(String nombre, String primerApellido, String segundoApellido, TipoDpto dpto, Double salario) {
			this.nombre = nombre;
			this.primerApellido = primerApellido;
			this.segundoApellido = segundoApellido;
			this.dpto = dpto;
			this.salario = salario;
		}
		
		public Empleado(Empleado e) {
			this.nombre = e.getNombre();
			this.primerApellido = e.getPrimerApellido();
			this.segundoApellido = e.getSegundoApellido();
			this.dpto = e.getDpto();
			this.salario = e.getSalario();
		}

		//GET AND SET
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

		public TipoDpto getDpto() {
			return dpto;
		}

		public void setDpto(TipoDpto dpto) {
			this.dpto = dpto;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalario(Double salario) {
			this.salario = salario;
		}

		@Override
		public String toString() {
			return nombre + ", " + primerApellido + ", " + segundoApellido + ", " + dpto + ", " + salario;
		}
		
		
}
