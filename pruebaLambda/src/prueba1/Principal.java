package prueba1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;





/**
 * 
 * @author Guillermo Ferrari
 * @version 1.1 19/04/2024
 *
 */




public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int menu1,indice;
		String marca,color,modelo;
		
		
		
		
		
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
				+ "** 0 --> Salir                               **\r\n"
				+ "***********************************************");
		
		menu1 = Leer.datoInt();
		
		switch(menu1) {
		case 1:
			
			System.out.println("Diga la marca de coche que quieres buscar \n");
			marca = Leer.dato();
			
			
			cc.buscarMarcaStream(marca);
			System.out.print("La búsqueda ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
		
			
			
			break;
			
		case 2:
			System.out.println("Diga el color por el que quieres buscar el coche ");
			
			color = Leer.dato();
			
			
			
				cc.buscarColorStream(color);

			System.out.print("La búsqueda ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			

			break;
			
		case 3:
			
			System.out.println("Diga el modelo del coche que quieres buscar ");
			
			modelo = Leer.dato();
			cc.buscarModeloStream(modelo);
			
			System.out.print("La búsqueda ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			break;
			
		
		case 4:
			
			cc.ordenarPorMarca();
			imp.imprimirListaCoches();
			
			System.out.print("La ordenación ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
			
		case 5:
			
			cc.ordenarPorModelo();
			imp.imprimirListaCoches();
			
			System.out.print("La ordenación ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
			
		case 6:
			
			cc.ordenarPorPotencia();
			imp.imprimirListaCoches();
			
			System.out.print("La ordenación ha sido realizada el ");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			break;
			
			
		
		
		}
		}while(menu1 !=0);
		

	}

}
