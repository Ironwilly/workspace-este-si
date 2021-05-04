package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Crear una clase Persona donde haya un método LeerDatosPersonales. Como caso
		 * muy puntual académicamente, se leerán dentro del método el nombre, apellidos,
		 * edad y DNI.
		 * 
		 * En el mismo, se debe añadir el código necesario para que se muestren los
		 * nombres de los métodos llamados hasta el método que ha producido la
		 * excepción.
		 * 
		 * Hacer la llamada en el main.
		 * 
		 */

		String nombre = "a", apellidos ="a", DNI = "a";
		int edad = 0;
		
		
		
		
		
		
		Persona pe = new Persona( nombre,  apellidos,  edad,  DNI);
		
		pe.LeerDatosPersonales();
		
		
	}

}
