package co.uniquindio.progra2.agenda.aplicacion;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Aplicacion {
	
public static void main(String[] args) {
	
	
	
	Scanner var = new Scanner(System.in);
	
	boolean salir = false;
	int opcion;

	
	Agenda agendaTelefonica = new Agenda(4);
	String nombre;
	int telefono;
	int edad = 0;
	
	Contacto c;
	
	
	while (!salir) {
		
		System.out.println("1. Añadir contacto");
		System.out.println("2. Listar contacto");
		System.out.println("3. Buscar contacto");
		System.out.println("4. Existe contacto");
		System.out.println("5. Eliminar contacto");
		System.out.println("6. Agenda llena");
		System.out.println("7. Espacios disponibles");
		System.out.println("8. mostrar contactos impares");
		System.out.println("9. salir");
		try {
		
		System.out.println("Escribir una de las opciones disponibles");
		opcion = var.nextInt();
		
		switch (opcion) {
		 	case 1:
		 		
		 		System.out.println("ingrese el nombre");
		 		nombre = var.next();
		 		
		 		
		 		System.out.println("ingrese el telefono");
		 		telefono = var.nextInt();
		 		
		 		System.out.println("ingrese la edad ");
		 		edad = var.nextInt();
		 		
		 		c = new Contacto(nombre, telefono, edad);
		 		
		 		agendaTelefonica.aniadirContacto(c);
		 		
		 		break;
			
            case 2:
            	
            	agendaTelefonica.listaContactos();
		 		
		 		break;
	        case 3:
	        	
	        	System.out.println("ingrese el nombre");
		 		nombre = var.next();
		 		
	        	agendaTelefonica.buscarContacto(nombre);
		 		
		 		break;
			
            case 4:
            	
            	System.out.println("ingrese el nombre");
		 		nombre = var.next();
		 		
		 		c = new Contacto(nombre, 0, 0);
		 		
	        	if(agendaTelefonica.existeContacto(c) ){
	        		System.out.println("El contacto si existe");
	        	}else{
	        		System.out.println("El contacto No existe");
	        	}
            	
		 		break;
        	case 5:
		 		
        		System.out.println("ingrese el nombre");
		 		nombre = var.next();
		 		
		 		c = new Contacto(nombre, 0, 0);
		 		agendaTelefonica.eliminarContacto(c);
        		
		 		break;
			
            case 6:
            	if(agendaTelefonica.agendaLlena()) {
            		System.out.println(" La agenda se encuentra llena");
            	}else {
            		System.out.println("Todavia hay espacios disponibles ");
            	}
		 		break;
	        case 7:
	        	System.out.println("quedan disponibles" + agendaTelefonica.espaciosDisponibles());
	        	
		 		break;
			
	        case 8:
	        	System.out.println("los contactos impares son " + agendaTelefonica.mostrarContactosImpares());
	        	
		 		break;
		 		
	        case 9:
	        	System.out.println("para crear un contacto aleatorio" + agendaTelefonica.crearContactoEdadAleatoria(nombre,telefono,edad);
            case 10:
		 		salir = true;
		 		break;
		 	default :
System.out.println("solo nunmeros entre 1 y 8");
		 		
}
		} catch (InputMismatchException e) {
			System.out.println("debes insertar un numero");
			var.next();
		}
	
		
	}
}

}
