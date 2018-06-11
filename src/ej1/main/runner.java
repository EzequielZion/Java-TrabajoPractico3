package ej1.main;

import ej1.clases.Persona;

public class runner {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		Persona p2 = new Persona("Tomás", "Gutierrez", "123");

		p1.setNombre("Lautaro");
		p1.setApellido("Rasulo");
		p1.setDireccion("Chile 112");
		/*
		 * p2.setNombre("Tomás"); p2.setApellido("Gutierrez");
		 * p2.setDireccion("123");
		 */
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
