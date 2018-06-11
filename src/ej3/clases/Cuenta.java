package ej3.clases;

public class Cuenta {
	
	private int numero;
	private String dni;
	private double saldo;
	private double interes;
	private static final int AÑO = 365;
	
	public Cuenta(){
		}
	
	public Cuenta(String dni , double saldo , double interes){
		this.setDni(dni);
		this.setSaldo(saldo);
		this.setInteres(interes);
	}
	
	public int getNumero(){
		return numero;
	}
	
	public String getDni(){
		return dni;
		}
	
	public void setDni(String dni){
		this.dni = dni;
		}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getInteres(){
		return interes;
	}
	
	public void setInteres(double interes){
		this.interes = interes;
	}
	
	@Override
	public String toString(){
		return "[Número de cuenta: " + this.numero + " DNI: " + this.dni + " Saldo: " + this.saldo + "]";
	}
	
	public void actualizarSaldo(){
		this.saldo += this.saldo * (this.interes / AÑO);
	}
	
	public void ingresar(double agregar){
		this.setSaldo(this.getSaldo() + agregar);
	}
	
	public void retirar(double quitar){
		if(this.getSaldo() >= quitar){
			this.setSaldo(this.getSaldo() - quitar);
		}
		else{
			System.out.print("No hay dinero suficiente en la cuenta para retirar dicho monto");
		}
		
	}
	
	
	
	

}
