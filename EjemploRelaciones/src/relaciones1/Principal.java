package relaciones1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String nombreTeclado;
		int edadTeclado;
		String dniTeclado;
		int num,nuevaEdad;
		double saldo;
		Cliente cliente, clienteDirecto;
		Cuenta c1;
		
		
		//cliente directo sin leer datos por teclado
		clienteDirecto=new Cliente("Guillermo",41, "123456q");
		
		//creamos un cliente leyendo datos por teclado
		System.out.println("Diga su nombre");
		nombreTeclado=Leer.dato();
		System.out.println("Diga su edad");
		edadTeclado=Leer.datoInt();
		System.out.println("Diga su dni");
		dniTeclado=Leer.dato();
		
		
		
		
		
		
		//creamos objeto de prueba
		
		cliente=new Cliente(nombreTeclado,edadTeclado,dniTeclado);
		
		
		
		//creamos una cuenta 
		
		System.out.println("Diga número de cuenta");
		num=Leer.datoInt();
		System.out.println("Diga número su saldo inicial");
		saldo=Leer.datoDouble();
		
		c1=new Cuenta (num,saldo,cliente);
		System.out.println(c1);
		
		System.out.println("Diga su nueva edad"); /// con esto vemos que al cambiar un atributo del CLIENTE, cambia tb el de la cuenta
		nuevaEdad=Leer.datoInt();
		
		cliente.setEdad(nuevaEdad);
		System.out.println(c1);
		

	}

}
