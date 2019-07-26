package com.principal;

public class Tecnico extends Empleado{
	//Propiedades
		private int complemento;
		private int quinquenios;
		
		//Constructor
		public Tecnico() {
			super();
			complemento = 0;
			quinquenios = 0;
		}
		
		public Tecnico(String nombre, byte edad, TipoSexo sexo, String dni, boolean bCasado, String idPersonal, float sueldo, int complemento, int quinquenios) {
			super(nombre, edad, sexo, dni, bCasado, idPersonal, sueldo);
			this.complemento = complemento;
			this.quinquenios = quinquenios;
		}

		@Override
		public double calcularAntiguedadMensual() {
			double resultado;
			resultado = quinquenios * 1.05;
			return resultado;
		}

		//Metodos abstract
		@Override
		public double calcularComplementosMensuales() {
			double resultado = 0.0;
			
			resultado = (getSueldo() * complemento) / 100;
			
			return resultado;
		}
}
