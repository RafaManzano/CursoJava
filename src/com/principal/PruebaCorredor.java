package com.principal;

public class PruebaCorredor {

	public static void main(String[] args) {
		Persona p1 = new Persona("Rafa", (byte)10, TipoSexo.HOMBRE, "1A", true);
		Corredor c1 = new Corredor(p1, 15.20f);
		Corredor c2 = new Corredor("Jesus", (byte)8, TipoSexo.HOMBRE, "75063S", false, 250.1f);
		
		c1.pintar();
		c2.pintar();
	}

}
