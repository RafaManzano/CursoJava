package com.principal;

public class Persona {
		//Propiedades
		private String nombre;
		private byte edad;
		private char sexo; 
		private String dni;
		private boolean bCasado;
		
		//Constructor
		public Persona() {
			nombre = "";
			edad = 0;
			sexo = ' '; 
			dni = "";
			bCasado = false;
		}

		public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
			this.dni = dni;
			this.bCasado = bCasado;
		}
		
		public Persona (Persona p) {
			this.nombre = p.getNombre();
			this.edad = p.getEdad();
			this.sexo = p.getSexo();
			this.dni = p.getDNI();
			this.bCasado = p.getBCasado();
		}

		//Get and Set
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public byte getEdad() {
			return edad;
		}

		public void setEdad(byte edad) {
			this.edad = edad;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public String getDNI() {
			return dni;
		}

		public void setDNI(String dni) {
			this.dni = dni;
		}

		public boolean getBCasado() {
			return bCasado;
		}

		public void setBCasado(boolean bCasado) {
			this.bCasado = bCasado;
		}



		
		
}
