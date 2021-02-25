package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un
		 * móvil). Usaremos la clase ArrayList y el listado debe guardar objetos tipo
		 * Notas (tú decides las características/atributos que debe tener una nota).
		 * 
		 * Debe permitir almacenar un número infinito de notas (significa que se deben
		 * usar colecciones), se podrán mostrar de manera individual (mostrar una nota
		 * buscándola), dar información del número de notas guardadas, agregar una nueva
		 * nota, un método que borre una de las notas guardadas comprobando antes que la
		 * lista no está vacía. 
		 * Se borrará por número (la nota 1, la 2...), por lo que habrá que mostrarle al 
		 * usuario la lista con todas las notas (en un método) y su número correspondiente, 
		 * el usuario introducirá el número de la que quiera borrar. 
		 * 
		 * Realmente, esto se debe hacer buscando la nota, pero al ser el primer ejercicio, 
		 * no es necesario hacer los métodos buscar.
		 */
		
		String nombre,numTlf,mail;
		
		List<Notas> n1 = new ArrayList<Notas>();
		int menu1;
		int index;
		
		do {
		System.out.println("****************************************\r\n"
				+ "****************************************\r\n"
				+ "1 --> Agregar Notas\r\n"
				+ "2 --> Mostrar todas las notas guardadas\r\n"
				+ "3 --> Mostrar una nota guardada\r\n"
				+ "4 --> Borrar notas\r\n"
				+ "5 --> Contar cuantas notas hay\r\n"
				+ "0 --> Salir\r\n"
				+ "****************************************\r\n"
				+ "****************************************");
		
		
		menu1=Leer.datoInt();
		
		
		switch(menu1) {
		case 1:
			System.out.println("Diga el nombre que quieres agregar " );
			nombre = Leer.dato();
			System.out.println("Diga el numero de telefono que quieres agregar " );
			numTlf = Leer.dato();
			System.out.println("Diga el email que quieres agregar " );
			mail = Leer.dato();
			Notas no1 = new Notas(nombre,numTlf,mail);
			n1.add(no1);
			System.out.println(n1);
			
			break;
			
		case 2:
			
			System.out.println(n1);
			break;
			
		case 3:
			
			System.out.println("Indica el número de nota que quieres mostrar ");
			index=Leer.datoInt();
			System.out.println(n1.get(index-1));
			break;
			
		case 4:
			
			if(n1.isEmpty()) {
				System.out.println("No puedes borrar nada porque la lista está vacía \n");
			}else {
			System.out.println("Diga el número de nota que quieres borrar ");
			index=Leer.datoInt();
			System.out.printf("La nota %.2f será borrada de la lista ",n1.remove(index-1));
			}
			break;
			
		case 5:
			System.out.println("El número total de notas guardadas es:  \n");
			System.out.println(n1.indexOf(n1));
			
			break;
		case 0:
			System.out.println("Hasta la próxima! ");
			
			break;
			default:
				System.out.println("Número erróneo ");
				break;
			
		}
		
		}while(menu1 !=0);
		
		
		
	
		
		
		
		
		

	}

}
