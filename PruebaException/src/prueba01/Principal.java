package prueba01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		int a=0,b=0,menu1;
		String aux;
		Boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		Alerta al = new Alerta();
		Calculos cal = new Calculos(a, b);
		
		do {
			try {
		System.out.println("1 --> Dividir\r\n"
				+ "2 --> Raiz cuadrada\r\n"
				+ "0 --> Salir");
		
		aux =sc.nextLine();
		menu1=Integer.parseInt(aux);
		
		switch(menu1) {
		
		case 1:
		System.out.println("diga el primer número \n");
		aux = sc.nextLine();
		a = Integer.parseInt(aux);
		System.out.println("Diga el segundo número \n");
		aux = sc.nextLine();
		b = Integer.parseInt(aux);
		
		
		if(a==0 && b==0) {
		cal.mostrarAlerta1(a, b);
		}
		if(a==100 || b== 50) {
			
			cal.mostrarAlerta2(a, b);
		}
		
		System.out.println(cal.dividir(a, b));
		
		continuar = false;
		break;
		
		case 2:
		
		System.out.println("diga el número para saber su raiz cuadrada \n");
		aux = sc.nextLine();
		a = Integer.parseInt(aux);
		
		if(a<0){
			
			cal.mostrarAlerta3(a);
		}
		System.out.println(cal.raizCuadrada(a));
		
		continuar = false;
		break;
		
		
		} //end switch

			} catch (NumberFormatException numberFormatException) {

				System.err.printf("\nException: %s\n", numberFormatException);
			}catch (Alerta alerta) {
				
				System.err.printf("\nException: %s\n", alerta);
			}
		}while(continuar); //end do
	}

}
