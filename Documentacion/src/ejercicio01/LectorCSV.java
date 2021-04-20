package ejercicio01;


	
	
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.HashMap;

import com.csvreader.CsvReader;

	public class LectorCSV {

		private CsvReader reader;
		private String rutaFichero;

		public LectorCSV(String ruta) {

			try {
				reader = new CsvReader(ruta);
				reader.setDelimiter(';');
				reader.readHeaders();

			} catch (FileNotFoundException e) {
				System.out.println("Error abriendo el fichero: " + ruta);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error abriendo el fichero: " + ruta);
				e.printStackTrace();
			}
		}

		public LectorCSV(String ruta, char delimiter) {
			try {
				reader = new CsvReader(ruta);
				reader.setDelimiter(delimiter);
				reader.readHeaders();

			} catch (FileNotFoundException e) {
				System.out.println("Error abriendo el fichero: " + ruta);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error abriendo el fichero: " + ruta);
				e.printStackTrace();
			}
		}

		public Cuenta leerCuenta() {
			Cuenta cuenta = null;

			try {
				if (reader.readRecord()) {
					String numCuenta = reader.get(0);
					String dni = reader.get(1);
					String apellido1 = reader.get(2);
					String apellido2 = reader.get(3);
					String nombre = reader.get(4);
					String saldo = reader.get(5);
					String pin = reader.get(6);

					cuenta = new Cuenta(numCuenta, dni, apellido1, apellido2,
							nombre, saldo, pin);
				}
			} catch (IOException e) {
				System.out.println("Error leyendo el fichero: " + rutaFichero);
				e.printStackTrace();
			}

			return cuenta;
		}

		public HashMap<String,Cuenta> leerTodasLasCuentas() {
			HashMap<String,Cuenta> listado = new HashMap<String,Cuenta>();

			Cuenta cuenta = null;
			do {
				cuenta = leerCuenta();
				if (cuenta != null)
					listado.put(cuenta.getNumCuenta(),cuenta);

			} while (cuenta != null);

			return listado;
		}

		public void cerrarFichero() {
			reader.close();
		}

	}

