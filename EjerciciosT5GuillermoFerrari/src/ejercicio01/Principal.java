package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un
		 * m�vil). Usaremos la clase ArrayList y el listado debe guardar objetos tipo
		 * Notas (t� decides las caracter�sticas/atributos que debe tener una nota).
		 * 
		 * Debe permitir almacenar un n�mero infinito de notas (significa que se deben
		 * usar colecciones), se podr�n mostrar de manera individual (mostrar una nota
		 * busc�ndola), dar informaci�n del n�mero de notas guardadas, agregar una nueva
		 * nota, un m�todo que borre una de las notas guardadas comprobando antes que la
		 * lista no est� vac�a. 
		 * Se borrar� por n�mero (la nota 1, la 2...), por lo que habr� que mostrarle al 
		 * usuario la lista con todas las notas (en un m�todo) y su n�mero correspondiente, 
		 * el usuario introducir� el n�mero de la que quiera borrar. 
		 * 
		 * Realmente, esto se debe hacer buscando la nota, pero al ser el primer ejercicio, 
		 * no es necesario hacer los m�todos buscar.
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
			
			System.out.println("Indica el n�mero de nota que quieres mostrar ");
			index=Leer.datoInt();
			System.out.println(n1.get(index-1));
			break;
			
		case 4:
			
			if(n1.isEmpty()) {
				System.out.println("No puedes borrar nada porque la lista est� vac�a \n");
			}else {
			System.out.println("Diga el n�mero de nota que quieres borrar ");
			index=Leer.datoInt();
			System.out.printf("La nota %.2f ser� borrada de la lista ",n1.remove(index-1));
			}
			break;
			
		case 5:
			System.out.println("El n�mero total de notas guardadas es:  \n");
			System.out.println(n1.indexOf(n1));
			
			break;
		case 0:
			System.out.println("Hasta la pr�xima! ");
			
			break;
			default:
				System.out.println("N�mero err�neo ");
				break;
			
		}
		
		}while(menu1 !=0);
		
		
		
	
		
		
		
		
		

	}

}
