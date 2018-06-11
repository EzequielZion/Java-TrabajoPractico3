package ej5.main;

import ej5.clases.Cafetera;

public class Test5 {

	public static void main(String[] args) {
		
		Cafetera c1 = new Cafetera();
		Cafetera c2 = new Cafetera(1000);
		Cafetera c3 = new Cafetera(1000, 500);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		c1.setCapacidadActual(300);
		c1.setCapacidadMaxima(1500);
		System.out.println(c1.toString());
		
		c1.llenarCafetera();
		System.out.println(c1.toString());
		
		c1.servirTaza(1000);
		System.out.println(c1.toString());
	
		c1.vaciarCafetera();
		System.out.println(c1.toString());
		
		c1.agregarCafe(500);
		System.out.println(c1.toString());
		
		c2.agregarCafe(600);
		System.out.println(c2.toString());
	}	
	

}
