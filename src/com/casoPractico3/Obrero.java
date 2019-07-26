package com.casoPractico3;

public class Obrero extends Empleado {
	//Propiedades
	private int trienio;
	private TipoTurno turno;
	
	//Constructor
	public Obrero() {
		super();
		trienio = 0;
		turno = TipoTurno.VACIO;
	}
	
	public Obrero(String nombre, byte edad, TipoSexo sexo, String dni, boolean bCasado, String idPersonal, float sueldo, int trienios, TipoTurno turno) {
		super(nombre, edad, sexo, dni, bCasado, idPersonal, sueldo);
		this.trienio = trienios;
		this.turno = turno;
	}

	@Override
	public double calcularAntiguedadMensual() {
		double resultado;
		resultado = trienio * 1.03;
		return resultado;
	}

	//Metodos abstract
	@Override
	public double calcularComplementosMensuales() {
		double resultado = 0.0;
		switch(turno) {
		
			case DIA:
				resultado = (3 * getSueldo()) /100;
			break;
			
			case MANHANA:
				resultado = (5 * getSueldo()) /100;
			break;
			
			case TARDE:
				resultado = (10 * getSueldo()) /100;
			break;
			
			case NOCHE:
				resultado = (15 * getSueldo()) /100;
			break;
			
		}
		return resultado;
	}
}
