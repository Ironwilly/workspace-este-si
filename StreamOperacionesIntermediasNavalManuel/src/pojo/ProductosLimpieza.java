package pojo;



public class ProductosLimpieza implements Comparable<ProductosLimpieza> {

	private String nombre;
	private double precio;
	private double peso;
	private boolean aptoUsoAlimenticio;
	
	public ProductosLimpieza(String nombre, double precio, double peso, boolean aptoUsoAlimenticio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.aptoUsoAlimenticio = aptoUsoAlimenticio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isAptoUsoAlimenticio() {
		return aptoUsoAlimenticio;
	}

	public void setAptoUsoAlimenticio(boolean aptoUsoAlimenticio) {
		this.aptoUsoAlimenticio = aptoUsoAlimenticio;
	}

	@Override
	public String toString() {
		return "ProductosLimpieza --> nombre=" + nombre	 + ", precio=" + precio		 + ", peso=" + peso 		+ ", aptoUsoAlimenticio="
				+ aptoUsoAlimenticio  ;
	}

	@Override
	public int compareTo(ProductosLimpieza o) {
		if (this.precio < o.precio) {
			return -1;
		} else if (this.precio > o.precio) {
			return 1;
		}
		return 0;
	}
	
	

	
}
