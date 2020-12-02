package ejercicio3;

import utilidades.Leer;

public class Cilindro {
	
	// volumen cilindro ---> A = 2 pi r ( r + h )
	
	
	// atributos
	
	
	double pi=3.1416;
	double radio ;
	double altura  ;
	
	//constructores
	
	public Cilindro (double pi,double radio,double altura) {
		
		
		this.pi=pi;
		this.radio=radio;
		this.altura=altura;
		
		
		
		
	}
	
	//Metodos
	
	public double calcularArea () {
		
		double  area;
		
		area= (pi+pi)*radio*(radio+altura);
		return area;
		
	}
	
	
	

}
