package ejercicioEnClase;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hacer un programa que imprima un ticket de compra, basándonos en un
		 * supermercado. Debemos crear la clase Producto genérica y tres hijas con un
		 * atributo más cada una (Alimentación, Ropa y Electrónica). Cada Producto
		 * genérico deberá estar caracterizado por el precio unitario, nombre, código de
		 * identificación, etc. El ticket debe mostrar usando métodos: ✓ El nombre de
		 * los productos de la cesta con su precio unitario. ✓ El precio si se ha
		 * comprado más de uno a modo de subtotal. ✓ El precio total de la compra y el
		 * resto de información de forma parecida al ejemplo (no es necesario imprimir
		 * la fecha y la hora actual, puede hacerse con un String). Agregar un método
		 * solo en la clase alimentación, que avise si al producto le quedan menos de 2
		 * días para caducar. Crear un main, donde tendremos un array de productos y se
		 * podrán guardar cualquier tipo de producto. Solo habrá la opción imprimir
		 * ticket y listar todos los productos guardados, avisando cuando a un producto
		 * de alimentación le falten menos de dos días para caducar.
		 * 
		 */
		
		//no hemos hecho los productos de electronica por que no esta realizada
		
		double descuento = 10.0;
		int topeDias =4;
		
		
		Producto p1=new Alimentacion ("Lechuga",1.20,2.00,3,true);
		
		Producto p2=new Alimentacion ("Tomate",1.70,2.00,6,true);
		
		Producto p3=new Alimentacion ("Leche",0.80,1.00,10,true);
		
		Producto p4= new Electronica ("Televisor",500, 630,10,true);
		
		Producto p5= new Electronica ("Cafetera", 125, 199,5,false);
		
		Producto p6 = new Electronica ("Portati",600,699,12,true);
		
		
		//creamos los objetos
		LineaDeVenta lv1 = new LineaDeVenta (2,p1);
		
		LineaDeVenta lv2 = new LineaDeVenta (3,p2);
		
		LineaDeVenta lv3 = new LineaDeVenta (6,p2);
		
		LineaDeVenta lv4 = new LineaDeVenta (2,p4);
		
		LineaDeVenta lv5 = new LineaDeVenta (1,p5);
		
		LineaDeVenta lv6 = new LineaDeVenta (3,p6);
		
		//agregamos objetos directamente en la inicializacion del array
		LineaDeVenta listado [] = {lv1,lv2,lv3,lv4,lv5,lv6};
		
		
		Carrito ca = new Carrito (listado);
		
		
		
		System.out.printf("%.2f",ca.calcularTotal(descuento, topeDias));
		
		

	}

}