package ej1.clases;

public class Persona {

	private String nombre;
	private String apellido;
	private String direccion;

	public Persona() {
	}

	public Persona(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre(String nombre) {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido(String apellido) {
		return apellido;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion(String direccion) {
		return direccion;
	}

	@Override
	public String toString() {
		return "[Nombre: " + nombre + " Apellido: " + apellido + " Dirección: " + direccion + "]";
	}

}
