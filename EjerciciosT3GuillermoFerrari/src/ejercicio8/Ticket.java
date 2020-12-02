package ejercicio8;

import utilidades.Leer;

public class Ticket {
	
	/*Crear un programa que emule una máquina vendedora de tickets de metro. Tendremos que crear la
	clase Ticket (Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la
	clase principal o de prueba. Podremos:
	• Comprar uno o varios billetes.
	• Calcular el cambio a devolver.
	• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el
	ticket el mensaje “válido para x personas”.
	Además, al final de la jornada, el operario que lleva el mantenimiento de la máquina, debe tener
	disponible un método que le ofrezca el saldo total de la recaudación de la máquina en ese día (no es
	necesario usar fechas) y ponga a cero el contador.
	Por último, también debe contar con la posibilidad de cambiar el precio de los billetes ya que estos
	suelen subir todos los años.
	Las operaciones para el operario se harán solo si se introduce la contraseña adecuada.
	Estas últimas funcionalidades también se harán con métodos dentro de la clase Maquina.*/
	
	//atributos
	
	double precio;
	
	
	//constructores
	public Ticket(double precio) {
		
		this.precio=precio;
	}

	
	
	//getters and setters
	

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	//metodo calcular precio
	
	public double calcularPrecio (double precioTeclado){
		double  precioActual=1.85;
		
		precioTeclado=precioActual;
		return precioTeclado;
	}
		
		
		
		
	}
	
	


