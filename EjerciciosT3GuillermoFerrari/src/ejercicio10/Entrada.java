package ejercicio10;

public class Entrada {

	// Atributos

	private int id;
	private int precio;
	private boolean libre;
	private int numFila;
	private int numButaca;

	// Constructores

	public Entrada(int id, int precio, boolean estado, int numFila, int numButaca) {
		super();
		this.id = id;
		this.precio = precio;
		this.libre = estado;
		this.numFila = numFila;
		this.numButaca = numButaca;
	}

	// Getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return libre;
	}

	public void setEstado(boolean estado) {
		this.libre = libre;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumButaca() {
		return numButaca;
	}

	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}

	// To string

	@Override
	public String toString() {
		return "Entrada [id=" + id + ", precio=" + precio + ", libre=" + libre + ", numFila=" + numFila + ", numButaca="
				+ numButaca + "]";
	}

}
