package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Escribir un programa que tenga una clase Documento y dos clases derivadas, Tarjeta de visita y
		Carta. Crear los métodos necesarios para que cada tipo de documento se imprima en pantalla de una
		forma diferente, según sus características. Como es un ejemplo académico, podemos hacer los métodos
		de impresión dentro de cada clase y estos pueden imprimir por pantalla con sysos.
		Crear un main para hacer una prueba con cada método llamado con objetos de las distintas clases. Por
		ejemplo, el documento genérico solo tiene un pequeño encabezado con los datos de la empresa, la
		tarjeta puede llevar, además, los datos de contacto de una persona y la carta, la fecha.
		*/
		
		
		
		
		Documento docu = new Documento("Triana Server SL.\r\n"
				+ "c/ San jacinto 28,41010 sevilla.");
		TarjetaDeVisita tarje = new TarjetaDeVisita ("Triana Server SL.\r\n"
				+ "c/ San jacinto 28,41010 sevilla.","Lucas","García Navarro","lucasgarcianavarro@gmail.com","666555444");
		
		Carta car = new Carta("Triana Server SL.\r\n"
				+ "c/ San jacinto 28,41010 sevilla.","03/02/2021");
		
		
		
		
		
		docu.imprimirDatos();
		tarje.imprimirDatos();
		car.imprimirDatos();
		
		
		
		
		

	}

}
