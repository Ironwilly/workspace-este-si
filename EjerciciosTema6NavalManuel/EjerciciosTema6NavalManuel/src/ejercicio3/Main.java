package ejercicio3;

import java.util.Scanner;

/*3) Crear un programa que convierta los grados Celsius a Fahrenheit y que tenga previsto un
mecanismo para que al introducir una temperatura menor a -273 ºC, aparezca algún mensaje: “no
puede haber temperaturas menores a -273 ºC” y vuelva a pedir la temperatura.*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salir = 0, op;
		double celsius = 0.0;
		Scanner sc = new Scanner(System.in);
		do {
			try {

				System.out.println("Para convertir Celsius a Fahrenheit pulse 1");
				System.out.println("Para salir del programa pulse 0");
				op = Integer.parseInt(sc.nextLine());

				switch (op) {
				case 1:
					System.out.println("Conversor grados Celsius a Fahrenheti\n");
					System.out.println("Introduzca un numero en grados Celsius");

					celsius = Double.parseDouble(sc.nextLine());

					System.out.printf("%.2f Grados Celsius son %.2f Fahrenheit", celsius,
							convertirAFahrenheit(celsius));
					break;
					
				case 0:
					break;

				default:
					System.out.println("Por favor elija una opción válida.");
					break;
				}

			} catch (NumberFormatException exc) {
				System.err.println("Excepción: " + exc);
				System.err.println("Has introducido un carácter no valido");
				op = 125;
			} catch (LimiteAbsoluto exc) {
				System.err.println("Excepción: " + exc);
				op = 125;
			} catch (Exception exc) {
				System.err.println("Excepción: " + exc);
				op = 125;
			}
		} while (op != salir);
	}

	public static double convertirAFahrenheit(double celsius) throws LimiteAbsoluto {
		double multiplo = 9.0, denominador = 5.0, equival = 32.0, limite = -273.00;

		if (celsius < limite) {
			throw new LimiteAbsoluto(
					"No existen temperaturas por debajo del cero absoluto: " + limite + " Grados Celsius");
		}

		return celsius * (multiplo / denominador) + equival;
	}
}
