package prueba1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;




/**
 * 
 * @author Guillermo Ferrari Ferrari
 * @version 1.0 20/04/2021   
 *
 * Este programa consiste en la gesti�n de un concesionario, el cual puede buscar por marca,modelo o color un coche de la lista.
 * Tambien hace la funci�n de ordenar por marca, modelo y potencia la lista de coches.
 * En cada gestion muestra la fecha y hora actual a la que se hace la petici�n.
 * Muestra la lista de coches, y puede tambien agregar un nuevo coche a la lista.
 * Por �ltimo te muestra la antig�edad de tu coche, metiendo como par�metro la fecha exacta de este.
 *
 */



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int menu1,indice;
		String marca,color,modelo;
		int potencia;
		
		int year,mes,dia;
		
		
		
		
		
		
		Datos d = new Datos ();
		
		
		CrudConcesionario cc = new CrudConcesionario(d.getListaCar()); 
		Imprimir imp = new Imprimir(cc);
		
		do {
		
		System.out.println("***********************************************\r\n"
				+ "***********************************************\r\n"
				+ "** 1 --> Buscar por marca                    **\r\n"
				+ "** 2 --> Buscar por color                    **\r\n"
				+ "** 3 --> Buscar por modelo                   **\r\n"
				+ "** 4 --> Ordenar por orden alfabetico marca  **\r\n"
				+ "** 5 --> Ordenar por orden alfabetico modelo **\r\n"
				+ "** 6 --> Ordenar por orden de potencia       **\r\n"
				+ "** 7 --> Agregar coche                       **\r\n"
				+ "** 8 --> Mostrar lista de coches             **\r\n"
				+ "** 9 --> Calcular la antig�edad de tu coche  **\r\n"
				+ "** 0 --> Salir                               **\r\n"
				+ "***********************************************");
		
		menu1 = Leer.datoInt();
		
		switch(menu1) {
		case 1:
			
			System.out.println("Diga la marca de coche que quieres buscar \n");
			marca = Leer.dato();
			
			
			cc.buscarMarcaStream(marca);
			System.out.print("La b�squeda ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
		
			
			
			break;
			
		case 2:
			System.out.println("Diga el color por el que quieres buscar el coche ");
			
			color = Leer.dato();
			
			
			
				cc.buscarColorStream(color);

			System.out.print("La b�squeda ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			

			break;
			
		case 3:
			
			System.out.println("Diga el modelo del coche que quieres buscar ");
			
			modelo = Leer.dato();
			cc.buscarModeloStream(modelo);
			
			System.out.print("La b�squeda ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			break;
			
		
		case 4:
			
			cc.ordenarPorMarca();
			imp.imprimirListaCoches();
			
			System.out.print("La ordenaci�n ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
			
		case 5:
			
			cc.ordenarPorModelo();
			imp.imprimirListaCoches();
			
			System.out.print("La ordenaci�n ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
			
		case 6:
			
			cc.ordenarPorPotencia();
			imp.imprimirListaCoches();
			
			System.out.print("La ordenaci�n ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
			
		case 7:
			
			System.out.println("Diga la marca del coche \n");
			marca = Leer.dato();
			System.out.println("Diga el modelo de coche \n");
			modelo = Leer.dato();
			System.out.println("Diga la potencia del coche \n");
			potencia = Leer.datoInt();
			System.out.println("Diga el color del coche \n");
			color = Leer.dato();
			Coche co = new Coche( marca,modelo,potencia, color);
			
			cc.agregarCoche(co);
			
			System.out.print("La agregaci�n del nuevo coche ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
			
		case 8:
			
			imp.imprimirListaCoches();
			
			System.out.print("Esta es la lista de coche actualizada a la fecha  ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
		case 9:
			
			System.out.println("Indique la fecha en (yyyy-mm-dd) de antig�edad que tiene su coche \n");
			
			String fechaRef = Leer.dato();
			cc.calcularAntiguedad(fechaRef);
			
			break;
			
		case 0:
			
			System.out.println("Hasta la pronto! \n");
			
			System.out.print("Usted se ha ido del concesionario el  \n");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			
			break;
			
			default :
				
				System.out.println("N�mero err�neo! \n");
				
				break;
		
		
		}
		}while(menu1 !=0);
		

	}

}
