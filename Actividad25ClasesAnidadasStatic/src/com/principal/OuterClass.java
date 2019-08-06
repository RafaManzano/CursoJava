package com.principal;

public class OuterClass {
	
	private String nombre;
	
	
	static class StaticInnerClass {
		private static String dni;

		public static String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodo para acceder al DNI
	public String dameDNI() {
		return StaticInnerClass.getDni();
		
	}
	
	

}
