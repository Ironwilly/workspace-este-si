package ejercicio13tema2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		//Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga
		//16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa
		//deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario
		//que le corresponde.
		
		// hacerlo con sobrecarga y añadiendo clases
		
		double horas;
		double tope =40;
		int menu1;
		Salario s;
		
		
		
		System.out.println("Diga el número de horas ");
		
		horas=Leer.datoDouble();
		
		
		s=new Salario(horas);
		
		
		if(horas <=tope) {
			
			System.out.println("Su nómina es de "+s.calcularSalario(horas));
			
			
		}else {
			
			System.out.println("Su nómina es de "+s.calcularSalario2(horas));
		}
		
		
		
	
		
		

		
		
	}

}
