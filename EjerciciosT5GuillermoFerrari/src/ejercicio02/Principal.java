package ejercicio02;

import java.util.ArrayList;
import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un programa para gestionar los socios de un club de Campo “de categoría”. 
		 * Se debe poder guardar Socios con sus datos personales, buscarlos,mostrar sus datos, 
		 * modificarlos y borrarlos. Usar la clase ArrayList.
		 * Este ejercicio es para empezar, así que no es necesario hacer nada más, aunque se
		 * podrían agregar funcionalidades como alquilar pistas, pagar cuotas, etc.(¡Para aburridos!). 
		 * Debemos usar la clase Socio, la clase gestión Club y la principal como mínimo.
		 */

		String nombreSo,apellidosSo,dniSo,movilSo,emailSo;
		int numeroSo;
		int menu1;
		int index ;
		int desde = 1,hasta = 1000;
		int ale;
		Random r;
		
		r = new Random(System.nanoTime());
		
		Socio so1 = new Socio ( "Alberto",  "Mate Frito",  "55667788l", "222333444", "albertitoito@gmail.com", 39);
		Socio so2 = new Socio ("Chema","Pa Mundi","22664422q","657456987","chemita@gmail.com",112);
		Socio so3 = new Socio ("Estela","Gartijo Paredes","55997756m","624789098","estelagartijo@gmail.com",91);
		Socio so4 = new Socio ("Aitor","Menta Cerrada","88563487m","614893456","aitormentacerrada@gmail.com",22);
		
		
		GestionClub gesClub = new GestionClub(new ArrayList<Socio>()); 
		
		gesClub.guardarSocio(so1);
		gesClub.guardarSocio(so2);
		gesClub.guardarSocio(so3);
		gesClub.guardarSocio(so4);
		
		
		do {
			
		
		System.out.println("*******************************************\r\n"
				+ "*******************************************\r\n"
				+ "*----- Club de campo para millonetis -----*\r\n"
				+ "*******************************************\r\n"
				+ "******** 1 --> Agregar Nuevo Socio ********\r\n"
				+ "******** 2 --> Buscar Socio        ********\r\n"
				+ "******** 3 --> Mostrar Lista de Socios ****\r\n"
				+ "******** 4 --> Modificar Socio     ********\r\n"
				+ "******** 5 --> Borrar Socio        ********\r\n"
				+ "******** 0 --> Salir               ********\r\n"
				+ "*******************************************\r\n"
				+ "*******************************************");
		
		menu1 = Leer.datoInt();
		
		switch(menu1) {
		
		case 1:
			//System.out.println("Diga en qué posición quiere guardar el nuevo socio \n");
			//index = Leer.datoInt();
			System.out.println("Diga el nombre del nuevo socio \n");
			nombreSo= Leer.dato();
			System.out.println("Diga los apellidos del nuevo socio \n");
			apellidosSo = Leer.dato();
			System.out.println("Diga el DNI del nuevo socio \n");
			dniSo = Leer.dato();
			System.out.println("Diga el movil del nuevo socio \n");
			movilSo = Leer.dato();
			System.out.println("Diga el email del nuevo socio \n");
			emailSo = Leer.dato();
			
			numeroSo=r.nextInt(hasta-desde+1)+desde;
			
			System.out.println(numeroSo);
			
			gesClub.guardarSocio(new Socio (nombreSo,apellidosSo,dniSo,movilSo,emailSo,numeroSo));
			
			break ;
			
		case 2:
			System.out.println("Diga el DNI del socio a buscar \n");
			dniSo = Leer.dato();
			
			System.out.println(gesClub.getListaSocios().get(gesClub.buscarSocio(dniSo)));
			
		break ;
		
		case 3:
			
			System.out.println("La lista de socios del club de campo es: \n");
			gesClub.imprimirSocios();
			
			break;
			
		case 4:
			
			System.out.println("Diga el dni del socio que quieres modificar \n");
			dniSo = Leer.dato();
			System.out.println("Diga el nuevo nombre que quieres ponerle al socio \n");
			nombreSo = Leer.dato();
			
			gesClub.modificarSocio(dniSo, nombreSo);
			
			break;
			
		case 5:
			
			System.out.println("Diga el DNI del socio que quieres borrar \n");
			dniSo = Leer.dato();
			
			gesClub.borrarSocio(dniSo);
			
			break;
			
		case 0:
			System.out.println("¡Hasta pronto! \n");
			
			break;
			
		default :
			
			System.out.println("Número erróneo \n");
			
			break;
			
		
		
		
		
		
		
		}
		
		}while(menu1 != 0);
		
	}

}
