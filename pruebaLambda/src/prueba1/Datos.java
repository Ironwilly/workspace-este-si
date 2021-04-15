package prueba1;

import java.util.ArrayList;
import java.util.List;

public class Datos {
	
	
	//atributos
	private List<Coche> listaCar;

	
	//constructores 
	public Datos(List<Coche> listaCar) {
		super();
		this.listaCar = listaCar;
	} 
	
	//Constructor personalizado
	
	public Datos() {
		super();
		this.listaCar = new ArrayList<Coche> ();
		
		
		listaCar.add(new Coche ("Toyota","Celica",143,"Azul"));
		listaCar.add(new Coche ("Renault","Megane",90,"Rojo"));
		listaCar.add(new Coche ("Seat","Leon",110,"Blanco"));
		listaCar.add(new Coche ("Seat","Ibiza",105,"Gris"));
		listaCar.add(new Coche ("BMW", "325",190,"Negro"));
	}
	
	


	
	//getters and setters
	
	public List<Coche> getListaCar() {
		return listaCar;
	}

	public void setListaCar(List<Coche> listaCar) {
		this.listaCar = listaCar;
	}

	//toString
	
	@Override
	public String toString() {
		return "Datos [listaCar=" + listaCar + "]";
	} 
	
	
	
	
	
	

}
