package com.principal;

public class Persona {
	//Propiedades
	protected String nombre;
	protected byte edad; //Es un numero entero de -128 a 127
	protected TipoSexo sexo; //Es el enum que lo tengo en una clase aparte
	protected String dni;
	protected boolean bCasado;
	
	//Constructor
	public Persona() { //El constructor sin parametros lo uso para inicializar las variables a algo no identificativo
		nombre = "VACIO";
		edad = 0;
		sexo = TipoSexo.VACIO; 
		dni = "VACIO";
		bCasado = false;
	}

	public Persona(String nombre, byte edad, TipoSexo sexo, String dni, boolean bCasado) { 
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
		this.bCasado = bCasado;
	}
	
	public Persona (Persona p) { //Para el constructor de copia uso los get del objeto introducido por parametro
		//Asi se haria una copia completa sin tener una propiedad privada de un objeto que seria si mismo
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

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
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

	//Metodos de la clase object
	//Se sobreescribe de la clase padre (Object)
	@Override
	public String toString() {
		return nombre +  ", " + edad + ", " + sexo + ", " + dni + ", " + bCasado;
	}
	
	@Override
	//Se sobreescribe de la clase padre (Object)
	public boolean equals(Object obj) {
		boolean res = false; //Si todo falla el objeto devuelve null
		
		if(this == obj) { //Hay que comprobar que el objeto que es llamado (this) no es la misma que la introducida por parametros (obj)
			res = true;
		}
		//Sino
		else if(obj != null && obj instanceof Persona) {  //Comprobamos que el obj no es null y es una instancia de la clase Persona
			Persona p = (Persona)obj; //Si es correcto se crea un objeto Persona (p)
			
			if(this.dni == p.getDNI()) { //Se comprueba que el campo que queremos es igual al objeto que es llamado (this) 
				// al objeto que introducimos por parametros (Recordad que se volco en el objeto p)
				res = true;
			}
		}
		
		return res;
		//Se podria usar varios returns pero no es aconsejable
	}

	//Metodos anhadidos
	//Seria un procedimiento para pintar de otra forma
	public void pintar() {
		System.out.println("Este es el metodo pintar de la clase de Persona");
		System.out.println(nombre +  ", " + edad + ", " + sexo + ", " + dni + ", " + bCasado);
	}
}
