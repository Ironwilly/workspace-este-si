package crud;

import java.util.Comparator;

import pojo.ProductosLimpieza;

public class OrdenarPorNombre implements Comparator <ProductosLimpieza> {

	@Override
	public int compare(ProductosLimpieza o1, ProductosLimpieza o2) {
		String p1=o1.getNombre();
		String p2=o2.getNombre();
		
		return p1.compareToIgnoreCase(p2);
	}

}
