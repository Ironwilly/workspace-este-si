package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada
		//una. Se debe leer la sala deseada y mostrar:
			//a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo,
			//sala vip, sala 3D, sala normal y sala para niños).
			//b. Pedir el número de entradas.
			//c. Calcular el precio final y mostrarlo.

		
		//Variables
		
		int salaVip=8, sala3D=6, salaNormal=4, salaBaby=2, entradas;
		int totalEntradas,salas=0;
		
		//Menu
		System.out.println("***************************************");
		System.out.println("*El precio de la sala Baby es de 2€   *");
		System.out.println("*El precio de la sala Normal es de 4€ *");
		System.out.println("*El precio de la sala 3d es de 6€     *");
		System.out.println("*El precio de la sala Vip es de 8€    *");
		System.out.println("***************************************\n\n");
		
		
		
		
		System.out.println("1 Sala Baby ----> Toy Story 4");
		System.out.println("2 Sala Normal --> Midway");
		System.out.println("3 Sala 3d    ---> Terminator 6");
		System.out.println("4 Sala Vip   ---> Joker\n");
		
		//Lectura de datos
		System.out.println("¿Cúantas entradas quieres?");
		entradas=Leer.datoInt();
		
		
		System.out.println("¿Qué película quieres ver?");
		salas=Leer.datoInt();
		
		//Ejecución de datos
		switch (salas) {
			case 1:
				totalEntradas=entradas*salaBaby;
				System.out.println("Toy Story 4");
				System.out.printf("El precio total es %d€",totalEntradas);
				break;
			case 2:
				totalEntradas=entradas*salaNormal;
				System.out.println("Midway");
				System.out.printf("El precio total es %d€",totalEntradas);
				break;
			case 3:
				totalEntradas=entradas*sala3D;
				System.out.println("Terminator 6");
				System.out.printf("El precio total es %d€",totalEntradas);
				break;
			case 4:
				totalEntradas=entradas*salaVip;
				System.out.println("Joker");
				System.out.printf("El precio total es %d€",totalEntradas);
				break;
		    default:
					System.out.println("Error!!");
				break;
		}
		
		
		System.out.println("\nDisfruta de la pélicula!");
		
		
		}
		
		
		

	}


