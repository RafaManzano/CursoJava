package com.principal;

public class MainByke {

	public static void main(String[] args) {
		Estudiante e = new Estudiante();
		
		e.setNombre("Daniel");
		System.out.println(e.getNombre());
		
		Estudiante jorge = new Estudiante("Jorge", TipoSexo.HOMBRE, "605988630");
		
		//Aqui fue donde explico las diferencias entre protected y private
		//No es necesario protected asi que no lo puse de todas formas las diferencias con private
		//es que las herencias, esa propiedad se hereda como publica y puede accederse directamente
		System.out.println("Telefono de " + jorge.getNombre() + " es : " + jorge.getTelefono());
		
		Estudiante e1 = new Estudiante(10);
		
		System.out.println(e1.getNombre());

	}

}
