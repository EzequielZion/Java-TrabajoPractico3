package ej4.main;

import ej4.clases.Fecha;

public class Test4 {

	public static void main(String[] args) {

		Fecha f1 = new Fecha(10, 1, 2010);
		f1.leer();
		System.out.println(f1.toString());
		System.out.println(f1.diasMes(3));
		f1.siguiente();
		System.out.println(f1.getDia());
		f1.anterior();
		System.out.println(f1.getDia());
		f1.igualQue(10, 1, 2010);
		f1.menorQue(9, 1, 2010);
		f1.mayorQue(11, 1, 2010);

	}

}
