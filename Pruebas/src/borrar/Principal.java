package borrar;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea un array de números donde le indicamos por teclado el tamaño del array,
		// rellenaremos el array con números aleatorios entre 0 y 9, al final muestra
		// por pantalla el valor de cada posición y la suma de todos los valores.
		// Haz un método para rellenar el array (que tenga como parámetros los números
		// entre los que tenga que generar), para mostrar el contenido y la suma del
		// array
		// y un método privado para generar número aleatorio
		// (lo puedes usar para otros ejercicios).

		int[] posiciones;
		String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
				"K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };
		int[] posAbecedario;
		int tam,tamL=0, desde = 0, hasta = 9,desdeA=1,hastaZ=27, suma=0,opcion;
		int menu1=0,op;
		Random r;
		
		do {
			
		
		System.out.println("1 --> Generar array y sumar los numeros de este");
		System.out.println("2 --> Mostrar un array aleatorio con letras de la A a la Z");
		System.out.println("0 --> Salir");
		
		
		menu1=Leer.datoInt();
		
		
		switch(menu1) {
		case 1:
			r = new Random(System.nanoTime());

			System.out.println("Indica el tamaño del array");
			tam = Leer.datoInt();

			posiciones = new int[tam];

			for (int i = 0; i < posiciones.length; i++) {

				posiciones[i] = r.nextInt(hasta - desde + 1) + desde;
				

			}
			for (int i = 0; i < posiciones.length; i++) {

			
				System.out.print(" "+posiciones[i]);

			}
			
			

			
			for (int i = 0; i < posiciones.length; i++) {

				suma=suma + posiciones[i];

			}
			System.out.printf("\nEl resultado de sumar los numeros del array es: "+suma+"\n");
			break;
		case 2:
			r = new Random(System.nanoTime());
		
			
			//System.out.println("¿Cuántas letras deseas mostrar?");
			//tamL=Leer.datoInt();
			
			//System.out.println(posAbecedario);
			
			for(int i=0;i<abecedario.length;i++) {
				//posAbecedario [i] = r.nextInt(hastaZ-desdeA+1)+desdeA;
				System.out.println(abecedario[i]);
			
				System.out.print("\n ¿Qué letra guardada deseas mostrar?");
				op=Leer.datoInt();
				System.out.println(abecedario[op-1]);
				
				
				
			}
		
			
		
		
		
		
		
		
		
		case 0:
			System.out.println("Hasta pronto \n");
			break;
			default:
				System.out.print("error\n");
		break;
		
		
		
		
		}
		}while (menu1 !=0);

	
		
		

			
			

		
		
		
		
		
		

	}

}
