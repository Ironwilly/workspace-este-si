package ejercicio8;

import utilidades.Leer;

public class Ticket {
	
	/*Crear un programa que emule una m�quina vendedora de tickets de metro. Tendremos que crear la
	clase Ticket (Clase POJO), la clase Maquina (donde estar�n todos los m�todos con funcionalidad) y la
	clase principal o de prueba. Podremos:
	� Comprar uno o varios billetes.
	� Calcular el cambio a devolver.
	� Imprimir por pantalla el billete. Solo uno. Si se han comprado �x� debemos mostrar en el
	ticket el mensaje �v�lido para x personas�.
	Adem�s, al final de la jornada, el operario que lleva el mantenimiento de la m�quina, debe tener
	disponible un m�todo que le ofrezca el saldo total de la recaudaci�n de la m�quina en ese d�a (no es
	necesario usar fechas) y ponga a cero el contador.
	Por �ltimo, tambi�n debe contar con la posibilidad de cambiar el precio de los billetes ya que estos
	suelen subir todos los a�os.
	Las operaciones para el operario se har�n solo si se introduce la contrase�a adecuada.
	Estas �ltimas funcionalidades tambi�n se har�n con m�todos dentro de la clase Maquina.*/
	
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
	
	


