package com.principal;

public class Persona {
		//Propiedades
		private String nombre;
		private TipoSexo sexo;
		private String telefono; 
		
		//Constructor
		public Persona() {
			nombre = "";
			sexo = TipoSexo.NODEFINIDO;
		}

		public Persona(String nombre, TipoSexo sexo) {
			this.nombre = nombre;
			this.sexo = sexo;
		}
		
		public Persona(String nombre, TipoSexo sexo, String telefono) {
			this.nombre = nombre;
			this.sexo = sexo;
			this.telefono = telefono;
		}

		//Get and Set
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public TipoSexo getSexo() {
			return sexo;
		}

		public void setSexo(TipoSexo sexo) {
			this.sexo = sexo;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		

}
