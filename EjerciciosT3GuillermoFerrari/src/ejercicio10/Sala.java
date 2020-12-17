package ejercicio10;

public class Sala {

	// atributos

	private int idSala;
	private int numLocalidades;
	private Entrada en2;

	// constructores

	public Sala(int idSala, int numLocalidades, Entrada en2) {
		super();
		this.idSala = idSala;
		this.numLocalidades = numLocalidades;
		this.en2 = en2;
	}

	// getters and setters

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public int getNumLocalidades() {
		return numLocalidades;
	}

	public void setNumLocalidades(int numLocalidades) {
		this.numLocalidades = numLocalidades;
	}

	public Entrada getEn2() {
		return en2;
	}

	public void setEn2(Entrada en2) {
		this.en2 = en2;
	}

	// To string

	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", numLocalidades=" + numLocalidades + ", en2=" + en2 + "]";
	}

	// métodos

	// comprobar si esta libre

	public void comprobarLibre(boolean libre) {

		if (libre == true) {

			System.out.println("************************************\r\n" + "************************************\r\n"
					+ "*** Aquí tienes tu entrada para  ***\r\n" + "***         TERMINATOR 2         ***\r\n"
					+ "***                              ***\r\n" + "***    Disfruta de la película   ***\r\n"
					+ "***                              ***\r\n" + "************************************\r\n"
					+ "************************************\n");

		} else {
			System.out.println("Esa butaca ya está ocupada.Elige otra \n");
		}

	}

}
