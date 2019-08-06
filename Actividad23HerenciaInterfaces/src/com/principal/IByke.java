package com.principal;

public interface IByke {

	public void changeCadence(int cadence);
	
	public void changeGear(int gear);
	
	public void speedUp(double speed);
}

//Una interfaz funcional puede tener cualquier cantidad de metodos (por defecto y estaticos), 
//que ya tienen implementado su cuerpo pero solamente un solo metodo abstract 