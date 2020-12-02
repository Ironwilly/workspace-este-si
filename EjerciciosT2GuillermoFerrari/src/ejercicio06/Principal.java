package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por
		//pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes
		//(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
		//PLANETA     Mercurio Venus Tierra Marte Júpiter Saturno  Urano Neptuno Plutón
		//EQUIVALENCIA  0.38    0.91  1.00  0.38   2.53     1.06   0.92   1.2     0.06
		//Incluir un do-while
		
		
		double peso, mercurio=0.38, venus=0.91, tierra = 1.00;
		double marte=0.38, jupiter=2.53, saturno=1.06, urano=0.92, neptuno=1.2, pluton=0.62;
		int planetas;
		
		
		
		
		do {
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>Equivalencias de peso en los planetas del sistema solar<<");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("1 -> Mercurio");
		System.out.println("2 -> Venus");
		System.out.println("3 -> Tierra");
		System.out.println("4 -> Marte");
		System.out.println("5 -> Júpiter");
		System.out.println("6 -> Saturno");
		System.out.println("7 -> Urano");
		System.out.println("8 -> Neptuno");
		System.out.println("9 -> Plutón\n");
		System.out.println("0 -> Salir\n");
		
		
		System.out.println("¿En que planeta quiere saber cuánto pesas?:");
		planetas = Leer.datoInt();
		
		System.out.println("Introduzca su peso:");
		peso=Leer.datoDouble();
		
		switch (planetas) {
		case 1:
			peso=peso*mercurio;
			System.out.printf("Su peso en mercurio es de %.2f Kg\n",peso);
			
			break;
		case 2:
			peso=peso*venus;
			System.out.printf("Su peso en venus es de %.2f Kg\n",peso);
			
			break;
		case 3:
			peso=peso*tierra;
			System.out.printf("Su peso en la tierra es de %.2f Kg\n", peso);
			
			break;
		case 4:
			peso=peso*marte;
			System.out.printf("Su peso en marte es de %.2f Kg\n",peso);
			break;
		case 5:
			peso=peso*jupiter;
			System.out.printf("Su peso en júpiter es de %.2f Kg\n", peso);
			break;
		case 6:
			peso=peso*saturno;
			System.out.printf("Su peso en saturno es de %.2f Kg\n",peso);
			break;
		case 7:
			peso=peso*urano;
			System.out.printf("Su peso en urano es de %.2f Kg\n",peso);
			
			break;
		case 8:
			peso=peso*neptuno;
			System.out.printf("Su peso en neptuno es de %.2f Kg\n",peso);
			
			break;
		case 9:
			peso=peso*pluton;
			System.out.printf("Su peso en plutón es de %.2f Kg\n",peso);
			break;
		
		case 0:
			System.out.println("Vuelve pronto!\n");
			break;
		default:
				System.out.println("Error!");
				break;
		}
		
		}while (planetas >=1 && planetas <=9);
		
		
		
			
		
		
		
		
		
		
		
		
	}

}
