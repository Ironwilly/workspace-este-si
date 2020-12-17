package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Este ejercicio debería ser mucho más complejo, pero solo debemos hacer lo que
		 * se pide, aunque en alguna ocasión tenga menos sentido o falten cosas por
		 * hacer. 
		 * 
		 * Se trata de implementar un programa para gestionar un cine con una sola sala. 
		 * 
		 * Cada Entrada (una de las clases) de cine tendrá un número
		 * identificativo, precio, si está libre u ocupada, número de la fila y de butaca. 
		 * 
		 * Todas las funcionalidades estarán en la clase Sala, que estará
		 * caracterizada por número identificador, número total de localidades y una
		 * lista de localidades (tipo Entrada para no liar mucho el ejercicio). 
		 * 
		 * No es necesario usar arrays de Entradas, esa parte la haremos más adelante, en la
		 * segunda parte del tema. 
		 * 
		 * Se darán al usuario las siguientes opciones en un switch: 
		 * 
		 * • Ver cartelera que mostrará el título de la película proyectada. 
		 * 
		 * • Comprar una entrada comprobando si una localidad está vendida ya
		 * anteriormente. Todas las entradas valen lo mismo. En este caso, solo hay que
		 * mirar si su atributo "libre" es verdadero o falso, sin preocuparnos por nada
		 * más. Al acabar una venta habrá que pasar esa entrada a ocupada. 
		 * 
		 * • Calcular ganancias totales del día. Para ello al final de cada compra habrá que sumar
		 * la cantidad en el lugar que se haya habilitado para llevar el dinero total en caja. 
		 * 
		 * • Modificar el precio de una entrada. 
		 * 
		 * • Alguno más que se te ocurra.
		 * 
		 */

		
		
		int menu1;
		int idTeclado= 3234;
		int precioTeclado = 7;
		boolean libreTeclado =true;
		int numFilaTeclado =0, numButacaTeclado = 0;
		Entrada e1;
		
		
		int idSalaTeclado =23423;
		int numLocalidadesTeclado =100;
		
		Sala sa;
		
		int dinero =0;
		
		
		
		
		e1=new Entrada(idTeclado,precioTeclado,libreTeclado,numFilaTeclado,numButacaTeclado);
		sa=new Sala(idSalaTeclado,numLocalidadesTeclado,e1);
		
		
		
		
		
		
		do {
		
		System.out.println("************************************\r\n"
				+ ">>>>>>>>>Elige una opción<<<<<<<<<<<\r\n"
				+ "************************************\r\n"
				+ "*** 1 -> Cartelera               ***\r\n"
				+ "*** 2 -> Comprar entrada         ***\r\n"
				+ "*** 3 -> Ver ganancias totales   ***\r\n"
				+ "*** 4 -> Modificar precio entrada***\r\n"
				+ "*** 0 -> Salir                   ***\r\n"
				+ "************************************\r\n"
				+ "************************************ \n");
		menu1=Leer.datoInt();
		
		switch (menu1) {
		case 1:
			
			System.out.println("\r\n"
					+ "████████╗███████╗██████╗░███╗░░░███╗██╗███╗░░██╗░█████╗░████████╗░█████╗░██████╗░  ██████╗░\r\n"
					+ "╚══██╔══╝██╔════╝██╔══██╗████╗░████║██║████╗░██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗  ╚════██╗\r\n"
					+ "░░░██║░░░█████╗░░██████╔╝██╔████╔██║██║██╔██╗██║███████║░░░██║░░░██║░░██║██████╔╝  ░░███╔═╝\r\n"
					+ "░░░██║░░░██╔══╝░░██╔══██╗██║╚██╔╝██║██║██║╚████║██╔══██║░░░██║░░░██║░░██║██╔══██╗  ██╔══╝░░\r\n"
					+ "░░░██║░░░███████╗██║░░██║██║░╚═╝░██║██║██║░╚███║██║░░██║░░░██║░░░╚█████╔╝██║░░██║  ███████╗\r\n"
					+ "░░░╚═╝░░░╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝  ╚══════╝");
			break;
		case 2:
			System.out.println("Introduzca el número de fila \n");
			numFilaTeclado=Leer.datoInt();
			e1.setNumFila(numFilaTeclado);
			System.out.println("Introduzca el número de butaca \n");
			numButacaTeclado =Leer.datoInt();
			e1.setNumButaca(numButacaTeclado);
			
			
			
		sa.comprobarLibre(libreTeclado);
		
		
			
		System.out.println(sa);
		libreTeclado = false;
		
		
		
		break;
		case 3:
			dinero = dinero + precioTeclado;
			System.out.println(dinero);
			break;
			
		case 4:
			System.out.println("Diga el nuevo precio para la entrada");
			precioTeclado=Leer.datoInt();
			e1.setPrecio(precioTeclado);
			System.out.println("El nuevo precio de la entrada es de "+precioTeclado+" euros");
			
			break;
			
		
		case 0:
			System.out.println("¡Hasta la próxima! \n");
			
			break;
			
			default :
				System.out.println("Opción errónea, vuelva a intentarlo. \n");
				break;
		}
		
		
		
		}while(menu1 !=0);
		
		
		
		
		
		
	}

}
