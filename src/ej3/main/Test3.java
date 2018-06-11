package ej3.main;

import ej3.clases.Cuenta;

public class Test3 {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("41.223.085" , 2500 , 2 );
		
	
		System.out.println("El saldo es: $" + c1.getSaldo());
		c1.actualizarSaldo();
		System.out.println(c1.getSaldo());
		c1.ingresar(1000);
		System.out.println();
		c1.retirar(8000);
		System.out.println("");
		System.out.println(c1.getSaldo());
		System.out.println(c1.toString());
		
		
		
		

	}

}
