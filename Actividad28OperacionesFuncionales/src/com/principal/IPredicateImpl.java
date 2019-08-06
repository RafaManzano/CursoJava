package com.principal;

import java.util.function.Predicate;

public class IPredicateImpl implements Predicate<Empleado> {

	//Te devuelve true si el empleado no es de RRHH
	/*
	 * Asi seria mi metodo
	@Override
	public boolean test(Empleado t) {
		boolean res = false;
		
		if(t.getDpto() != TipoDpto.RRHH) {
			res = true;
		}
		
		return res;
	}
	*/
	
	//Metodo de ejemplo de la clase
	@Override
	public boolean test(Empleado t) {
		return t.getDpto() != TipoDpto.RRHH;
	}
}
