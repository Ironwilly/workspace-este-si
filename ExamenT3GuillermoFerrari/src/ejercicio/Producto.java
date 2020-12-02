package ejercicio;

import utilidades.Leer;

public class Producto {

	
	//atributos
	
			String nombre;
			double precioBase;
			String seccion;
			double rebajas;
			double pvp;
			
			
			//constructores
			
			public Producto(String nombre,double precioBase,String seccion,double rebajas,double pvp) {
				
				this.nombre=nombre;
				this.precioBase=precioBase;
				this.seccion=seccion;
				this.rebajas=rebajas;
				this.pvp=pvp;
				
				
			}


			
			//getters and setters
			
			
			public String getNombre() {
				return nombre;
			}


			public void setNombre(String nombre) {
				this.nombre = nombre;
			}


			public double getPrecioBase() {
				return precioBase;
			}


			public void setPrecioBase(double precioBase) {
				this.precioBase = precioBase;
			}


			public String getSeccion() {
				return seccion;
			}


			public void setSeccion(String seccion) {
				this.seccion = seccion;
			}


			public double getRebajas() {
				return rebajas;
			}


			public void setRebajas(double rebajas) {
				this.rebajas = rebajas;
			}


			public double getPvp() {
				return pvp;
			}


			public void setPvp(double pvp) {
				this.pvp = pvp;
			}
			
			
			//metodo calcular pvp
			
			public double calcularPvp(double precioBase) {
				
				double ganancia;
				int cien=100;
				System.out.println("¿Qué % de ganancia deseas aplicar?");
				ganancia=Leer.datoDouble();
				precioBase=precioBase + ((precioBase*ganancia)/cien);
				return precioBase;
				
				
				
			}
			
			//metodo rebajas
			public double calcularRebaja(double rebajas) {
				int cien=100;
				double descuento;
				descuento=precioBase- ((precioBase*rebajas)/cien);
				return descuento;
			
				
				
			}
			
			//metodo imprimir msg
			



		
			
			
			
			//metodo tostring
			
			@Override
			public String toString() {
				return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", seccion=" + seccion
						+ ", rebajas=" + rebajas + ", pvp=" + pvp + "]";
			}
			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
