package ejercicio04;

import ejercicio03.Mecanismo;

public class Alerta extends Exception {
	
public Alerta() {
		
		super();
	}
	
	
	public Alerta (String al) {
		
		super (al);
	}

	
	//métodos
	
	public void mostrarAlerta1(int a1,int b1)throws Alerta {
		
		
		
		throw new Alerta ("La ecuación es degenerada. \n");
	
}
	
	public void mostrarAlerta2(double discriminante)throws Alerta {
		
		
		
		throw new Alerta ("Las raíces son complejas. \n");
	
}
	
}
