package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Crear una clase Persona donde haya un m�todo LeerDatosPersonales. Como caso
		 * muy puntual acad�micamente, se leer�n dentro del m�todo el nombre, apellidos,
		 * edad y DNI.
		 * 
		 * En el mismo, se debe a�adir el c�digo necesario para que se muestren los
		 * nombres de los m�todos llamados hasta el m�todo que ha producido la
		 * excepci�n.
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
