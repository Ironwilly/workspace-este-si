package prueba01;

public class Principal {

	public static void main(String[] args) {
		// Declarar un Array SIN INSTANCIAS es válido en Clases Abstractas
		Instrumento[] orquesta = new Instrumento[5];
		int i = 0;
		// Up-casting al asignarse el Arreglo
		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Saxofon();
		orquesta[i++] = new Guzla();
		orquesta[i++] = new Ukelele();
	
		 }

     
		}


