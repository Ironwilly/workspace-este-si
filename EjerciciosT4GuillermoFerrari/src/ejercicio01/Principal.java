package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Crear un programa con una clase ordenador que permita modelar uno con caracter�sticas como
		  capacidad de disco duro, frecuencia del procesador, precio base, etc. Crear dos clases hijas, llamadas
		  Tablet y Port�til. A�adir atributos que especifiquen su estado respecto a los ordenadores normales, al
          menos un atributo m�s.
          La clase madre debe tener un m�todo para calcular el precio de venta al p�blico aplicando un % de
          ganancia del vendedor al precio base. Este m�todo se debe reescribir en las clases hijas con alg�n
          aspecto concreto de cada una de ellas para calcular el precio de otra forma. Por ejemplo, a la tablet se
          le puede a�adir un plus por el seguro de rotura de pantalla y al port�til un descuento por estar de oferta.
          Crear un main sencillo (no es necesario crear men�) para comprobar todo, basta llamar a los m�todos
          en orden adecuado y mostrar el resultado de los c�lculos que hace cada uno, es decir, el precio de venta
          al p�blico de un objeto de cada tipo (un ordenador, una tablet y un port�til)
		
		 */
		
		int porcentaje;
		

		Ordenador Ord1= new Ordenador(500,3.2,650,8);
		Tablet Tabl1 = new Tablet(250,1.9,380,4,10.4,4);
		Portatil Porta1 = new Portatil(250,2.4,499,8,15.4,1.8);
		
		
		
		
		
		
		System.out.println("Diga el porcentaje de ganancias que quieres aplicar sobre el precio base al ordenador: ");
		porcentaje=Leer.datoInt();
		
		System.out.println(Ord1);
		System.out.printf("El precio final del ordenador es de %.2f euros \n\n",Ord1.calcularPrecioFinal(porcentaje));
		
		
		System.out.println("El precio de 15 euros del plus del seguro de rotura se le suma al precio final de la tablet");
	
		System.out.println("Diga el porcentaje de ganancias que quieres aplicar sobre el precio base de la tablet: ");
		porcentaje=Leer.datoInt();
		
		System.out.println(Tabl1);
		System.out.printf("El precio final de la tablet con el plus de seguro de rotura es de %.2f euros \n\n",Tabl1.calcularPrecioFinal(porcentaje));
		
		
			
		System.out.println("El porcentaje de descuentos es del 8% que se le recta al precio final del port�til.");
		System.out.println("Diga el porcentaje de ganancias que quieres aplicar sobre el precio base del portatil: ");
		porcentaje=Leer.datoInt();
		
		System.out.println(Porta1);
		System.out.printf("El precio del portatil con descuento es de %.2f euros \n\n",Porta1.calcularPrecioFinal(porcentaje));
		
			
			
	
			
		
		
		
		
		} 
		
	
		
		
	

}
