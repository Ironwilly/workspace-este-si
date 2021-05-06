package ejercicio;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char letra = 'a';
		String pin = "1111";
		int pin2;
		String aux;
		int menu1;
		int dinero = 4000;
		int ventasTotales = 4000;
		boolean continuar = true;
		
		Scanner sc = new Scanner(System.in);
		
		Caja ca = new Caja(letra,pin);
		Caja ca2 = new Caja( dinero,  ventasTotales, letra,  pin);
		
		
		do {
			try {
				
				System.out.println("1----> Pedir pin\r\n"
						+ "2----> Dinero caja\r\n"
						+ "3----> Operaciones\r\n"
						+ "0----> Salir");
				
				
				aux = sc.nextLine();
				menu1 = Integer.parseInt(aux);
				
				switch(menu1) {
				
				case 1:
					
					System.out.println("Escribe la letra del pin \n");
					letra=sc.next().charAt(letra);
					
					if(Character.isLetter(letra)) {
						
						
					}else {
						
						ca.mostrarAlerta1(letra);
					}
					
					System.out.println("Escribe los números de tu pin \n");
					pin = sc.nextLine();
					
					
					continuar = false;
					
					break;
				
				case 2:
					
					System.out.println("Introduzca el número de ventas totales del día \n");
					
					aux=sc.nextLine();
					ventasTotales = Integer.parseInt(aux);
					
					System.out.println("Introduzca el dinero total de la caja \n");
					
					aux = sc.nextLine();
					dinero = Integer.parseInt(aux);
					
					if(ventasTotales == dinero) {
						
						System.out.println("El dinero de la caja coincide con las operaciones del día \n");
						
					} else {
						
						ca.mostrarAlerta3(dinero, ventasTotales);
					}
				
				}//end switch
				
				
				
				
				
				
				
				
			}catch (NumberFormatException numberFormatException) {

				System.err.printf("\nException: %s\n", numberFormatException);
				
			}catch (Alerta alerta) {
				
				System.err.printf("\nException: %s\n", alerta);
			}
			
			
			
			
		}while(continuar);
		
		
		
		
		
		
		
		

	}

}
