package utilidades;

import java.util.stream.IntStream;

public class EjemploVelocidadParalelo {

	public static void testSecuencial() {
		System.out.println("Test secuencial");
		System.out.println("Este test suma un rango de enteros pausando el hilo cada vez");
		System.out.println("Cargando...");
		
		long numero1 = System.currentTimeMillis();

		IntStream lista = IntStream.range(1, 10);
		int total = lista
				.map(EjemploVelocidadParalelo::duplicar)
				.sum();

		long numero2 = System.currentTimeMillis();
		System.out.println("Test ejecutado correctamente, resultados:");
		System.out.println("Tiempo de ejecución: "+ (numero2 - numero1));
		System.out.println("Resultado suma realizada: "+total);

	}
	
	public static void testParalelo () {
		System.out.println("Test paralelo");
		System.out.println("Este test suma un rango de enteros pausando el hilo cada vez");
		System.out.println("Cargando...");
		
		long numero1 = System.currentTimeMillis();

		IntStream lista = IntStream.range(1, 10);
		int total = lista
				.parallel()
				.map(EjemploVelocidadParalelo::duplicar)
				.sum();

		long numero2 = System.currentTimeMillis();
		System.out.println("Test ejecutado correctamente, resultados:");
		System.out.println("Tiempo de ejecución: "+ (numero2 - numero1));
		System.out.println("Resultado suma realizada: "+total);
		
	}

	public static int duplicar(int numero) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return numero * 2;
	}

}
