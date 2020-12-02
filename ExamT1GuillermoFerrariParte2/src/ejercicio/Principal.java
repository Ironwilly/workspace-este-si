package ejercicio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Datos de la nómina
		
		System.out.println("         *+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println("         *       Nomina de Jesus Mateos Navarro          *");
		System.out.println("         *+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println("\n\n");
		
		double sueldoBru = 1350, extra = 20*17, descuento=1.5, total=(sueldoBru + extra -descuento);
		double totalArecibir = total -(total * 12)/100;
		double irpb = (total * 12)/100;
		
		System.out.printf("Salario bruto                ----------------> %1.2f  euros", sueldoBru);
		System.out.printf("\nPlus Horas extras            ----------------> %1.2f   euros", extra);
		System.out.printf("\nDescuento pago desempleo     ----------------> -%1.2f    euros", descuento);
		System.out.printf("\nIRPB 12 por ciento descuento ----------------> -%1.2f  euros", irpb);
		
		
		System.out.printf ("\n\n\nTotal a recibir              ---------------->  %1.2f euros",totalArecibir);
		
		System.out.printf("\n\nJesus cobrará en un año con pagas extras incluidas un total de %1.2f euros.", totalArecibir*14);
		System.out.println("\n------------------------------------------------------------------------------");
		System.out.println("Jesus deberá hacer más horas extras si quiere comprar un coche de 25000 euros.");
		
		
		
		
		
		
	}

	
	
	
	
	
}
