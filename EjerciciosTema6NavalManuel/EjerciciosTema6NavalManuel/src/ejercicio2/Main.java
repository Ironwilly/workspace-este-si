package ejercicio2;

import java.util.Scanner;

/*2) Realizar un programa que haga las operaciones básicas de una calculadora solo con números
enteros (sumar, resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones
que se pueden producir (entrada de datos, división por cero, raíz de un número negativo, etc.)
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0, salir = 0,n1,n2;
		double num1, num2;
		String aux;
		Scanner sc = new Scanner(System.in);
		Calculadora ca = new Calculadora();

		System.out.println("Este programa permite realizar operaciones básicas");

		
			do {
				try {
			
				System.out.println();
				System.out.println("**********************************");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Dividir");
				System.out.println("5. Raiz cuadrada");
				System.out.println("**********************************");
				System.out.println();
				aux = sc.nextLine();
				op = Integer.parseInt(aux);

				switch (op) {
				case 1:
					System.out.println("Introduzca dos números a sumar");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);

					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);

					System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, ca.sumar(num1, num2));
					break;

				case 2:
					System.out.println("Introduzca el minuendo");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);

					System.out.println("Introduzca el sustraendo");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);

					System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, ca.resta(num1, num2));
					break;

				case 3:
					System.out.println("Introduzca dos múltiplos");

					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);

					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);

					System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, ca.multiplicar(num1, num2));
					break;

				case 4:
					System.out.println("Introduzca el numerador");
					aux = sc.nextLine();
					n1 = Integer.parseInt(aux);

					System.out.println("Introduzca el denominador");
					aux = sc.nextLine();
					n2 = Integer.parseInt(aux);

					System.out.println(ca.dividir(n1, n2));
					break;

				case 5:
					System.out.println("Introduzca el radicando");

					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);

					System.out.printf("La raiz cuadrada de %.2f es %.2f ", num1, ca.raizCuadrada(num1));

					break;
				default:
					System.out.println("Opción no valida, por favor introduzca una opción del menu.");
					break;
				}}
					
					catch (NumberFormatException i) {
						System.err.printf("\nException: %s\n", i);
						System.out.println("Debes introducir un número entero");

					}
				catch(ArithmeticException i) {
					System.err.printf("\nException: %s\n", i);
					System.out.println("Se ha producido un error Aritmético, posiblemente estes tratando de dividir entre 0 ");
					System.out.println("o haciendo la raiz cuadrada de un número negativo");
				}
				catch(Exception i) {
					System.err.printf("\nException: %s\n", i);
					System.out.println("Error desconocido, si el problema persiste pongase en contacto con el servicio técnico");
				}
				
				
			}while (op != salir);
				sc.close();
	}}
		
	

	

