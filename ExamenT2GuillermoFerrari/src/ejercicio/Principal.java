package ejercicio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] posiciones;
		int tam = 8, desde, hasta;
		int menu1;
		int andalucia = 6500000,porcentaje=0,denominador=100;
		String[] provincias = { "provincia1", "provincia2", "provincia3", "provincia4", "provincia5", "provincia6",
				"provincia7", "provincia8" };
		int  total=0;

		Random r;

		r = new Random(System.nanoTime());

		posiciones = new int[tam];

		do {
			System.out.println("*********************************************\r\n"
					+ "** 1 --> Generar votos **********************\r\n"
					+ "** 2 --> Mostrar votos **********************\r\n"
					+ "** 3 --> Total votos ************************\r\n"
					+ "** 4 --> Nº provincias < 100 votos **********\r\n"
					+ "** 5 --> % Votos sobre total votantes *******\r\n"
					+ "** 6 --> Sumar votos a una provincia ********\r\n"
					+ "** 7 --> Calcular media votos por provincia *\r\n"
					+ "** 0 --> Salir ******************************\r\n"
					+ "*********************************************\n");

			System.out.println("Elije una opción: \n");
			menu1 = Leer.datoInt();

			switch (menu1) {
			case 1:
				System.out.println("Elija entre que valores quiere generar votos");
				System.out.println("Introduzca el valor menor");
				desde = Leer.datoInt();
				System.out.println("Introduzca el valor mayor");
				hasta = Leer.datoInt();

				for (int i = 0; i < posiciones.length; i++) {
					posiciones[i] = r.nextInt((hasta - desde + 1) + desde);

				}

				break;
			case 2:
				for (int i = 0; i < posiciones.length; i++) {

					System.out.println(provincias[i] + " " + posiciones[i]);

				}

				break;
			case 3:
				
				for (int i = 0; i < posiciones.length; i++) {

					total = total + posiciones[i];

				}
				System.out.println("El total de votos es de "+total);
				

			
			break;
			case 4:
				for (int i = 0; i < posiciones.length; i++) {

					if(posiciones[i]<100) {
						System.out.println(provincias[i]);
					
					
					}
					}
				break;
			case 5:
				
				for (int i = 0; i < posiciones.length; i++) {

					total = total + posiciones[i];
					porcentaje = (andalucia*total)/100;
					

				}
				for (int i = 0; i < posiciones.length; i++) {

					System.out.println("El porcentaje de votantes con respecto a Andalucía es "+porcentaje);
					/// no me ha dado tiempo de más, no he podido pensar bien la fórmula ¬¬

				}
				
					

				}
				
				
				
		

		} while (menu1 != 0);

	}

}
