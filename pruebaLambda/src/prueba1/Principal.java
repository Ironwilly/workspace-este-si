package prueba1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;








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
				+ "** 9 --> Calcular la antigüedad de tu coche  **\r\n"
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
			
			System.out.print("La agregación del nuevo coche ha sido realizada el ");
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
			
			System.out.println("Indique el año de tu coche \n");
			year = Leer.datoInt();
			System.out.println("Indique el mes de tu coche \n");
			mes = Leer.datoInt();
			System.out.println("Indique el día de tu coche \n");
			dia = Leer.datoInt();
			System.out.println("Su coche tiene una antigüedad de \n");
			LocalDate fechaRef = LocalDate.of(year, mes, dia);
			cc.calcularAntiguedad(fechaRef);
			
			break;
			
		case 0:
			
			System.out.println("Hasta la pronto! \n");
			
			System.out.print("Usted se ha ido del concesionario el  \n");
			cc.mostrarFechaYHoraActual();
			System.out.println("\n");
			
			
			break;
			
			default :
				
				System.out.println("Número erróneo! \n");
				
				break;
		
		
		}
		}while(menu1 !=0);
		

	}

}
