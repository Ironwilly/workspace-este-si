package ejercicio04;

import ejercicio03.Mecanismo;

public class Alerta extends Exception {
	
public Alerta() {
		
		super();
	}
	
	
	public Alerta (String al) {
		
		super (al);
	}

	
	//m�todos
	
	public void mostrarAlerta1(int a1,int b1)throws Alerta {
		
		
		
		throw new Alerta ("La ecuaci�n es degenerada. \n");
	
}
	
	public void mostrarAlerta2(double discriminante)throws Alerta {
		
		
		
		throw new Alerta ("Las ra�ces son complejas. \n");
	
}
	
}
