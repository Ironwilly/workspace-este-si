package utilidades;

import java.util.Random;

public class GenerarRandom {

	public static int generarRandom(int desde, int hasta) {
		int ale;
		Random r = new Random(System.nanoTime());
		ale = r.nextInt(hasta - desde + 1) + desde;

		return ale;
	}

}
