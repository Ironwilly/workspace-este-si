package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Crear un programa que convierta los grados Celsius a Fahrenheit y que tenga
		 * previsto un mecanismo para que al introducir una temperatura menor a -273 ºC,
		 * aparezca algún mensaje: “no puede haber temperaturas menores a -273 ºC” y
		 * vuelva a pedir la temperatura.
		 */

		double temperatura = 0;
		Boolean continuar = true;

		Termometro ter = new Termometro(temperatura);
		Mecanismo me = new Mecanismo();

		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Escriba la temperatura en grados Celsius que quieres pasar a Fahrenheit \n");
				String aux = sc.nextLine();

				temperatura = Integer.parseInt(aux);

				if (temperatura < -273) {
					me.mostrarAlerta(temperatura);
				} else {

					System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit \n", temperatura,
							ter.pasarCelsiusAFahrenheit(temperatura));
				}
				continuar = false;
			} catch (NumberFormatException numberFormatException) {

				System.err.println("\nException: " + numberFormatException);

			} catch (Mecanismo mecanismo) {
				System.err.println("\nException: " + mecanismo);

			}

			catch (RuntimeException runtimeException) {
				System.err.println("\nException: " + runtimeException);
			} catch (Exception exception) {
				System.err.println("\nException: " + exception);
			}

		} while (continuar);

	}

}
