package co.uniquindio.progra2.agenda.aplicacion;

public class Contacto {
	
	private String nombre;
	private int telefono;
	private int edad;
	
	public Contacto(String nombre, int telefono, int edad) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
	}
	
public Contacto(String nombre) {
		
		this.nombre = nombre;
		this.telefono = 0;
		this.edad = 0;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean equals(Contacto c) {
		if(this.nombre.equalsIgnoreCase(c.getNombre())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + ", getNombre()="
				+ getNombre() + ", getTelefono()=" + getTelefono() + ", getEdad()=" + getEdad() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

	
}
