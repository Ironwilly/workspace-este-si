package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Trabajador t1 = new Trabajador ("Willy", "Programador");
		Empleado e1 = new Empleado ("Juan", "Carpintero",1999.50,350.60);
		Consultor c1 = new Consultor ("Pedro", "Administrativo",200,11.5);
		
		System.out.println(t1.calcularPaga());
		System.out.println(e1.calcularPaga());
		System.out.println(c1.calcularPaga());
		
		System.out.println(t1.getNombre());
		System.out.println(e1.getSueldo());
		
	}

}
