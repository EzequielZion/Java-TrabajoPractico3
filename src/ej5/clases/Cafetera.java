package ej5.clases;

public class Cafetera {

	private int capacidadMaxima;
	private int capacidadActual;

	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.capacidadActual = 0;
	}

	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = this.capacidadMaxima;
	}

	public Cafetera(int capacidadMaxima, int capacidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadActual;
		if (capacidadActual > capacidadMaxima) {
			this.capacidadMaxima = capacidadActual;
		}
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void llenarCafetera() {
		this.setCapacidadActual(this.getCapacidadMaxima());
	}

	public void servirTaza(int taza) {
		if (taza > this.capacidadActual) {
			this.capacidadActual = 0;
		} else {
			this.capacidadActual -= taza;
		}
	}
	
	public void vaciarCafetera(){
		this.capacidadActual = 0;
	}
	
	public void agregarCafe(int cafe){
		this.capacidadActual += cafe;
	}
	
	@Override
	public String toString() {
		return "[Capacidad actual: " + getCapacidadActual() + " / " + "Capacidad máxima: " + getCapacidadMaxima()+"]";
	}
	
	
}
