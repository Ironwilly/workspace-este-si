package ejercicio01;




import java.io.IOException;

import com.csvreader.CsvWriter;

import java.lang.Object;


/**
 * 
 * @author Guillermo Ferrari
 * @version 1.0  - 13/04/2021 
 *
 *
 */





public class EscritorCSV {

	private CsvWriter writer;
	private String rutaFichero;
	
	public EscritorCSV(String ruta){
		rutaFichero = ruta;
		try{
			//abro el fichero
			writer = new CsvWriter(ruta);
			writer.setDelimiter(';');
			
			//establezco las cabeceras
			writer.write("Num Cuenta");
			writer.write("DNI");
			writer.write("Primer apellido");
			writer.write("Segundo apellido");
			writer.write("Nombre");
			writer.write("Saldo");
			writer.write("PIN");
			writer.endRecord();
		}catch(IOException e){
			System.out.println("Error abriendo el fichero: " + ruta);
			e.printStackTrace();
		}
		
	}
	
	public void escribirRegistro(Cuenta cuenta){
		try{
			writer.write(cuenta.getNumCuenta());
			writer.write(cuenta.getDni());
			writer.write(cuenta.getApellido1());
			writer.write(cuenta.getApellido2());
			writer.write(cuenta.getNombre());
			writer.write(cuenta.getSaldo());
			writer.write(cuenta.getPin());
			writer.endRecord();
		}catch(IOException e){
			System.out.println("Error leyendo el fichero: " + rutaFichero);
			e.printStackTrace();
		}		
		
	}
	
	public void cerrarFichero(){
		writer.close();
	}
	
}

	
	

