package ejemploAbstractas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Figura f = new Figura (2.5,2.5);*/
		/*NO SE PUEDE CREAR YA QUE ES UNA CLASE ABSTRACTA*/
		
		Cuadrado c = new Cuadrado (2.5,2.5,4);
		
		System.out.println(c.calcularArea());
		
		System.out.println(c.getX());

	}

}
