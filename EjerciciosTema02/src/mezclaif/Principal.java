package mezclaif;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int producto1=1, producto2=1, producto3=1;
		int oferta, cliente=100;
		boolean leche=true;
		
		//Nos pide la cantidad de productos que llevamos
		System.out.println("¿Cuantos productos llevas?");
		producto1=Leer.datoInt();
		producto2=Leer.datoInt();
		producto3=Leer.datoInt();
		
		
		oferta = producto1+producto2+producto3;
		if(oferta >=3) {
			System.out.println("Se te aplica el descuento 3x2");
				
			
			
		}
		else {
			System.out.println("No tienes descuentos a aplicar");
		}
		
		System.out.println("¿Qué producto llevas?");
	     
		//Da por sentado que lleva leche, al no poder leer booleanos aun...
			if(leche) {
				System.out.println("Aparte se te aplica un descuento especial por llevar leche");
				
			}
			else {
				
			
			}
			
		//Se le aplica otro descuento si es el cliente número 100
			
			System.out.println("¿Qué número de cliente eres?");
			cliente=Leer.datoInt();
			
			if(cliente == 100) {
				System.out.println("Enhorabuena, eres el cliente número 100");
				
			}
			else {
				System.out.println("No eres el cliente número 100");
				
			}
			
		
			
			
			
	}
}
				

