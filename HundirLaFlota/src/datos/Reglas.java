package datos;



	

	public class Reglas {

		private Reglas reglas;
		
		
		public Reglas() {
			super();
			this.reglas = reglas;
		}


	
			
			
			public void imprimirReglas() {
			System.out.println("\nReglas antes de empezar:\n\n"
					+ "Cada jugador cuenta con dos cuadrículas de 5x5,10x10 o 15x15.\n\n"
					+ "En una, debe colocar estratégicamente 4 barcos de diferentes tamaños en posiciones horizontal \n"
					+ "y vertical dejando siempre una cuadrícula en blanco entre barco y barco. Se pueden colocar en \n\n"
					+ "el borde de la cuadrícula.\n\n"
					+ "\t- 1/2/4 (depende del nivel de dificultad) barco de 4 cuadrados\n"
					+ "\t- 1/2/4 (depende del nivel de dificultad) barco de 3 cuadrados\n"
					+ "\t- 1/2/4 (depende del nivel de dificultad) barco de 2 cuadrados\n"
					+ "\t- 1/2/4 (depende del nivel de dificultad) barco de 1 cuadrado\n\n"
					+ "Nunca debes mostrar esta cuadrícula a tu oponente, si lo haces sabrá la posición de tus barcos.\n"
					+ "En la otra cuadrícula, se hirán marcando los disparos que realizas, una A si es agua y una \n"
					+ "X si es tocado. Así podrás saber qué cuadrículas quedan en blanco por disparar.\n\n\n"
					+ "Instrucciones durante la partida:\n\n"
					+ "El jugador 1 elije una coordenada (ejemplo D-5), el jugador 2 revisa su cuadrícula y hay tres \n"
					+ "posibilidades:\n\n"
					+ "\t1. Agua, si no hay ningún barco\n"
					+ "\t2. Tocado, si el disparo coincide con una parte de un barco\n"
					+ "\t3. Hundido, si es un barco de un solo cuadro o el último recuadro sin tocar de un barco tocado \n"
					+ "\tanteriormente.\n\n"
					+ "Si en el disparo da a un barco o  es agua dispara el otro jugador.\n\n"
					+ "Cuando un jugador hunde todos los barcos de su oponente gana la partida.");
			}
		}




