package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Los vehículos a motor pagan un determinado impuesto de circulación. La
		 * cantidad a pagar depende de la cilindrada, caballos y tipo de combustible.
		 * Crear un programa para calcular la cantidad que debe pagar un vehículo
		 * dependiendo de sus características. (Los vehículos a motor pueden ser
		 * motocicletas, coches y furgonetas). El impuesto se calcula con una cantidad
		 * fija por el simple hecho de ser un vehículo con motor, más el 60 % de la
		 * potencia en el caso de las motocicletas, más una cantidad fija a las
		 * furgonetas por ser transporte de mercancías y más el 25 % de la cilindrada
		 * para los coches. La jerarquía de clases no tiene mucho sentido en este
		 * ejemplo, pero está puesto para reescribir métodos. Probar todo en un main.
		 */

		double impuesto = 0.00, porcentajePotencia = 0.00, porcentajeCilindrada = 0.00, impMercancias = 0.00;
		double cilindrada = 0.00;
		double cv = 0.00;
		String combustible;
		int menu1;

		System.out.println("Indique la cantidad del impuesto básico para vehículos a motor: ");
		impuesto = Leer.datoDouble();

		Vehiculos ve1 = new Vehiculos(impuesto);

		do {

			System.out.println("****************************************\r\n"
					+ "**          Elija una opción          **\r\n" + "****************************************\r\n"
					+ "** 1 --> Ver impuesto básico vehículo **\r\n" + "** 2 --> Impuesto Motocicleta         **\r\n"
					+ "** 3 --> Impuesto Furgoneta           **\r\n" + "** 4 --> Impuesto Coche               **\r\n"
					+ "** 0 --> Salir                        **\r\n" + "****************************************\n");
			menu1 = Leer.datoInt();

			switch (menu1) {
			case 1:

				
				System.out.printf("El impuesto básico a pagar por un vehículo es de %.2f euros.\n\n",
						ve1.calcularImpuesto(impuesto, porcentajePotencia, porcentajeCilindrada, impMercancias));

				break;

			case 2:

				System.out.println("Indique la cilindrada de la motocicleta: ");
				cilindrada = Leer.datoDouble();
				
				System.out.println("Indique los cv de la motocicleta: ");
				cv = Leer.datoDouble();
				
				System.out
						.println("Indique que % de potencia quieres añadir al precio del impuesto de la motocicleta: ");
				porcentajePotencia = Leer.datoDouble();

				Motocicletas moto1 = new Motocicletas(impuesto, cilindrada, cv);

				System.out.println(moto1);
				
				System.out.printf("El impuesto a pagar por la motocicleta es de %.2f euros.\n\n",
						moto1.calcularImpuesto(impuesto, porcentajePotencia, porcentajeCilindrada, impMercancias));

				break;

			case 3:

				System.out.println("Indique la cilindrada de la furgoneta: ");
				cilindrada = Leer.datoDouble();
				
				System.out.println("Indique los cv de la furgoneta: ");
				cv = Leer.datoDouble();
				
				System.out.println("Indique el tipo de combustible de la furgoneta: ");
				combustible = Leer.dato();
				
				System.out.println("Indique la cantidad que quieres agregar al "
						+ "impuesto de la furgoneta por llevar mercancias peligrosas: ");
				impMercancias = Leer.datoDouble();

				Furgonetas furgo1 = new Furgonetas(impuesto, cilindrada, cv, combustible);

				System.out.println(furgo1);
				
				System.out.printf("El impuesto a pagar por la furgoneta es de %.2f euros.\n\n",
						furgo1.calcularImpuesto(impuesto, porcentajePotencia, porcentajeCilindrada, impMercancias));

				break;

			case 4:

				System.out.println("Indique la cilindrada del coche: ");
				cilindrada = Leer.datoDouble();
				
				System.out.println("Indique los cv del coche: ");
				cv = Leer.datoDouble();
				
				System.out.println("Indique el tipo de combustible del coche: ");
				combustible = Leer.dato();
				
				System.out.println("Indique que % de cilindrada quieres añadir al precio del impuesto del coche: ");
				porcentajeCilindrada = Leer.datoDouble();

				Coches co1 = new Coches(impuesto, cilindrada, cv, combustible);

				System.out.println(co1);
				System.out.printf("El impuesto a pagar por el coche es de %.2f euros.\n\n",
						co1.calcularImpuesto(impuesto, porcentajePotencia, porcentajeCilindrada, impMercancias));

				break;

			case 0:
				System.out.println("¡¡Hasta pronto!!\n\n");

				break;

			default:
				System.out.println("Número erróneo, pulse un número de los que aparece en el menú.\n");

				break;

			}

		} while (menu1 != 0);

	}

}
