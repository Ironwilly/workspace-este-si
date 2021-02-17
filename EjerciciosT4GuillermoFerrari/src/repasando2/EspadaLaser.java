package repasando2;

public class EspadaLaser extends Producto{
	
	
	//atributo
	private String tipoEspada;

	
	
	//Constructores
	
	public EspadaLaser(double precioBase, int unidades, String nombre, boolean vendido, String tipoEspada) {
		super(precioBase, unidades, nombre, vendido);
		this.tipoEspada = tipoEspada;
	}


	//getters and setters



	
	public String getTipoEspada() {
		return tipoEspada;
	}







	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}


	//ToString 
	
	@Override
	public String toString() {
		return "EspadaLaser [tipoEspada=" + tipoEspada + super.toString() + "]";
	}



	//métodos





	@Override
	public double calcularPvp(double porcentaje, double suplemento) {
		
		int denominador = 100;
		double pvp;
		
		String EspadaDoble = "Doble";
		if(tipoEspada.equals("Doble")) {
			
			pvp= super.getPrecioBase() + (super.getPrecioBase()*porcentaje)/100 
					+ suplemento;
			
			
		}else {
			pvp= super.getPrecioBase() + (super.getPrecioBase()*porcentaje)/100;
		}
		return pvp;
	}
	
	
	
	

	
	
	
	
	
	
	

}
