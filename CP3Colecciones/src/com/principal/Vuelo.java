package com.principal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {

	private String destino;
	private Double precio;
	private LocalDateTime fechaYHoraSalida;
	private LocalDateTime fechaYHoraLlegada;
	private Integer numeroPlazas;
	private List<Pasajero> pasajero;
	
	
	
	public Vuelo() {
		destino = "No Definido";
		precio = 0.0;
		fechaYHoraSalida = null;
		fechaYHoraLlegada = null;
		numeroPlazas = 0;
		pasajero = new ArrayList<>();
	}



	public Vuelo(String destino, Double precio, LocalDateTime fechaYHoraSalida, LocalDateTime fechaYHoraLlegada,
			Integer numeroPlazas, List<Pasajero> pasajero) {
		this.destino = destino;
		this.precio = precio;
		this.fechaYHoraSalida = fechaYHoraSalida;
		this.fechaYHoraLlegada = fechaYHoraLlegada;
		this.numeroPlazas = numeroPlazas;
		this.pasajero = pasajero;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	public LocalDateTime getFechaYHoraSalida() {
		return fechaYHoraSalida;
	}



	public void setFechaYHoraSalida(LocalDateTime fechaYHoraSalida) {
		this.fechaYHoraSalida = fechaYHoraSalida;
	}



	public LocalDateTime getFechaYHoraLlegada() {
		return fechaYHoraLlegada;
	}



	public void setFechaYHoraLlegada(LocalDateTime fechaYHoraLlegada) {
		this.fechaYHoraLlegada = fechaYHoraLlegada;
	}



	public Integer getNumeroPlazas() {
		return numeroPlazas;
	}



	public void setNumeroPlazas(Integer numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}



	public List<Pasajero> getPasajero() {
		return pasajero;
	}



	public void setPasajero(List<Pasajero> pasajero) {
		this.pasajero = pasajero;
	}



	@Override
	public String toString() {
		return destino + ", " + precio + ", " + fechaYHoraSalida
				+ ", " + fechaYHoraLlegada + ", " + numeroPlazas;
	}
	
	
	
	
}
