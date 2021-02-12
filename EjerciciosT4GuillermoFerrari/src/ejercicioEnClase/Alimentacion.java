package ejercicioEnClase;

public class Alimentacion extends Producto {
	
	//atributos
	
	private int diasParaCaducidad;
	private boolean fresco;
	
	
	//constructores 
	
	public Alimentacion(String nombre, double precioBase, double pvp, int diasParaCaducidad, boolean fresco) {
		super(nombre, precioBase, pvp);
		this.diasParaCaducidad = diasParaCaducidad;
		this.fresco = fresco;
	}

	//getters and setters

	public int getDiasParaCaducidad() {
		return diasParaCaducidad;
	}


	public void setDiasParaCaducidad(int diasParaCaducidad) {
		this.diasParaCaducidad = diasParaCaducidad;
	}


	public boolean isFresco() {
		return fresco;
	}


	public void setFresco(boolean fresco) {
		this.fresco = fresco;
	}
	
	//To String

	@Override
	public String toString() {
		return "Alimentacion [diasParaCaducidad=" + diasParaCaducidad + ", fresco=" + fresco + "]";
	}
	
	//metodos

	@Override
	public double calcularPvp(double descuento, int topeDias) {
		// le quitamos el % por que quedan 2 dias para caducar
		//
		
		double denominador = 100;
		
		if(diasParaCaducidad<=topeDias ) {
			return super.getPvp()- super.getPvp()*descuento/denominador;
		}else {
		return getPvp();
		}
				
		
	}


	
	
	
	
	
	
	
	
	
	
	

	
}
