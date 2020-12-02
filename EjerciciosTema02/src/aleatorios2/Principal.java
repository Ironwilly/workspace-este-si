package aleatorios2;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// generar una serie de aleatorios entre un valor y otro valor

		int[] lista;
		double[] listaNotas = {6.3,2.5,8.9};
		String [] listaNombre = {"Ángel","Luismi","Rafa","Jesús"};
		int op;
		double suma=0.00, media=0.00;
		int tam, hasta, desde, ale;
		Random r;

		r = new Random(System.nanoTime());

		System.out.println("¿Cuántos numeros quiere?");
		tam = Leer.datoInt();
		System.out.println("¿Número mayor?");
		hasta = Leer.datoInt();
		System.out.println("¿Número menor?");
		desde = Leer.datoInt();
		lista = new int[tam];

		// version 1

		// for (int i=0; i < tam; i++) {
		// ale=r.nextInt(hasta-desde+1)+desde;
		// System.out.println(ale);

		// version 2... guardando en array

		for (int i = 0; i < lista.length; i++) {

			lista[i] = r.nextInt(hasta - desde + 1) + desde;

		}

		// para imprimir (NUNCA SE PONE EN EL MISMO FOR LA CARGA Y LA IMPRESION,
		//ES DECIR, EN UN FOR SE GUARDA Y EN OTRO SE IMPRIME)

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			
			
		}

		System.out.println("Diga el elemento que quieres saber");
		op=Leer.datoInt();
		System.out.println(lista[op-1]);
		
		//operaciones con arrays... la media de la lista
		
		for (int i = 0; i < listaNotas.length; i++) {
			suma = suma + listaNotas[i];
			
			
		}
		
		media=suma/listaNotas.length;
		
		System.out.printf("La media es: %.2f",media);
		
	}

}
