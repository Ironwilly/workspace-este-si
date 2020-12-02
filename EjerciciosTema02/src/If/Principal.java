package If;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=0, mayoria=18; 
		boolean socio =true;
		
		System.out.println("Diga su edad");
		edad=Leer.datoInt();
		
		
		//LAS CONDICIONES DE LOS IF SIEMPRE VAN A SER BOOLEANA
		
		if(edad>=mayoria) {
			
			System.out.println("¿Es usted socio?");
			//SE DEBERIA LEER SI ES SOCIO O NO
			//NO LO HACEMOS POR NO LEER BOOLEANO
			if (socio) {
				
				System.out.println("Puede pasar");
				System.out.println("Bienvenido");
			}
			
		
		
		}
		//LOS ELSE NUNCA VAN SOLOS
		
		else {
			System.out.println("Ven con tus padres");
			
		}
		
		System.out.println("Adiós");
		
		
		
		
	}

}
