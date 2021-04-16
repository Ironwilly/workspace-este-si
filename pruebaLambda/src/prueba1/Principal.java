package prueba1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int menu1;
		String marca;
		
		
		
		
		
		Datos d = new Datos ();
		
		
		CrudConcesionario cc = new CrudConcesionario(d.getListaCar()); 
		Imprimir imp = new Imprimir(cc);
		
		
		
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
			
			imp.imprimirUnCocheDado(cc.buscarMarcaStream(marca));
			cc.mostrarFechaYHoraActual();
			
			
			break;
		
		
		
		
		}
		

	}

}
