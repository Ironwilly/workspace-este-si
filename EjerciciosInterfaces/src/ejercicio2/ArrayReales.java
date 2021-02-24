package ejercicio2;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements IEstadisticas{
	
	
	//atributos
	
	private double []num;
	
	//constructores

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}
	
	//getters and setters
	

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	//ToString
	
	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}
	
	//métodos
	
	
	public void rellenarArray (int tam) {
	
	Random r;
	double ale=0.0;
	
	r = new Random(System.nanoTime());
	
	double desde = 0.0,hasta =0.0;
	
	num = new double[tam];
	
	for(int i=0;i<num.length;i++) {
		
		
		ale = r.nextDouble();
		num[i]=ale;
	}
	
	
	}
	
	

	@Override
	public double calcularMinimo(int tam) {
		
		double minimo =1000;
		for(int i=0;num[i]<0;i++) {
			
			if(minimo<num[i]) {
				
				minimo = num[i];
				
			}
			
		}
		return minimo;
	}

	
	
	
	
	
	
	
	@Override
	public double calcularMaximo(int tam) {
		// TODO Auto-generated method stub
		
		double maximo =0;
		for(int i=0;num[i]<0;i++) {
			
			if(maximo>num[i]) {
				
				maximo = num[i];
				
			}
			
		}
		return maximo;
		


	}
	
	
	
	
	
	
	

	@Override
	public double calcularSumatorio(int tam) {
		// TODO Auto-generated method stub
		double resultado=0;
		
		for (int i=0;i<num.length;i++) {
			
			resultado = resultado + num[i];
	
		}
		return resultado;
	}
	
	
	
	
	
	
	 
	
	

}
