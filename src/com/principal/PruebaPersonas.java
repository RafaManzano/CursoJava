package com.principal;

public class PruebaPersonas {

	public static void main(String[] args) {
		Persona p1;
		Persona p2;
		Persona p3;
		Empleado e1;
		Empleado e2;
		Empleado e3;
		Empleado e4;
		
		
		p1 = new Persona();
		p2 = new Persona("Rafa", (byte)10, TipoSexo.HOMBRE, "1A", true);
		p3 = new Persona(p1);
		
		e1 = new Empleado();
		e2 = new Empleado(p2, "189545sf" , 2.5f);
		e3 = new Empleado(e2);
		e4 = new Empleado("Rafalito", (byte)100, TipoSexo.MUJER, "10A", true, "15452745AFS", 2000.71f);
		
		p2.toString();
		p2.pintar();
		
		e4.toString();
		e4.pintar();
		
		System.out.println(e2.equals(p2));

	}

}
