package tema.nuevo.array;

import java.util.ArrayList;

public class TemaNuevo {

	public static void main(String[] args) {
		
		int promedio = 0;
		int cantidad = 0;
		
		ArrayList<Integer> aEnteros = new ArrayList<Integer>();
		ArrayList<String> aTextos = new ArrayList<String>();
		
		aEnteros.add(10);
		aEnteros.add(7);
		aEnteros.add(5);
		aTextos.add("Lautaro");
		
		aEnteros.size();
		aTextos.size();
		
		aEnteros.remove(0);
		System.out.println(aEnteros);
		System.out.println(aEnteros.get(0));
		
		System.out.println("Elemento 5: " + aEnteros.get(4));
		System.out.println("Total de elementos: " + aEnteros.size());
		System.out.println("Último elemento: " + aEnteros.get(aEnteros.size())); 
		System.out.println("Todos los elementos: " + aEnteros.toString());
	}
	

}
