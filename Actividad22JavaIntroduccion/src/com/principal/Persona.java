package com.principal;

public class Persona {
	//Propiedades
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Integer edad;
	private TipoSexo sexo;
	
	public final Integer MAYOR_EDAD = 18;
	
	//Cuenta los objetos que se han realizado de la clase
	private static int totalPersonas = 0; 
	
	//Constructor
	public Persona() {
		super();
		totalPersonas++;
		this.nombre = "Jesus";
		this.primerApellido = "Solis";
	}

	public Persona(String nombre, String primerApellido, String segundoApellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		totalPersonas++;
	}
	
	public Persona(String nombre, String primerApellido, String segundoApellido, Integer edad, TipoSexo sexo) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		this.sexo = sexo;
		totalPersonas++;
	}

	//Get and Set
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	//Metodos anhadidos
	@Override
	public String toString() {
		return nombre + ", " + primerApellido + ", " + segundoApellido + ", " + edad;
	}
	
	public Boolean esMenorDeEdad() {
		return this.edad.equals(MAYOR_EDAD) || this.edad > MAYOR_EDAD ? false:true;
	}

	public static int getTotalPersonas() {
		return totalPersonas;
	}

	public static void setTotalPersonas(int totalPersonas) {
		Persona.totalPersonas = totalPersonas;
	}
	
	
	
	
}
