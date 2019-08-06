package com.principal;

public class RoadByke implements IByke {

	//Propiedades
	private int cadence;
	private int gear;
	private double speed;
	
	//Constructor
	public RoadByke() {
		cadence = 0;
		gear = 0;
		speed = 0.0;
	}

	public RoadByke(int cadence, int gear, double speed) {
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
	}

	//Get and Set
	/* Muestra para interfaces
	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	*/

	//Metodos anhadidos
	@Override
	public void changeCadence(int cadence) {
		this.cadence = cadence;
	}
	
	@Override
	public void changeGear(int gear) {
		this.gear = (int) (gear * 0.5);
	}
	
	@Override
	public void speedUp(double speed) {
		this.speed += 2 * speed;
	}
	
	
	
}
