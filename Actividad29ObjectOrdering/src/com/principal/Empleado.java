package com.principal;

public class Empleado implements Comparable<Empleado> {

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

		/*
		@Override
		public String toString() {
			return nombre + ", " + primerApellido + ", " + segundoApellido + ", " + dpto + ", " + salario;
		}
		*/
		
		/*
		@Override
		public String toString() {
			return nombre + ", " + primerApellido + ", " + segundoApellido + "\n";
		}
		*/
		
		@Override
		public String toString() {
			return nombre + ", " + primerApellido + ", " + segundoApellido + ", " + salario + "\n";
		}
		
		//Es el metodo abstracto de la interfaz funcional Comparable
		//Ya se de donde viene
		//Criterio de ordenacion: Primer Apellido en orden alfabetico
		@Override
		public int compareTo(Empleado o) {
			//return this.getPrimerApellido().compareTo(o.getPrimerApellido()); //De la A a Z (Orden Natural)
			//return o.getPrimerApellido().compareTo(this.getPrimerApellido()); //De la Z a A (Orden natural inverso)
			
			//Primer apellido y segundo apellido 
			/* Modificado usando el operador ternario
			int res;
			if(this.getPrimerApellido().compareTo(o.getPrimerApellido()) == 0) {
				res = this.getSegundoApellido().compareTo(o.getSegundoApellido());
			}
			else {
				res = this.getPrimerApellido().compareTo(o.getPrimerApellido());
			}
			
			return ((this.getPrimerApellido().compareTo(o.getPrimerApellido()) == 0) ? //Condicion booleana 
					this.getSegundoApellido().compareTo(o.getSegundoApellido()): //Valor con condicion true
					this.getPrimerApellido().compareTo(o.getPrimerApellido())); //Valor con condicion false
			*/
			
			//Caso Practico. Ordenar por primer apellido, segundo apellido y nombre
			return ((this.getPrimerApellido().compareTo(o.getPrimerApellido()) == 0) ? //Si PrimerApellido es iguales (C1)
						(this.getSegundoApellido().compareTo(o.getSegundoApellido()) == 0) ? //Si Segundo apellido son iguales (La anterior es true) (C2)
								this.getNombre().compareTo(o.getNombre()): //True de condicion de C2
								this.getSegundoApellido().compareTo(o.getSegundoApellido()) : //False de C2
						 this.getPrimerApellido().compareTo(o.getPrimerApellido())); //False de C1
		}
		
		
}
