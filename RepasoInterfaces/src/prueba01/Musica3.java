package prueba01;

public class Musica3 {
	
	 // No importa el tipo de Instrumento,
	 // seguirá funcionando debido a Polimorfismo:
	 static void afinar(Instrumento i) {
	// ...
	i.tocar();
	 }
	 static void afinarTodo(Instrumento[] e) {
	for(int i = 0; i<e.length; i++){
	 afinar(e[i]);
	 }


}
}