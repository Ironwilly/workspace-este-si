package repasando2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Vamos a intentar modelar a un vendedor ambulante de �productos
		 * tecnol�gicos�. Tendremos una clase abstracta Producto cuyos atributos ser�n,
		 * como m�nimo (quiz� hagan falta m�s), precio base, cantidad de unidades de un
		 * producto y nombre. Tendremos dos tipos espec�ficos de productos, m�viles y
		 * espadas l�ser. La clase m�vil no tienen ning�n atributo especial (pod�is
		 * poner algunos que quer�is como marca, modelo, etc.). La clase Espada tiene
		 * como atributo un String que informe sobre el tipo de espada que es (simple,
		 * double...). Ponemos String aunque no tenga mucho sentido, para trabajar con
		 * equals (). Vamos a reescribir un m�todo llamado calcularPVP (double
		 * porcentaje) que ser� el m�todo que calcula el precio de Venta al P�blico. En
		 * una clase ventas, adem�s de tener un array de productos, se deben crear
		 * m�todos que hagan las siguientes operaciones: Devolver la cantidad de
		 * productos que quedan por vender (en total), sin especificar de qu� tipo.
		 * Calcular la cantidad total de dinero recaudado entre todas ventas. Devolver
		 * cambio, pasando lo que se debe pagar y el dinero entregado y retornando la
		 * cantidad a devolver. Mostrar listado de productos completo mostrando los
		 * avisos cuando sea necesario. Escribir tambi�n una clase principal para hacer
		 * todas las operaciones. Se pueden crear los objetos directamente sin pedir los
		 * datos por teclado. El precio de venta al p�blico de un m�vil se calcula como
		 * el precio base m�s el porcentaje de ganancia del vendedor (pasado desde fuera
		 * como par�metro) y el precio de venta de una espada l�ser es el precio base
		 * m�s el porcentaje de ganancia m�s una cantidad fija solo si la espada l�ser
		 * es �doble�, como la de Darth Maul. Debemos tener en cuenta tambi�n que, si se
		 * compra una espada l�ser debe aparecer un mensaje diciendo ��Cuidad�n al
		 * sacarla de la bolsa, que hace pupa!�.
		 */

		        double dineroEntregado = 5000;
				double dineroGastado = 0.0;
				double porcentaje = 20;
				double suplemento = 35;
		        
		        
		        
		        Producto p1 = new Movil(350,6,"tel�fono",false,"apple","iphone X");
		        Producto p2 = new Movil(450,5,"tel�fono",true,"apple","iphone 11");
		        Producto p3 = new Movil(550,4,"tel�fono",false,"apple","iphone 11 pro");
		        
		        
		        
		        Producto p4 = new EspadaLaser(250,5,"espada",true,"Doble");
		        Producto p5 = new EspadaLaser(150,4,"espada",true,"Simple");
		        Producto p6 = new EspadaLaser(250,5,"espada",false,"Doble");
		        
		        Producto lista[] = new Producto []{p1,p2,p3,p4,p5,p6};
		        
		        Ventas ven = new Ventas(lista);
		        
		        dineroGastado = ven.calcularDineroTotalVentas(porcentaje, suplemento);
		        
		        System.out.printf("El total de dinero entregado es de %.2f euros \n", dineroEntregado);
		        
		        System.out.println(p1.calcularPvp(porcentaje, suplemento));
		        System.out.println(p2.calcularPvp(porcentaje, suplemento));
		        System.out.println(p3.calcularPvp(porcentaje, suplemento));
		        System.out.println(p4.calcularPvp(porcentaje, suplemento));
		        System.out.println(p5.calcularPvp(porcentaje, suplemento));
		        System.out.println(p6.calcularPvp(porcentaje, suplemento));
		        
		        ven.mostrarProductosNoVendidos();
		        System.out.println(ven.calcularDineroTotalVentas(porcentaje, suplemento )+"\n");
		        System.out.println(ven.devolverCambio(dineroEntregado, dineroGastado)+"\n");
		        ven.mostrarListadoProductos();
		        ven.mostrarProductosNoVendidos();
		        
		        
		        
		        
		        
		        
		
		
		
		
	}

}
