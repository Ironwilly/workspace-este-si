package ejercicio404;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		Haz un ejercicio utilizando el ejemplo de Figura del polimorfismo visto en clase, pero con la estructura de clases 
		de la introducción, es decir, clase madre Cuenta, CuentaCorriente, CuentaAhorro, una clase Banco con un array de cuentas 
		y un main para probar todo. Pon comentarios a todo para que sirva como una especie de "apuntes".
		Inventa los atributos y los cálculos del método reescrito de forma sencilla. En la clase Banco puedes poner algunos 
		métodos que trabajen con el array de Cuentas.
		*/
		
		CuentaCorriente cCorriente = new CuentaCorriente ("Corriente",6700,3210); // la informacion de la cuenta corriente
		Cuenta cc1 = new CuentaCorriente ("Corriente",6700,3210); // la informacion de la cuenta corriente pero desde la cuenta abstracta
		CuentaAhorro cAhorro = new CuentaAhorro ("Ahorro",450,7280);
		Cuenta ca1 = new CuentaAhorro ("Ahorro",450,7280);
		Banco ba = new Banco ();
		
		Cuenta lista[] = new Cuenta[4];
		
		lista[0] = new CuentaCorriente("Corriente",6700,3210);
		lista[1] = new CuentaCorriente("Corriente",4500,1710);
		lista[2] = new CuentaAhorro("Ahorro",450,7280);
		lista[3] = new CuentaAhorro("Ahorro",220,1480);
		
		System.out.println(cc1);
		System.out.println("Tu ingreso es de: "+cc1.calcularIngreso()+" euros");
		System.out.println("Tu saldo total es de: "+cc1.calcularSaldoTotal()+" euros");
		cCorriente.mostrarFrase();
		
		
		
		System.out.println(ca1);
		System.out.println("Descontando los gastos, te quedan un total de: "+ca1.calcularIngreso()+" euros");
		System.out.println("Si no hubieras gastado nada tendrías ahorrado: "+ca1.calcularSaldoTotal()+" euros");
		cAhorro.mostrarFrase2();
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(ba.calcularSaldoTotalDeUnaCuenta(lista[i]));
		}
		
		
		
		
		
		
		
		

	}

}
