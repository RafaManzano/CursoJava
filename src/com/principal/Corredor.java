package com.principal;

public class Corredor extends Persona {

	//Propiedades
	private float datoDistancia;
	
	//Constructor
	public Corredor(Persona p, float datoDistancia) {
		super(p);
		this.datoDistancia = datoDistancia;
	}
	
	public Corredor(String nombre, byte edad, TipoSexo sexo, String dni, boolean bCasado, float datoDistancia) {
		//Constructor con los parametros de la clase Persona (nombre, edad, sexo, dni, bCasado) y de la clase Corredor (datoDistancia)
		super(nombre, edad, sexo, dni, bCasado);
		this.datoDistancia = datoDistancia;
	}
	
	//Get and Set
	public float getDatoDistancia() {
		return datoDistancia;
	}

	public void setDatoDistancia(float datoDistancia) {
		this.datoDistancia = datoDistancia;
	}
	
	//Metodos sobreescritos
	@Override
	public void pintar() {
		System.out.println("Metodo pintar de corredor");
		System.out.println(nombre +  ", " + edad + ", " + sexo + ", " + dni + ", " + bCasado + ", " + datoDistancia);
	}
	
}
