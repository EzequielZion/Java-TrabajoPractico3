package ej2.clases;

public class Animal {
	
	private String raza;
	private String nombre;
	private String edad;
	
	public Animal(String raza , String nombre , String edad){
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void setRaza(String raza){
		this.raza = raza;
		}
	
	public String getRaza(String raza){
		return raza;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(String nombre){
		return nombre;
	}
	
	public void setEdad(String edad){
		this.edad = edad;
	}
	
	public String getEdad(String edad){
		return edad;
	}
	
	@Override
	public String toString(){
		return "[Raza: " + this.raza + " Nombre: " + this.nombre + " Edad: " + this.edad + "]";
	}

}


