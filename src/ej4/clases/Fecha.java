package ej4.clases;

import java.util.Scanner;

public class Fecha {

	private static Scanner input;
	private int dia;
	private int mes;
	private int anio;

	public Fecha() {
	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return "[Día: " + dia + " Mes: " + mes + " Anio: " + anio + "]";
	}

	public void leer() {
		input = new Scanner(System.in);
		int ing_dia;
		int ing_mes;
		int ing_anio;
		do {
			System.out.println("Ingrese un día del 1 al 31");
			ing_dia = input.nextInt();
			if (ing_dia < 1 || ing_dia > 31) {
				System.out.println("El numero ingresado es invalido");
			} else {
				this.setDia(ing_dia);
			}
		} while (ing_dia < 1 || ing_dia > 31);

		do {
			System.out.println("Ingrese un mes del 1 al 12");
			ing_mes = input.nextInt();
			if (ing_mes < 1 || ing_mes > 12) {
				System.out.println("El numero ingresado es invalido");
			} else {
				this.setMes(ing_mes);
			}
		} while (ing_mes < 1 || ing_mes > 12);

		do {
			System.out.println("Ingrese un anio del 1900 al 2050");
			ing_anio = input.nextInt();
			if (ing_anio < 1900 || ing_anio > 2050) {
				System.out.println("El numero ingresado es invalido");
			} else {
				this.setAnio(ing_anio);
			}
		} while (ing_anio < 1900 || ing_anio > 2050);

	}

	public int diasMes(int ing_mesd) {
		int diasm = 0;

		switch (ing_mesd) {

		case 1:
			diasm = 31;
			break;

		case 2:
			diasm = 28;
			break;

		case 3:
			diasm = 31;
			break;

		case 4:
			diasm = 30;
			break;

		case 5:
			diasm = 31;
			break;

		case 7:
			diasm = 30;
			break;

		case 8:
			diasm = 31;
			break;

		case 9:
			diasm = 30;
			break;

		case 10:
			diasm = 31;
			break;

		case 11:
			diasm = 30;
			break;

		case 12:
			diasm = 31;
			break;
		}
		return diasm;
	}

	private void valida() {
		if (this.getDia() < 1 || this.getDia() > 31) {
			this.setDia(1);
		}

		if (this.getMes() < 1 || this.getMes() > 12) {
			this.setMes(1);
		}

		if (this.getAnio() < 1900 || this.getAnio() > 2050) {
			this.setAnio(1900);
		}
	}

	public void siguiente() {
		this.setDia(this.getDia() + 1);
	}

	public void anterior() {
		this.setDia(this.getDia() - 1);
	}

	public void igualQue(int dia, int mes, int anio) {
		if (dia == this.dia && mes == this.mes && anio == this.anio) {
			System.out.println("La fecha indicada es igual a la proporcionada");
		}

	}

	public void menorQue(int dia, int mes, int anio) {
		if (anio < this.anio) {
			System.out.println("La fecha indicada es menor a la proporcionada");
		} else {
			if (anio == this.anio && mes < this.mes) {
				System.out.println("La fecha indicada es menor a la proporcionada");
			} else {
				if (anio == this.anio && mes == this.mes && dia < this.dia) {
					System.out.println("La fecha indicada es menor a la proporcionada");
				}
			}
		}
	}

	public void mayorQue(int dia, int mes, int anio) {
		if (anio > this.anio) {
			System.out.println("La fecha indicada es mayor a la proporcionada");
		} else {
			if (anio == this.anio && mes > this.mes) {
				System.out.println("La fecha indicada es mayor a la proporcionada");
			} else {
				if (anio == this.anio && mes == this.mes && dia > this.dia) {
					System.out.println("La fecha indicada es mayor a la proporcionada");
				}
			}
		}
	}

}
