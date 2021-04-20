package datos;

import java.util.ArrayList;
import java.util.List;

import pojo.ProductosLimpieza;

public class DatosLimpieza {
	
	private List <ProductosLimpieza> listaLimpieza;

	public DatosLimpieza(List<ProductosLimpieza> listaLimpieza) {
		super();
		this.listaLimpieza = listaLimpieza;
	}
	
	public DatosLimpieza () {
		this.listaLimpieza=new ArrayList <ProductosLimpieza> ();
		
		//Algunos productos están en mayúsculas y otros en minúsculas, simulando la introducción por usuarios.
		listaLimpieza.add(new ProductosLimpieza ("Lavavajillas", 3.20, 125.50, true));
		listaLimpieza.add(new ProductosLimpieza ("Frega suelos pino verde", 2.60, 300.80, false));
		listaLimpieza.add(new ProductosLimpieza ("Sanytol", 3.55, 500, true));
		listaLimpieza.add(new ProductosLimpieza ("Sanytol", 1.85, 250, true));
		listaLimpieza.add(new ProductosLimpieza ("Quita grasas", 4.60, 240, false));
		listaLimpieza.add(new ProductosLimpieza ("Pronto jabonoso", 2.86, 180, false ));
		listaLimpieza.add(new ProductosLimpieza ("lejia", 3.22,1500, true));
		listaLimpieza.add(new ProductosLimpieza ("lejia", 2.29, 800, false));
		listaLimpieza.add(new ProductosLimpieza ("lejia", 1.99, 500, false));
		listaLimpieza.add(new ProductosLimpieza ("Detergente marsella", 4.43, 5200, false));
		listaLimpieza.add(new ProductosLimpieza ("Vinagre de limpieza", 0.89, 320, true));
		listaLimpieza.add(new ProductosLimpieza ("Limpia cristales", 2.50, 250, false));
		listaLimpieza.add(new ProductosLimpieza ("Taifol", 1.75, 650, false));
		listaLimpieza.add(new ProductosLimpieza ("Taifol", 1.20, 410, false));
		listaLimpieza.add(new ProductosLimpieza ("Quita Grasas", 1.75, 150, true));
		
		
	}

	public List<ProductosLimpieza> getListaLimpieza() {
		return listaLimpieza;
	}

	public void setListaLimpieza(List<ProductosLimpieza> listaLimpieza) {
		this.listaLimpieza = listaLimpieza;
	}

	@Override
	public String toString() {
		return "DatosLimpieza listaLimpieza=" + listaLimpieza + "";
	}
	
	

}
