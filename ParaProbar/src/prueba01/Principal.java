package prueba01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0;
		String aux;
		boolean continuar = true;
		Aviso avi = new Aviso();
		Calculo cal = new Calculo(a, b);
		
		do {
			try {

		Scanner sc = new Scanner(System.in);

		System.out.println("diga un número \n");

		aux = sc.nextLine();
		a = Integer.parseInt(aux);

		System.out.println("diga un número \n");

		aux = sc.nextLine();
		b = Integer.parseInt(aux);
		
		if(a<0) {
			
			cal.mostrarAviso1(a, b);
		}
		
		if(b>50) {
			cal.mostrarAviso2(a);
		}

		System.out.println(cal.dividir(a, b));
		
		
		System.out.println("diga un número para raiz cuadrada \n");
		
		aux = sc.nextLine();
		a= Integer.parseInt(aux);
		
		System.out.println(cal.raizCuadrada(a));
		
			}catch(NumberFormatException numberFormatException) {
				
				System.err.printf("\nException: %s\n", numberFormatException);
			}catch(ArithmeticException arithmeticException) {
				
				System.err.printf("\nException: %s\n", arithmeticException);
				
			}catch(Aviso aviso) {
				
				System.err.printf("\nException: %s\n", aviso);
			}
			
		
		}while(continuar);//end do
	}

}
