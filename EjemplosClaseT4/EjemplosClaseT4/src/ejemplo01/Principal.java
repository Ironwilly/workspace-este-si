package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador t = new Trabajador ("Sergio","Director");
		Empleado e = new Empleado ("Juan","Administrador",1200.0,20.0);
		Consultor c = new Consultor ("Pepe","Secretario",160,23.0);
		
		System.out.println(t.getNombre());
		System.out.println(e.getNombre());
		
		System.out.println();
		
		System.out.println(t.calcularPaga());
		System.out.println(e.calcularPaga());
		System.out.println(c.calcularPaga());
		
		

	}

}
