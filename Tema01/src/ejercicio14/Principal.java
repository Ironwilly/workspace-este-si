package ejercicio14;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Muestra el nombre de la tienda 
		System.out.println ("*+*+**+*+**+*+**+*+**+*+**+*+**+*+**+*+**+*+*");
		System.out.println ("*          LA TIENDA DEL BARRIO             *");
		System.out.println ("*+*+**+*+**+*+**+*+**+*+**+*+**+*+**+*+**+*+*");
		System.out.println ("");
		
		//Muestra la fecha y hora de la compra
		System.out.println("    Fecha: 08/10/2020        Hora: 12:29");
		
		//Muestra el numero de recibo
		System.out.println ("\t     RECIBO NUMERO: 29");
		
		System.out.println ("---------------------------------------------");
		
		//Muestra en pantalla informacion referente a la compra
		
		System.out.println ("      Cantidad      Precio     Importe");
		
		//Variables
		double cola=0.70, pipas= 0.40, garra=150, total= (cola*2)+pipas+garra;
		
		//Muestra en pantalla la cantidad, precio e importe
		
		System.out.printf("    2xLatas Cola     %1.2f \t%1.2f", cola, cola*2);
		System.out.println ("");
		System.out.printf("    1xBolsa Pipas    %1.2f \t%1.2f", pipas, pipas);
		System.out.println ("");
		System.out.printf("    1xGarra          %1.0f \t%1.0f", garra, garra);
		System.out.println("\n\n\n");
		
		//Muestra el total de la compra
		
		System.out.printf("\t\t\tTotal = %1.2f Euros",total);
		
		//Muestra informacion del final del ticket
		
		System.out.println("\n\n============================================");
		System.out.println("\t  Le atendió John Snow");
		System.out.println("\n      MUCHAS GRACIAS POR SU COMPRA");
		

	}

}
