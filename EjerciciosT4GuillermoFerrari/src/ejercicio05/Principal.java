package ejercicio05;



import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una clase Empleado con los atributos nombre, sueldo base, recaudado por
		 * ventas realizadas y nº de Empleado. Introducir los métodos necesarios y
		 * oportunos. Crear una clase derivada de ella, llamada EmpleadoAComision que
		 * tenga como atributo un incentivo (un porcentaje de las ventas realizadas en
		 * un mes sumado a su sueldo base) y los métodos apropiados para manejarla. Otra
		 * clase hija puede ser EmpleadoFijo, cuyo sueldo es el base, pero al que se le
		 * quita un % de impuestos (consideraremos que al empleado por comisión no se le
		 * quita nada para que el ejercicio tenga algo más de sentido). Crear una clase
		 * Oficina caracterizada por una lista de Empleados donde se incluya un método
		 * que calcule el sueldo de un empleado al que se le pase un empleado y otro
		 * método que calcule lo gastado por la oficina en total por el pago de sueldos
		 * a todos los empleados. Probar el programa en una clase principal,
		 * instanciando un array de empleados guardando varios tipos incluyendo un
		 * empleado genérico y mostrando su sueldo. Si el empleado es “a comisión”, se
		 * le debe felicitar cuando haya ganado más de 500 € con un mensaje por
		 * pantalla.
		 */

		double sueldoBase;
		double recaudadoVentas;
		int numEmpleado;
		double incentivos;
		double impuestos;
		int tam = 3;
		int denominador = 100;

		System.out.println("Diga el sueldo base del empleado: \n");
		sueldoBase = Leer.datoDouble();

		System.out.println("Diga el importe recaudado por las ventas: \n");
		recaudadoVentas = Leer.datoDouble();

		System.out.println(
				"Diga el % de incentivo que quieres aplicar al total recaudado de ventas para la comisión: \n");
		incentivos = Leer.datoDouble();

		System.out.println("Diga la % de impuestos sobre el sueldo base que quieres descontar al empleado fijo: \n");
		impuestos = Leer.datoDouble();

		Empleado lista[] = new Empleado[3];

		lista[0] = new EmpleadoFijo("Pedrito", sueldoBase, recaudadoVentas, 35345, impuestos);
		lista[1] = new EmpleadoAComision("Manolito", sueldoBase, recaudadoVentas, 765653, incentivos);
		lista[2] = new Empleado("Juanito", sueldoBase, recaudadoVentas, 45345);

		//Empleado e1 = new EmpleadoFijo("Pedrito", sueldoBase, recaudadoVentas, 35345, impuestos);

		Empleado e2 = new EmpleadoAComision("Manolito", sueldoBase, recaudadoVentas, 765653, incentivos);

		Empleado emp = new Empleado("Juanito", sueldoBase, recaudadoVentas, 45345);

		Oficina of1 = new Oficina();

		System.out.println(lista[0]);
		System.out.printf("El sueldo de un empleado fijo es de %.2f euros \n\n",
				lista[0].calcularSueldo(), "\n\n");

		System.out.println(e2);
		System.out.printf("El sueldo de un empleado a comisión es de %.2f euros \n\n",
				e2.calcularSueldo(), "\n\n");

		System.out.println(emp);
		System.out.printf("El sueldo de un empleado genérico es de %.2f euros \n\n",
				emp.calcularSueldo(), "\n\n");

		

		
			 System.out.println(of1.calcularElSueldoDeUnEmpleado(lista[0]));
			 System.out.println(of1.calcularElSueldoDeUnEmpleado(e2));
			 System.out.println(of1.calcularElSueldoDeUnEmpleado(emp));
			 System.out.printf("La oficina se ha gastado en total de todos los empleados: %.2f euros \n", 
					  of1.calcularLoGastadoOficina(lista));
			 

		
		
		
		
		
		

		if ((e2.getRecaudadoVentas()*incentivos)/denominador > 500) {

			System.out.println(e2.getNombre() + "¡¡¡Felicidades, eres el empleado del mes!!! \n\n");
		} else {
			System.out.println("\n\n");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
