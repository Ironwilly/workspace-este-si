package datos;

import java.util.Random;

import model.Barco;

public class BdBarcos {

	
	
	Barco b4 = new Barco (4,"portaAviones","4");
	Barco b3 = new Barco (3,"Destructor","3");
	Barco b2 = new Barco (2,"Fragata","2");
	Barco b1 = new Barco (1,"Canoa","1");
	
	public BdBarcos() {

	}
	public BdBarcos(Barco b4, Barco b3, Barco b2, Barco b1) {
		super();
		this.b4 = b4;
		this.b3 = b3;
		this.b2 = b2;
		this.b1 = b1;
	}
	
	public Barco getB4() {
		return b4;
	}
	public void setB4(Barco b4) {
		this.b4 = b4;
	}
	public Barco getB3() {
		return b3;
	}
	public void setB3(Barco b3) {
		this.b3 = b3;
	}
	public Barco getB2() {
		return b2;
	}
	public void setB2(Barco b2) {
		this.b2 = b2;
	}
	public Barco getB1() {
		return b1;
	}
	public void setB1(Barco b1) {
		this.b1 = b1;
	}

	
	
	
	
		
	}
	
	
	



	
