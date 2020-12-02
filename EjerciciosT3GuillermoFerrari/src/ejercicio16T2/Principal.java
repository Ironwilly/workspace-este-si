package ejercicio16T2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 * Vamos a seguir repasando ejercicios usando objetos sin mezclar varias clases, para ello 
		 * haremos el ejercicio 16 del boletín de control de flujo del tema anterior (tema 2). 
		 * El ejercicio es el de la "minicalculadora" pero las operaciones se harán con métodos. 
		 * Debes crear una sola clase llamada Calculo cuya única característica (atributo) sea un 
		 * double resultado. Los métodos a hacer serán los que hagan las operaciones del enunciado.
		 * 
		 * Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
			multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
			en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
			comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).
		 */
		
		
		double resultadoTeclado=0.00;
		int menu1;
		double a , b;
		int c;
		Calculo c1;
		c1=new Calculo (resultadoTeclado);
		do {
		System.out.println("Elija una opción\r\n"
				+ "******************\r\n"
				+ "1 --> Sumar\r\n"
				+ "2 --> Restar\r\n"
				+ "3 --> Multiplicar\r\n"
				+ "4 --> Dividir\r\n"
				+ "5 --> Par/Impar\r\n"
				+ "0 --> Salir\r\n"
				+ "******************\n");
		menu1=Leer.datoInt();
		switch(menu1) {
		case 1:
			System.out.println("Diga el primer número ");
			a=Leer.datoDouble();
			System.out.println("Diga el segundo número ");
			b=Leer.datoDouble();
			System.out.printf("El resultado de la suma es %.2f \n",c1.calcularSuma(a , b));
			break;
		case 2:
			System.out.println("Diga el primer número ");
			a=Leer.datoDouble();
			System.out.println("Diga el segundo número ");
			b=Leer.datoDouble();
			System.out.printf("El resultado de la resta es %.2f \n",c1.calcularResta(a , b));
			break;
		case 3:
			System.out.println("Diga el primer número ");
			a=Leer.datoDouble();
			System.out.println("Diga el segundo número ");
			b=Leer.datoDouble();
			System.out.printf("El resultado de la multiplicación es %.2f \n",c1.calcularMultiplicacion(a , b));
			break;
		case 4:
			System.out.println("Diga el primer número ");
			a=Leer.datoDouble();
			System.out.println("Diga el segundo número ");
			b=Leer.datoDouble();
			System.out.printf("El resultado de la división es %.2f \n",c1.calcularDivision(a , b));
			break;
		
		case 5:
			System.out.println("Diga el número que deseas saber si es par o impar");
			c=Leer.datoInt();
			System.out.printf("El número que ha elegido es par (true) o es impar (false) ",c1.calcularPar(c));
		case 0:
			System.out.println("Hasta pronto");
			break;
			
			default:
				System.out.println("Opción errónea, prueba de nuevo");
				break;
				
		
		
		}
		
		
		
		}while (menu1 !=0);
		
		
		
		
		
		

	}

}
