package com.casoPractico3;

public abstract class Empleado extends Persona { //Herencia con Persona

	//Propiedades
	private String idPersonal;
	private float sueldo;
	
	//Constructor
	public Empleado() { //Constructor sin parametros
		super(); //llamamos al constructor sin parametros de la clase padre (Persona)
		idPersonal = "VACIO";
		sueldo = 0f;
	}
	
	public Empleado(Persona p, String idPersonal, float sueldo) { //Constructor con el objeto p (Persona) y dos parametros
		super(p);
		this.idPersonal = idPersonal;
		this.sueldo = sueldo;
	}
	public Empleado(Empleado e) { //Constructor con el objeto e (Empleado)
		super(e.getNombre(), e.getEdad(), e.getSexo(), e.getDNI(), e.getBCasado());
		this.idPersonal = e.getIDPersonal();
		this.sueldo = e.getSueldo();
		
		
	}
	public Empleado(String nombre, byte edad, TipoSexo sexo, String dni, boolean bCasado, String idPersonal, float sueldo) {
		//Constructor con los parametros de la clase Persona (nombre, edad, sexo, dni, bCasado) y de la clase Empleado (idPersonal, sueldo)
		super(nombre, edad, sexo, dni, bCasado);
		this.idPersonal = idPersonal;
		this.sueldo = sueldo;
	}

	//Get and Set
	public String getIDPersonal() {
		return idPersonal;
	}

	public void setIDPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	//Metodos de la clase object
	@Override
	public String toString() {
		return super.toString() + ", " + idPersonal + ", " + sueldo;
	}
	
	//Metodos anhadidos
	@Override
	public void pintar() {
		System.out.println("Este es el metodo pintar de la clase de Empleado");
		System.out.println(super.toString() + ", " + idPersonal + ", " + sueldo);
	}
	
	
	public abstract double calcularAntiguedadMensual();
	public abstract double calcularComplementosMensuales();
	
	public double calcularSueldoBrutoMensual() {
		double resultado;
		
		resultado = sueldo + calcularComplementosMensuales() + calcularAntiguedadMensual();
		
		return resultado;
	}
	
	public void inctoSueldo(double porcentaje) {
		setSueldo((float)(sueldo * porcentaje) / 100);
	}
	
}
