package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Realizar una “mini-calculadora”, que realice las siguientes operaciones:
		// suma, resta,
		// multiplicación, división y decir si un número es par o impar.
		// Se hará con un menú, y se pedirá en cada caso del switch los datos necesarios
		// para
		// realizar las operaciones. Se valorarán las comprobaciones que se hagan sobre
		// los datos introducidos (por ejemplo, no dividir por cero).
		// Incluir bucle do while.

		double suma, resta, multiplicacion, division, primerNumero = 0.00, segunNumero = 0.00;
		int opcion, numero, divisor = 2;

		do {
		System.out.println("1 -> Sumar");
		System.out.println("2 -> Restar");
		System.out.println("3 -> Multiplicar");
		System.out.println("4 -> Dividir");
		System.out.println("5 -> Saber si un numero es par o impar\n");
		System.out.println("0 -> Salir\n");

		System.out.println("¿Qué operación desea usted realizar?");

		opcion = Leer.datoInt();

		switch (opcion) {
		case 1:
			System.out.println("Introduzca el primer número:");
			primerNumero = Leer.datoDouble();
			System.out.println("Introduzca el segundo número:");
			segunNumero = Leer.datoDouble();
			suma = primerNumero + segunNumero;
			System.out.printf("El resultado de sumar %.2f + %.2f es %.2f\n\n", primerNumero, segunNumero, suma);
			break;
		case 2:
			System.out.println("Introduzca el primer número:");
			primerNumero = Leer.datoDouble();
			System.out.println("Introduzca el segundo número:");
			segunNumero = Leer.datoDouble();
			resta = primerNumero - segunNumero;
			System.out.printf("El resultado de restar %.2f - %.2f es %.2f\n\n", primerNumero, segunNumero, resta);
			break;
		case 3:
			System.out.println("Introduzca el primer número:");
			primerNumero = Leer.datoDouble();
			System.out.println("Introduzca el segundo número:");
			segunNumero = Leer.datoDouble();
			multiplicacion = primerNumero * segunNumero;
			System.out.printf("El resultado de multiplicar %.2f * %.2f es %.2f\n\n", primerNumero, segunNumero,
					multiplicacion);
			break;
		case 4:
			System.out.println("Introduzca el primer número:");
			primerNumero = Leer.datoDouble();
			System.out.println("Introduzca el segundo número:");
			segunNumero = Leer.datoDouble();
			if (segunNumero == 0) {
				System.out.println("El resultado de didivir cualquier número por 0 es infinito.\n\n");
			}else {
			division = primerNumero / segunNumero;
			System.out.printf("El resultado de dividir %.2f / %.2f es %.2f\n\n", primerNumero, segunNumero, division);
			}break;
		case 5:
			System.out.println("¿Qué número deseas saber si es par o impar?");
			numero = Leer.datoInt();
			if (numero % divisor == 0) {
				System.out.printf("El número %d es par\n\n", numero);
			} else {
				System.out.printf("El número %d es impar\n\n", numero);
			}
			break;
		case 0:
			System.out.println("¡Vuelve pronto!\n");
			break;
		default:
			System.out.println("El número introducido no es valido, vuelva a probar.\n\n");

		}
	}while (opcion!=0);
	}

}
