package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Haga un programa de la interfaz de un cajero autom�tico. 
		//Tendr� las opciones, ver saldo,
		//retirar dinero, comprar entradas e ingresar dinero.
		//En cada opci�n se pedir�n los datos 
		//necesarios y se realizar�n las operaciones adecuadas. 
		//El coste de las entradas se debe restar al
		//saldo de dicha cuenta. La cuenta ser� creada 
		//por nosotros con un saldo inicial concreto.
		//incluir bucle do-while para que repita hasta que cliente decida salir.
		
		
		double saldo=0.00, saldoTotal=2350.70 ;
		int opcion=0, retirar=0, numEntradas=0,precioEntradas=25;
				
		do {
	
			
		System.out.println ("Pulse la opci�n que desee realizar:");
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
			System.out.println("�Cu�nto dinero desea usted retirar?");
			retirar=Leer.datoInt();
			System.out.printf("Su nuevo saldo es de %.2f euros",(saldoTotal- retirar));
			saldoTotal=saldoTotal - saldo -retirar;
			
			break;
		case 3:
			System.out.println("El precio de las entradas es de 25 euros cada una, "
					+ "�cu�ntas entradas desea usted comprar?");
			numEntradas=Leer.datoInt();
			System.out.printf("Ha comprado %d entradas,su nuevo saldo "
					+ "es de %.2f euros ",numEntradas,(saldoTotal-(numEntradas*precioEntradas)));
			saldoTotal=saldoTotal + saldo-(numEntradas*precioEntradas);
			
			break;
		case 4:
			System.out.println("�Cu�nto dinero desea usted ingresar?");
			saldo=Leer.datoInt();
			System.out.printf("Usted ha ingresado %.0f"
					+ " euros.Su nuevo saldo es de %.2f euros.\n",saldo, (saldo +saldoTotal));
			saldoTotal=saldoTotal + saldo;
			
			break;
		case 0:
			System.out.println("�Hasta pronto!");
			break;
		default :
			System.out.println("N�mero incorrecto, pulse de nuevo un numero del men�");
			break;
			
				
		}
		
		
		}while (opcion !=0);
		
	
		
	}

}
