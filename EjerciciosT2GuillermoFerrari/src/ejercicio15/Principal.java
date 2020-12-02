package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Haga un programa de la interfaz de un cajero automático. 
		//Tendrá las opciones, ver saldo,
		//retirar dinero, comprar entradas e ingresar dinero.
		//En cada opción se pedirán los datos 
		//necesarios y se realizarán las operaciones adecuadas. 
		//El coste de las entradas se debe restar al
		//saldo de dicha cuenta. La cuenta será creada 
		//por nosotros con un saldo inicial concreto.
		//incluir bucle do-while para que repita hasta que cliente decida salir.
		
		
		double saldo=0.00, saldoTotal=2350.70 ;
		int opcion=0, retirar=0, numEntradas=0,precioEntradas=25;
				
		do {
	
			
		System.out.println ("Pulse la opción que desee realizar:");
		System.out.println ("1 -> Ver saldo");
		System.out.println ("2 -> Retirar dinero");
		System.out.println ("3 -> Comprar entradas");
		System.out.println ("4 -> Ingresar dinero\n");
		System.out.println ("0 -> Salir");
		
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 1:
			System.out.printf("Su saldo es de %.2f euros.\n",saldoTotal);
			saldoTotal=saldoTotal + saldo;
			
			break;
		case 2:
			System.out.println("¿Cuánto dinero desea usted retirar?");
			retirar=Leer.datoInt();
			System.out.printf("Su nuevo saldo es de %.2f euros",(saldoTotal- retirar));
			saldoTotal=saldoTotal - saldo -retirar;
			
			break;
		case 3:
			System.out.println("El precio de las entradas es de 25 euros cada una, "
					+ "¿cuántas entradas desea usted comprar?");
			numEntradas=Leer.datoInt();
			System.out.printf("Ha comprado %d entradas,su nuevo saldo "
					+ "es de %.2f euros ",numEntradas,(saldoTotal-(numEntradas*precioEntradas)));
			saldoTotal=saldoTotal + saldo-(numEntradas*precioEntradas);
			
			break;
		case 4:
			System.out.println("¿Cuánto dinero desea usted ingresar?");
			saldo=Leer.datoInt();
			System.out.printf("Usted ha ingresado %.0f"
					+ " euros.Su nuevo saldo es de %.2f euros.\n",saldo, (saldo +saldoTotal));
			saldoTotal=saldoTotal + saldo;
			
			break;
		case 0:
			System.out.println("¡Hasta pronto!");
			break;
		default :
			System.out.println("Número incorrecto, pulse de nuevo un numero del menú");
			break;
			
				
		}
		
		
		}while (opcion !=0);
		
	
		
	}

}
