package co.uniquindio.progra2.agenda.aplicacion;

public class Agenda {

	private Contacto[] contactos;

	public Agenda() {

		this.contactos = new Contacto[10];

	}

	public Agenda(int tamanio) {
		this.contactos = new Contacto[tamanio];
	}

	public void aniadirContacto(Contacto c) {

		boolean encontrado = false;
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			if (contactos[i] == null) {
				contactos[i] = c;
				encontrado = true;

			}
		}

		if (encontrado) {
			System.out.println("se ha añadido el contacto");
		} else {
			System.out.println("no se ha añadido el contacto");
		}
	}

	public boolean existeContacto(Contacto c, int telefono) {

		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && c.equals(contactos[i])) {
				return true;

			}
		}
		return false;
	}

	public void listaContactos() {

		for (int i = 0; i < contactos.length; i++) {

			if (contactos[i] != null) {
				System.out.println(contactos[i]);
			}

		}
	}

	public void buscarContacto(String nombre) {

		boolean encontrado = false;
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("su telefono es" + contactos[i].getTelefono());
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se ha encontrado el contacto");
		}
	}

	public boolean agendaLlena() {

		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				return false;

			}
		}
		return true;
	}

	public void eliminarContacto(Contacto c) {

		boolean encontrado = false;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null && contactos[i].equals(c)) {
				contactos[i] = null;
			}

		}

		if (!encontrado) {
			System.out.println("No se ha encontrado");
		}

	}

	public int espaciosDisponibles() {

		int contador = 0;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contador++;
			}
		}
		return contador;
	}

	public String mostrarContactosImpares() {
		String mensaje = "";

		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && (i + 1) % 2 == 1) {
				mensaje += contactos[i].toString() + "\n";
			}
		}

		if (mensaje.equals("")) {
			mensaje = "No hay contactos!";
		}

		return mensaje;
	}

	public String crearContactoEdadAleatoria(String nombre, String correo, String direccion, int telefono) {
		String mensaje = "";
		int posicionDisponible = 0;
		boolean existeContacto = false;
		int edadAleatoria = retornarEdadAletoria();
		posicionDisponible = espaciosDisponibles();
		if (posicionDisponible == -1) {
			mensaje = "No hay posiciobes disponibles";
		} else {
			boolean edadValida = validarEdadRango(edadAleatoria);
			existeContacto = existeContacto(null, telefono);
			if (existeContacto == false) {
				if (edadValida) {

					int edad = 0;
					contactos[posicionDisponible] = new Contacto(nombre, telefono, edad);

				} else {
					System.out.println ("Edad generada no apta, intente nuevamente");
				}
			} else {
				System.out.println("Ya existe un contacto con este numero de telefono");
			}
		}
		return "El contacto fue creado";
	}

	public boolean validarEdadRango(int edad) {
		boolean centinela = false;
		if (edad < 15 && edad > 60) {
			centinela = true;
		}
		return centinela;
	}

	public int retornarEdadAletoria() {
		int minVal = 15;
		int edad = 0;
		int maxVal = 60;
		double randomNum = 0;
		randomNum = Math.random() * (maxVal - minVal);
		if (randomNum >= 15 & randomNum <= 60) {

			edad = (int) randomNum;

		} else {
			edad = 0;
			return edad;
		}
		return edad;
	}

//	---------------------------------------------------------------------------------------------
	public char[] pasarArregloCaracteres(String frase) {

		char[] aCaracteres;

		aCaracteres = frase.toCharArray();

		return aCaracteres;
	}

//Aplicacion 


     	System.out.println("Ingrese la frase");
		char arregloCaracteres[]=agenda.pasarArregloCaracteres(String frase);
		imprimir(devolverCharArreglo(arregloCaracteres)); 

//metodo en aplicacion para imprimir el arreglo de caracteres en una ventana

	public static String devolverCharArreglo(char arregloCaracteres[]) {
		String salida;
		salida = "La frase pasada a arreglo de caracteres es:  [";
		for (int i = 0; i < arregloCaracteres.length; i++) {
			salida += arregloCaracteres[i] + "  ";
		}
		salida += "]";
		return (salida);
	}}

//imprimir normal
	for(

	int i = 0;i<arregloCaracteres.length;i++)
	{
		System.out.print(arregloCaracteres[i] + " ");
	}
//________________________________________________________________________    
 prueva de git 
 public static String devolverCharArreglo(char arregloCaracteres[]) {
		String salida;
		salida = "La frase pasada a arreglo de caracteres es:  [";
		for (int i = 0; i < arregloCaracteres.length; i++) {
			salida += arregloCaracteres[i] + "  ";
		}
		salida += "]";
		return (salida);
	}}

//imprimir normal
	for(

	int i = 0;i<arregloCaracteres.length;i++)
	{
		System.out.print(arregloCaracteres[i] + " ");
	}

}
