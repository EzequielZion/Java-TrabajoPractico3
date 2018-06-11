package ej2.main;

import ej2.clases.Animal;

public class test {

	public static void main(String[] args) {
		
		Animal perro1 = new Animal("Bóxer" , "Juana" , "6");
		Animal perro2 = new Animal("Ovejero" , "Luna" , "10");
		
		perro1.setRaza("Bóxer");
		perro1.setNombre("Juana");
		perro1.setEdad("6");
		
		perro2.setRaza("Ovejero");
		perro2.setNombre("Luna");
		perro2.setEdad("10");
		
		System.out.println(perro1.toString());
		System.out.println(perro2.toString());
		
		
		

	}

}
