package ejercicio4;

import java.util.Iterator;
import java.util.Scanner;

/*4) Escribe una clase denominada CEcuacion2Grado. 
 * Introduce los coeficientes de la ecuación: a, b y c. 
 * 
 * Diseña un bloque try que trate las siguientes excepciones definidas por el programador:
 * 
		a) Si a y b son iguales a 0 aparece un mensaje indicando que la ecuación es degenerada.
		b) Si el discriminante es menor que 0 aparece un mensaje indicando que las raíces son
		complejas.
		
	Recuerda que el discriminante es b al cuadrado menos 4*a*c. Si a == 0 y b!= 0 la ecuación tiene una
	única raíz igual a – c/b Utiliza los métodos sqrt y abs (valor absoluto) de la clase final Math.*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, salir = 0;
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		do {
			try {

				System.out.println("Este programa calcula el resultado para las ecuaciones de segundo grado");
				System.out.println("Pulse 0 para salir");
				System.out.println("Para continuar pulse 1");
				op = Integer.parseInt(sc.nextLine());
				switch (op) {
				case 1:
					System.out.println("Diga el parámetro a");
					a = Double.parseDouble(sc.nextLine());
					System.out.println("Diga el parámetro b");
					b = Double.parseDouble(sc.nextLine());
					System.out.println("Diga el parámetro c");
					c = Double.parseDouble(sc.nextLine());

					System.out.println("Los dos posibles resultados son:");
					imprimirArray(calcularEcuacionSegundoGrado(a, b, c));
					break;
					
				case 0:
					System.out.println("¡Hasta pronto!");
					break;
					
				default:
					System.out.println("Por favor introduzca una opción valida");
					break;
				}
				

			} catch (NumberFormatException excp) {
				System.err.println("Excepción: " + excp);
				op = 125;
			} catch (EcuacionDegeneradaException excp) {
				System.err.println("Excepción: " + excp);
				op = 125;
			} catch (RaicesComplejasException excp) {
				System.err.println("Excepción: " + excp);
				op = 125;
			} catch (Exception excp) {
				System.err.println("Excepción: " + excp);
				op = 125;
			}
		} while (op != salir);
	}

	public static double[] calcularEcuacionSegundoGrado(double a, double b, double c)
			throws EcuacionDegeneradaException, RaicesComplejasException {
		double x, y, numerador = 4, denominador = 2, discriminante, cuadrado = 2, limite = 0.0, temp;
		discriminante = Math.pow(b, cuadrado) - (numerador * a * c);

		if (a == limite && b == limite) {
			throw new EcuacionDegeneradaException();
		}

		if (discriminante < limite) {
			throw new RaicesComplejasException();
		}

		discriminante = Math.sqrt(discriminante);

		y = (-b + discriminante) / (denominador * a);
		x = (-b - discriminante) / (denominador * a);

		double[] resultado = { x, y };
		return resultado;
	}

	public static void imprimirArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.2f\n", array[i]);
		}
	}
}
