package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * Escribe una clase denominada CEcuacion2Grado. Introduce los coeficientes de
		 * la ecuación: a, b y c. Diseña un bloque try que trate las siguientes
		 * excepciones definidas por el programador:
		 * 
		 * a) Si a y b son iguales a 0 aparece un mensaje indicando que la ecuación es
		 * degenerada. b) Si el discriminante es menor que 0 aparece un mensaje
		 * indicando que las raíces son complejas.
		 * 
		 * Recuerda que el discriminante es b al cuadrado menos 4*a*c. Si a == 0 y b!= 0
		 * la ecuación tiene una única raíz igual a – c/b Utiliza los métodos sqrt y abs
		 * (valor absoluto) de la clase final Math.
		 * 
		 */

		int a = 0, b = 0, c = 0, cero = 0;
		Boolean continuar = true;

		CEcuacion2Grado x2 = new CEcuacion2Grado(a, b, c);

		Scanner sc = new Scanner(System.in);

		Alerta al = new Alerta();

		do {
			try {
				System.out.println("Escriba el valor de A: \n");

				String aux = sc.nextLine();
				a = Integer.parseInt(aux);

				System.out.println("Escriba el valor de B: \n");

				String aux1 = sc.nextLine();
				b = Integer.parseInt(aux1);

				System.out.println("Escriba el valor de C: \n");

				String aux2 = sc.nextLine();
				c = Integer.parseInt(aux2);

				if (x2.calcularDiscriminante(a, b, c) >= cero) {
					System.out.println("La solución1 es: \n"+x2.calcularEcuacion2Grado1(a, b, c));
					System.out.println("La solucion2 es: \n"+x2.calcularEcuacion2Grado2(a, b, c));

				}
				if (x2.calcularDiscriminante(a, b, c) < cero) {

					al.mostrarAlerta2(x2.calcularDiscriminante(a, b, c));
				}
				if (a == cero && b == cero) {

					al.mostrarAlerta1(a, b);

				}
				else if (a == cero && b != cero) {

					System.out.println("La ecuación tiene una raíz única igual a : " + x2.raizUnica(a, b, c));
				}

				continuar = false;
			} catch (NumberFormatException numberFormatException) {

				System.err.println("\nException: " + numberFormatException);

			} catch (Alerta alerta) {

				System.err.println("\nException: " + alerta);

			}catch (RuntimeException runtimeException) {
				System.err.println("\nException: " + runtimeException);
			} catch (Exception exception) {
				System.err.println("\nException: " + exception);
			}

		} while (continuar);
	}

}
