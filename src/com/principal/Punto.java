package com.principal;

public class Punto {

	private int x;
	private int y;
	private int z;
	
	public Punto() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Punto(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Punto(Punto p) {
		this.x = p.getX();
		this.y = p.getY();
		this.z = p.getZ();
	}

	//Get and Set
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public int hashCode() {
		return z * x * y + 20 * 21 * 17 - 11;
	}
	
}
