package supermerchi;

import Vista.Imprimir;
import crud.CrudLimpieza;
import pojo.ProductosLimpieza;
import utilidades.EjemploVelocidadParalelo;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var, salir = 0, op = 0, apto = 1, noApto = 2;
		String nombre, nuevoNombre;
		double precio = 0.0, peso = 0.0;
		boolean aptoAlimenticio = false;

		CrudLimpieza cl = new CrudLimpieza();
		Imprimir imp = new Imprimir(cl);

		

		do {
			System.out.println("Elige una opción");
			System.out.println();
			System.out.println("0. Salir");
			System.out.println("1. Imprimir lista productos limpieza");
			System.out.println("2. Crea y añadir un producto");
			System.out.println("3. Buscar producto por nombre");
			System.out.println("4. Buscar producto por nombre con Stream");
			System.out.println("5. Buscar productos con el mismo nombre");
			System.out.println("6. Buscar productos con el mismo nombre con Stream");
			System.out.println("7. Buscar productos con nombre parcialmente completo");
			System.out.println("8. Buscar productos con nombre parcialmente completo con Stream");
			System.out.println("9. Modificar producto");
			System.out.println("10.Modificar producto con Stream");
			System.out.println("11.Modificar todos los productos");
			System.out.println("12.Modificar todos los productos con Stream");
			System.out.println("13.Ordenar lista de forma natural");
			System.out.println("14.Ordenar lista de forma natural con Stream");
			System.out.println("15.Ordenar lista alfabéticamente");
			System.out.println("16.Ordenar lista alfabéticametne con Stream");
			System.out.println("17.Mostrar productos aptos para el uso alimenticio");
			System.out.println("18.Mostrar productos aptos para el uso alimenticio con Stream");
			System.out.println("19.Prueba de velocidad con stream secuencial");
			System.out.println("20.Prueba de velocidad con stream paralelo");
			var = Leer.datoInt();

			switch (var) {

			case 1:
				imp.imprimirListaLimpieza();
				break;

			case 2:
				System.out.println("Agregación de producto:");
				System.out.println("Diga el nombre del producto");
				nombre = Leer.dato();
				System.out.println("Diga el precio del producto");
				precio = Leer.datoDouble();
				System.out.println("Diga el peso del producto en gramos");
				peso = Leer.datoDouble();
				System.out.println("¿Es apto para el uso alimenticio?");
				System.out.println("1. Apto");
				System.out.println("2. No Apto");
				op = Leer.datoInt();
				// control de errores en la introducción de datos
				if (op == apto) {
					aptoAlimenticio = true;
				} else if (op == noApto) {
					aptoAlimenticio = false;
				} else {
					System.out.println("La opción marcada no es correcta");
					System.out.println("Por defecto el producto se ha guardado como no apto para el uso alimenticio");
					System.out.println("Podra cambiarlo en el futuro");
				}

				// Se crea el jugador y se guarda en la lista.
				ProductosLimpieza p = new ProductosLimpieza(nombre, precio, peso, aptoAlimenticio);
				cl.agregarProducto(p);

				break;

			case 3:
				System.out.println("Di el nombre del producto que quieres buscar");
				nombre=Leer.dato();
				imp.imprimirProducto(cl.buscarProducto(nombre));
				break;

			case 4:
				System.out.println("Di el nombre del producto que quieres buscar");
				nombre=Leer.dato();
				imp.imprimirProducto(cl.buscarProductoStream(nombre));

				break;

			case 5:
				System.out.println("Di el nombre de los productos que quieres buscar");
				nombre=Leer.dato();
				imp.imprimirProductosLista(cl.buscarProductos(nombre));
				break;

			case 6:
				System.out.println("Di el nombre de los productos que quieres buscar");
				nombre=Leer.dato();
				imp.imprimirProductosStream(cl.buscarProductosStream(nombre));

				break;

			case 7:
				System.out.println("¿No lo tienes muy claro? Escribe lo que recuerdes del nombre");
				nombre=Leer.dato();
				imp.imprimirProductosLista(cl.buscarProductosContienen(nombre));
				break;

			case 8:
				System.out.println("¿No lo tienes muy claro? Escribe lo que recuerdes del nombre");
				nombre=Leer.dato();
				imp.imprimirProductosStream(cl.buscarProductosContienenStream(nombre));

				break;

			case 9:
				System.out.println("Di el nombre del producto que quieres cambiar");
				nombre=Leer.dato();
				System.out.println("Di el nuevo nombre que quieres ponerle al producto");
				nuevoNombre=Leer.dato();
				cl.modificarNombreProducto(nombre, nuevoNombre);
				break;

			case 10:
				System.out.println("Di el nombre del producto que quieres cambiar");
				nombre=Leer.dato();
				System.out.println("Di el nuevo nombre que quieres ponerle al producto");
				nuevoNombre=Leer.dato();
				cl.modificarNombreProductoStream(nombre, nuevoNombre);
				break;

			case 11:
				System.out.println("Di el nombre de los productos que quieres cambiar");
				nombre=Leer.dato();
				System.out.println("Di el nuevo nombre que quieres asignar a los productos que antes se llamaban "+nombre);
				nuevoNombre=Leer.dato();
				cl.modificarTodosLosProductos(nombre, nuevoNombre);
				
				break;
				
			case 12:
				System.out.println("Di el nombre de los productos que quieres cambiar");
				nombre=Leer.dato();
				System.out.println("Di el nuevo nombre que quieres asignar a los productos que antes se llamaban "+nombre);
				nuevoNombre=Leer.dato();
				cl.modificarTodosLosProductosStream(nombre, nuevoNombre);
				break;
				
			case 13:
				cl.ordenarLista();
				break;
				
			case 14:
				cl.ordenarListaStream();
				break;
				
			case 15:
				cl.ordenarAlf();
				break;
				
			case 16:
				cl.ordenarAlfStream();
				break;
				
			case 17:
				imp.imprimirSoloApto();
				break;
				
			case 18:
				imp.impirimirSoloAptoStream();
				break;
				
			case 19:
				EjemploVelocidadParalelo.testSecuencial();
				break;
				
			case 20:
				EjemploVelocidadParalelo.testParalelo();
				break;
				
			default:
				System.out.println("Opción no valida");
				break;
			}

		} while (var != salir);

	}

}
