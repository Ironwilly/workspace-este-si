package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada
		//por su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:
		//• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No
		//imprime de nuevo el saldo, pero sí lo actualiza.
		//• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta
		//una determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el
		//saldo, pero sí lo actualiza.
		//• Calcular saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el
		//valor del saldo en dólares.
		//• Consultar el saldo.
		//Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que
		//implemente las funcionalidades descritas y un main con un menú para probarlas.
		
		
		
		String nombreTeclado;
		double cantidadTeclado,retirarTeclado;
		double cantidad,total;
		
		
		CuentaCorriente cc1;
		
		
		System.out.println("Introduzca tu nombre");
		nombreTeclado=Leer.dato();
		
		System.out.println("Introduzca la cantidad de dinero que vas a ingresar");
		cantidadTeclado=Leer.datoDouble();
		
		cc1=new CuentaCorriente(nombreTeclado,cantidadTeclado);
		System.out.println(cc1.getNombre());
		cc1.getSaldo();
		cc1.setNombre(nombreTeclado);
		cc1.setSaldo(cantidadTeclado);
		total=cc1.ingresarSaldo(cantidadTeclado);
		
		
		System.out.println("Introduzca la cantidad de dinero que deseas retirar");
		retirarTeclado=Leer.datoDouble();
		cc1.getSaldo();
		cc1.setSaldo(retirarTeclado);
		cantidad=cc1.retirarSaldo(total - retirarTeclado);
		System.out.println(cc1.retirarSaldo(total)); 
		
		
		
		
		
		

	}

}
