package com.casoPractico3;

public class PruebaPuntos  {

	public static void main(String[] args) {
		Punto p1 = new Punto(10,6,9);
		Punto p2 = new Punto(29,1,20);
		Punto p3 = new Punto(1,2,3);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}

}
