package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * Realizar un programa que haga las operaciones básicas de una calculadora solo
		 * con números enteros (sumar, restar, multiplicar, dividir y raíz cuadrada)
		 * teniendo en cuenta las posibles excepciones que se pueden producir (entrada
		 * de datos, división por cero, raíz de un número negativo, etc.)
		 */

		int menu1=1, numero1 = 0, numero2 = 0;
		String aux;

		boolean continuar = true;

		

				Calculadora cal = new Calculadora(numero1, numero2);
				Scanner sc = new Scanner(System.in);
				do {

					do {
						try {
					System.out.println("\n");
					System.out.println("*************************\r\n" + "*******CALCULADORA*******\r\n"
							+ "*************************\r\n" + "** 1 --> Sumar         **\r\n"
							+ "** 2 --> Restar        **\r\n" + "** 3 --> Multiplicar   **\r\n"
							+ "** 4 --> Dividir       **\r\n" + "** 5 --> Raiz Cuadrada **\r\n"
							+ "** 0 --> Salir         **\r\n" + "*************************\r\n"
							+ "*************************");

					aux = sc.nextLine();
					menu1 = Integer.parseInt(aux);

					switch (menu1) {

					case 1:

						System.out.println("Diga el primer número \n");
						aux = sc.nextLine();
						numero1 = Integer.parseInt(aux);

						System.out.println("Diga el segundo número \n");
						aux = sc.nextLine();
						numero2 = Integer.parseInt(aux);

						System.out.printf("El resultado de %d + %d es %d", numero1, numero2,
								cal.calcularSuma(numero1, numero2), "\n");
						continuar = false;
						break;

					case 2:
						System.out.println("Diga el primer número \n");
						aux = sc.nextLine();
						numero1 = Integer.parseInt(aux);

						System.out.println("Diga el segundo número \n");
						aux = sc.nextLine();
						numero2 = Integer.parseInt(aux);

						System.out.printf("El resultado de %d - %d es %d", numero1, numero2,
								cal.calcularResta(numero1, numero2), "\n");
						continuar = false;
						break;

					case 3:

						System.out.println("Diga el primer número \n");
						aux = sc.nextLine();
						numero1 = Integer.parseInt(aux);

						System.out.println("Diga el segundo número \n");
						aux = sc.nextLine();
						numero2 = Integer.parseInt(aux);

						System.out.printf("El resultado de %d * %d es %d", numero1, numero2,
								cal.calcularMultiplicacion(numero1, numero2), "\n");
						continuar = false;
						break;

					case 4:

						System.out.println("Diga el numerador \n");
						aux = sc.nextLine();
						numero1 = Integer.parseInt(aux);

						System.out.println("Diga el denominador \n");
						aux = sc.nextLine();
						numero2 = Integer.parseInt(aux);

						System.out.printf("El resultado de %d / %d es %d", numero1, numero2,
								cal.calcularDivision(numero1, numero2), "\n");
						continuar = false;
						break;

					case 5:

						System.out.println("Diga el número que deseas saber su raiz cuadrada  \n");

						aux = sc.nextLine();
						numero1 = Integer.parseInt(aux);

						System.out.printf("La raiz cuadrada de %d es %d", numero1, cal.calcularRaizCuadrada(numero1),
								"\n");
						continuar = false;
						break;

					case 0:

						System.out.println("Hasta pronto !!!");

						break;

					default:

						System.out.println("Número erróneo !!!");

						break;

					}

				
			} catch (NumberFormatException numberFormatException) {

				System.err.printf("\nException: %s\n", numberFormatException);
			} catch (ArithmeticException arithmeticException) {

				System.err.printf("\nException: %s\n", arithmeticException);
			} catch (RuntimeException runtimeException) {

				System.err.printf("\nException: %s\n", runtimeException);
			} catch (Exception exception) {

				System.err.printf("\nException: %s\n", exception);
			}

		} while (continuar);
				} while (menu1 != 0);
	}
}
