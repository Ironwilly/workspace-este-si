
package Proyecto1;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// **********************************************************
		// **********************************************************
		// ****Proyecto Tema 2 ---->> THE VENDING MACHINE PROJECT****
		// ****Autor: Guillermo Ferrari Ferrari**********************
		// ****1er curso DAM (2º grupo)******************************
		// **********************************************************
		// **********************************************************
		// Tomar decisiones teniendo en cuenta las acciones del******
		// usuario.(usando condicionales,repitiendo parte del********
		// programa(bucles),usando menús y submenús)*****************
		// Generar y usar numeros aleatorios*************************
		// Arrays (unidimensionales)*********************************
		// **********************************************************

		int[] posiciones;
		int tam = 1;
		int desde = 1, hasta = 4;
		int menu1 = 0, menu2 = 0, menu3 = 0, menu4, menu5, cantidad = 0;
		double cokeC = 0.00, naranC = 0.00, limonC = 0.00, spriteC = 0.00, cafeC = 0.00, patatasC = 0.00,
				galletasC = 0.00, bocadilloC = 0.00;
		double hamburguesaC = 0.00, sandwichC = 0.00, chocolateC = 0.00;
		double saldo = 0.00, saldoTotal = 0.00,saldoTotal2=0.00, retirada = 0.00, bebidas = 1.00, cafe = 0.90, patatas = 1.5,
				galletas = 2.00;
		double bocadillo = 2.00, hamburguesa = 3.50, sandwich = 2.75, chocolate = 1.25;
		Random r;

		r = new Random(System.nanoTime());

		do {

			System.out.println("\n       sMNNNNNNNNNNNNNNNNNNNNNNNNNmNNNNNNNh       \r\n"
					+ "       sMNNNmNmmNNNmmNmdmmmNNmmNNNmNNNNNNNh       \r\n"
					+ "       sMNNNyyhsNhsyydy///oNyyyhMNmNN---::s       \r\n"
					+ "       yMNNNssyyNdysom+:::/mysssNmmNN/--::s       \r\n"
					+ "       yMNm                           +/+oy                 Opciones         \r\n"
					+ "       yMNmThe vending machine project+//+s       ***************************\r\n"
					+ "       yMNm                           +/:os       ** 1 -> Ingresar saldo   **\r\n"
					+ "       sMNmN+ossMdosoNdooshMo//+MmmNNmyyyys       ** 2 -> Ver saldo        **\r\n"
					+ "       sMNmhssshdyyoymsooohmhmddNmmNNmssoos       ** 3 -> Comprar          **\r\n"
					+ "       sMNmM  mmN  MMN  mMM  MNdmmmNNmsysss       ** 4 -> Retirar saldo    **\r\n"
					+ "       sMNmN  ssh  hsh  +/:  ydommmNNNyyyyy       ** 0 -> Salir            **\r\n"
					+ "       sMNmd  ydm  yod  y+o  hh+NmmNNNyo+yy       ***************************\r\n"
					+ "       sMNmhsdhdhohysysy+/+soyysmmmNNNy++yy       \r\n"
					+ "       sMNmNMNMMMNMNNNNNNNNNNNNmMmmNNNdhhdy       \r\n"
					+ "       sydmm  mNd  Nhy  sdm  NhhdmmNMNhdmmy       \r\n"
					+ "       y-smM  ymh  mhh  ym+  NssyNmMMMNNNNh       \r\n"
					+ "       yNmmN  mNN  NmN  dNN  NNmNmNMMMNNNNh       \r\n"
					+ "       yMNmmMNNNdmNNhmmymNdmNmdhNmNMMMMMMMd       \r\n"
					+ "       yMNNNdyymhdNhsymsdmsohmyydmNMMMMMMMd       \r\n"
					+ "       yMNNMhshNy            moodNNMMMMMMMd       \r\n"
					+ "       yMNNNNNNNN            NmmNNNMMMMMMMd       \r\n"
					+ "       hMNNMMMMMMMMMMMMMMMMMMMMMMNNMMMMMMMm       \r\n"
					+ "       hMNMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMm       \r\n"
					+ "       hMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMm       \r\n"
					+ "       hMMMM                    MMNMMMMNMNm       \r\n"
					+ "       hMMMM                    MMMMMMMNMNm       \r\n"
					+ "       hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm       \r\n"
					+ "       hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm       \r\n"
					+ "       dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm       \r\n"
					+ "       dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm       \r\n"
					+ "       oMMMdyyyyyyyyyyyyyyyyyyyyyysysshMMMm       \r\n"
					+ "       .MMN`                           /NMm       \r\n"
					+ "       `++-                             :dy       \r\n"
					+ "                                                        ");

			System.out.println("Elija una opción: ");
			menu1 = Leer.datoInt();
			if ((saldoTotal < cafe) && (menu1 == 3)) {

				System.out.println("\nNo tienes saldo para comprar nada, haz una recarga antes\n\n");
			} else {
				switch (menu1) {
				case 1:
					System.out.println("             _.oood\"\"\"\"\"\"\"booo._\r\n"
							+ "         _.o\"\"      _____    * \"\"o._\r\n"
							+ "       oP\"  _.ooo\"\"\"\"   \"\"\"\"o|o*_* \"Yo\r\n"
							+ "     o8   oP  _.-\":          | |\"._* `8o\r\n"
							+ "    d'  o8',-\"    :          | |/  ,\\* `b\r\n"
							+ "   d'  d.-\"      :           | |: (( `\\\r\n"
							+ "  8'  d' \"\"\"\"\":  :           | |  ||\\_/* `8\r\n"
							+ " 8   8'      :  :       |)   _ |  || |`|   8\r\n"
							+ ",8  8        :  :     /)| \\ || |\\_|| | |8  8.\r\n"
							+ "8' ,8       :  :      \" /_) |`:' | | | |8. `8\r\n"
							+ "8  8'       :  :        _ _='  \\ ' __   __  8\r\n"
							+ "8  8       :  :         \\|__ |  | |  | | 8| 8\r\n"
							+ "8  8.      :  :         ||   |  | |-:' | 8| 8\r\n"
							+ "8. `8     /   |      __/ |__ |__| |  \\ |__|,8\r\n"
							+ "`8  8   .'    \\     /     __ . . . . . .8LL8'\r\n"
							+ " 8   8.'       `-. (    ,'  `.`. | | ,-|8  8\r\n"
							+ "  8.(__________dd_) \\__/ '  0|`.`: |: (8 ,8\r\n"
							+ "   Y.  Y.                    | :/| |,\\|* .P\r\n"
							+ "    Y.  \"8.          .,o     | | |,|\"*  ,P\r\n"
							+ "     \"8.  \"Yo_               | |p|\"* ,8\"\r\n"
							+ "       \"Y_   `\"ooo.__   __.oo|\"* * _P\"\r\n"
							+ "         `'\"oo_     \"\"\"\"\"    * _oo\"\"'\r\n"
							+ "              `\"\"\"boooooood\"\"\"'\r\n" + "                        ");
					System.out.println("\n¿Cuánto saldo desea ingresar?\n");
					saldo = Leer.datoDouble();
					saldoTotal = saldoTotal + saldo;
					saldoTotal2=saldoTotal2 + saldo;
					System.out.println("\nTienes " + saldoTotal + " euros de saldo\n\n");
					break;
				case 2:
					System.out.println("             _.oood\"\"\"\"\"\"\"booo._\r\n"
							+ "         _.o\"\"      _____    * \"\"o._\r\n"
							+ "       oP\"  _.ooo\"\"\"\"   \"\"\"\"o|o*_* \"Yo\r\n"
							+ "     o8   oP  _.-\":          | |\"._* `8o\r\n"
							+ "    d'  o8',-\"    :          | |/  ,\\* `b\r\n"
							+ "   d'  d.-\"      :           | |: (( `\\\r\n"
							+ "  8'  d' \"\"\"\"\":  :           | |  ||\\_/* `8\r\n"
							+ " 8   8'      :  :       |)   _ |  || |`|   8\r\n"
							+ ",8  8        :  :     /)| \\ || |\\_|| | |8  8.\r\n"
							+ "8' ,8       :  :      \" /_) |`:' | | | |8. `8\r\n"
							+ "8  8'       :  :        _ _='  \\ ' __   __  8\r\n"
							+ "8  8       :  :         \\|__ |  | |  | | 8| 8\r\n"
							+ "8  8.      :  :         ||   |  | |-:' | 8| 8\r\n"
							+ "8. `8     /   |      __/ |__ |__| |  \\ |__|,8\r\n"
							+ "`8  8   .'    \\     /     __ . . . . . .8LL8'\r\n"
							+ " 8   8.'       `-. (    ,'  `.`. | | ,-|8  8\r\n"
							+ "  8.(__________dd_) \\__/ '  0|`.`: |: (8 ,8\r\n"
							+ "   Y.  Y.                    | :/| |,\\|* .P\r\n"
							+ "    Y.  \"8.          .,o     | | |,|\"*  ,P\r\n"
							+ "     \"8.  \"Yo_               | |p|\"* ,8\"\r\n"
							+ "       \"Y_   `\"ooo.__   __.oo|\"* * _P\"\r\n"
							+ "         `'\"oo_     \"\"\"\"\"    * _oo\"\"'\r\n"
							+ "              `\"\"\"boooooood\"\"\"'\r\n" + "                        ");
					System.out.printf("\nSu saldo es de %.2f euros\n", saldoTotal);
					break;
				case 3:
					System.out.println("\r\n" + "       ***************************\r\n"
							+ "       ** 1 -> Bebidas          **\r\n" + "       ** 2 -> Cafe  0,90€      **\r\n"
							+ "       ** 3 -> Snack            **\r\n" + "       ** 4 -> Comidas          **\r\n"
							+ "       ** 0 -> Salir            **\r\n" + "       ***************************");
					System.out.println("\nElija una opción: \n");
					menu2 = Leer.datoInt();
					switch (menu2) {
					case 1:

						System.out.println("\r\n" + "       ***************************\r\n"
								+ "       ** 1 -> Cocacola 1€      **\r\n" + "       ** 2 -> Fanta Naranja 1€ **\r\n"
								+ "       ** 3 -> Fanta Limón 1€   **\r\n" + "       ** 4 -> Sprite 1€        **\r\n"
								+ "       ** 5 -> Aleatorio 1€     **\r\n" + "       ** 0 -> Salir            **\r\n"
								+ "       ***************************");
						System.out.println("\nElija una opción: \n");
						menu3 = Leer.datoInt();
						switch (menu3) {
						case 1:

							System.out.println("\n¿Cuántas cocacolas quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * bebidas)) {

								System.out
										.println("\nNo tienes saldo para comprar cocacola, haz una recarga antes\n\n");

							} else {

								System.out.println("\n                     :+//+oo+`                    \r\n"
										+ "                     ::--.-:o`                    \r\n"
										+ "                     `      .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                    `.``````.`                    \r\n"
										+ "                    yy/-//+ooh`                   \r\n"
										+ "                   oNh++soshhmh                   \r\n"
										+ "                  /NNyysdyydhmNs                  \r\n"
										+ "                 .NNhhsymhhddmNM/                 \r\n"
										+ "                 hNmhhshmhdmmdmNm                 \r\n"
										+ "                 mNmdhydddhhNddmN.                \r\n"
										+ "                 mdmysshdhhhddymN`                \r\n"
										+ "                 Nysosydmdyssh+oN-                \r\n"
										+ "                `N++:+:/y/shhh/sN:                \r\n"
										+ "                -dos+::ys+y/y::+M+                \r\n"
										+ "                +NddyoyNNmNNNmdmMy                \r\n"
										+ "                +NNmNyhNNNNmNNmNMy                \r\n"
										+ "                -NNmmyymmNNmNmmmM+                \r\n"
										+ "                 NNmmyomdNmdmddNM.                \r\n"
										+ "                 hNmdy+ddNmddhhNN                 \r\n"
										+ "                 oNmhh+ddNmdhyhNy                 \r\n"
										+ "                 :NNhd+ddNmdyshmo                 \r\n"
										+ "                 sNmyh+hdmmmdsddh                 \r\n"
										+ "                .NNmhd/hmddNNymdN/                \r\n"
										+ "                oNNNmhsmNNNMMmddmh                \r\n"
										+ "                sNMMmddMMNMMMMNmNh                \r\n"
										+ "                :NNNNNNNNmmNNmmmm+                \r\n"
										+ "                `+oo/:///:///-.-/`   \n");
								System.out.println("\n            ¡Disfruta de tu cocacola!\n\n");
								saldoTotal = saldoTotal - (cantidad * bebidas);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								cokeC = cokeC + cantidad;

							}
							break;
						case 2:
							System.out.println("\n¿Cuántas fantas naranja quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * bebidas)) {

								System.out.println(
										"\nNo tienes saldo para comprar fanta naranja, haz una recarga antes\n\n");

							} else {

								System.out.println("\n                     :+//+oo+`                    \r\n"
										+ "                     ::--.-:o`                    \r\n"
										+ "                     `      .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                    `.``````.`                    \r\n"
										+ "                    yy/-//+ooh`                   \r\n"
										+ "                   oNh++soshhmh                   \r\n"
										+ "                  /NNyysdyydhmNs                  \r\n"
										+ "                 .NNhhsymhhddmNM/                 \r\n"
										+ "                 hNmhhshmhdmmdmNm                 \r\n"
										+ "                 mNmdhydddhhNddmN.                \r\n"
										+ "                 mdmysshdhhhddymN`                \r\n"
										+ "                 Nysosydmdyssh+oN-                \r\n"
										+ "                `N++:+:/y/shhh/sN:                \r\n"
										+ "                -dos+::ys+y/y::+M+                \r\n"
										+ "                +NddyoyNNmNNNmdmMy                \r\n"
										+ "                +NNmNyhNNNNmNNmNMy                \r\n"
										+ "                -NNmmyymmNNmNmmmM+                \r\n"
										+ "                 NNmmyomdNmdmddNM.                \r\n"
										+ "                 hNmdy+ddNmddhhNN                 \r\n"
										+ "                 oNmhh+ddNmdhyhNy                 \r\n"
										+ "                 :NNhd+ddNmdyshmo                 \r\n"
										+ "                 sNmyh+hdmmmdsddh                 \r\n"
										+ "                .NNmhd/hmddNNymdN/                \r\n"
										+ "                oNNNmhsmNNNMMmddmh                \r\n"
										+ "                sNMMmddMMNMMMMNmNh                \r\n"
										+ "                :NNNNNNNNmmNNmmmm+                \r\n"
										+ "                `+oo/:///:///-.-/`   \n");
								System.out.println("\n            ¡Disfruta de tu fanta naranja!\n\n");
								saldoTotal = saldoTotal - (cantidad * bebidas);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								naranC = naranC + cantidad;
							}
							break;
						case 3:

							System.out.println("\n¿Cuántas fantas limón quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * bebidas)) {

								System.out.println(
										"\nNo tienes saldo para comprar fanta limón, haz una recarga antes\n\n");

							} else {

								System.out.println("\n                     :+//+oo+`                    \r\n"
										+ "                     ::--.-:o`                    \r\n"
										+ "                     `      .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                    `.``````.`                    \r\n"
										+ "                    yy/-//+ooh`                   \r\n"
										+ "                   oNh++soshhmh                   \r\n"
										+ "                  /NNyysdyydhmNs                  \r\n"
										+ "                 .NNhhsymhhddmNM/                 \r\n"
										+ "                 hNmhhshmhdmmdmNm                 \r\n"
										+ "                 mNmdhydddhhNddmN.                \r\n"
										+ "                 mdmysshdhhhddymN`                \r\n"
										+ "                 Nysosydmdyssh+oN-                \r\n"
										+ "                `N++:+:/y/shhh/sN:                \r\n"
										+ "                -dos+::ys+y/y::+M+                \r\n"
										+ "                +NddyoyNNmNNNmdmMy                \r\n"
										+ "                +NNmNyhNNNNmNNmNMy                \r\n"
										+ "                -NNmmyymmNNmNmmmM+                \r\n"
										+ "                 NNmmyomdNmdmddNM.                \r\n"
										+ "                 hNmdy+ddNmddhhNN                 \r\n"
										+ "                 oNmhh+ddNmdhyhNy                 \r\n"
										+ "                 :NNhd+ddNmdyshmo                 \r\n"
										+ "                 sNmyh+hdmmmdsddh                 \r\n"
										+ "                .NNmhd/hmddNNymdN/                \r\n"
										+ "                oNNNmhsmNNNMMmddmh                \r\n"
										+ "                sNMMmddMMNMMMMNmNh                \r\n"
										+ "                :NNNNNNNNmmNNmmmm+                \r\n"
										+ "                `+oo/:///:///-.-/`   \n");
								System.out.println("\n            ¡Disfruta de tu fanta limón!\n\n");
								saldoTotal = saldoTotal - (cantidad * bebidas);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								limonC = limonC + cantidad;

							}
							break;
						case 4:

							System.out.println("\n¿Cuántos sprites quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * bebidas)) {

								System.out.println("\nNo tienes saldo para comprar sprite, haz una recarga antes\n\n");

							} else {

								System.out.println("\n                     :+//+oo+`                    \r\n"
										+ "                     ::--.-:o`                    \r\n"
										+ "                     `      .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                     ``     .                     \r\n"
										+ "                    `.``````.`                    \r\n"
										+ "                    yy/-//+ooh`                   \r\n"
										+ "                   oNh++soshhmh                   \r\n"
										+ "                  /NNyysdyydhmNs                  \r\n"
										+ "                 .NNhhsymhhddmNM/                 \r\n"
										+ "                 hNmhhshmhdmmdmNm                 \r\n"
										+ "                 mNmdhydddhhNddmN.                \r\n"
										+ "                 mdmysshdhhhddymN`                \r\n"
										+ "                 Nysosydmdyssh+oN-                \r\n"
										+ "                `N++:+:/y/shhh/sN:                \r\n"
										+ "                -dos+::ys+y/y::+M+                \r\n"
										+ "                +NddyoyNNmNNNmdmMy                \r\n"
										+ "                +NNmNyhNNNNmNNmNMy                \r\n"
										+ "                -NNmmyymmNNmNmmmM+                \r\n"
										+ "                 NNmmyomdNmdmddNM.                \r\n"
										+ "                 hNmdy+ddNmddhhNN                 \r\n"
										+ "                 oNmhh+ddNmdhyhNy                 \r\n"
										+ "                 :NNhd+ddNmdyshmo                 \r\n"
										+ "                 sNmyh+hdmmmdsddh                 \r\n"
										+ "                .NNmhd/hmddNNymdN/                \r\n"
										+ "                oNNNmhsmNNNMMmddmh                \r\n"
										+ "                sNMMmddMMNMMMMNmNh                \r\n"
										+ "                :NNNNNNNNmmNNmmmm+                \r\n"
										+ "                `+oo/:///:///-.-/`   \n");
								System.out.println("\n            ¡Disfruta de tu sprite!\n\n");
								saldoTotal = saldoTotal - (cantidad * bebidas);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								spriteC = spriteC + cantidad;
							}
							break;
						case 5:
							posiciones = new int[tam];
							for (int i = 0; i < posiciones.length; i++) {

								posiciones[i] = r.nextInt(hasta - desde + 1) + desde;

							}

							for (int i = 0; i < posiciones.length; i++) {

								if (posiciones[i] == 1) {

									System.out.println("\n                     :+//+oo+`                    \r\n"
											+ "                     ::--.-:o`                    \r\n"
											+ "                     `      .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                    `.``````.`                    \r\n"
											+ "                    yy/-//+ooh`                   \r\n"
											+ "                   oNh++soshhmh                   \r\n"
											+ "                  /NNyysdyydhmNs                  \r\n"
											+ "                 .NNhhsymhhddmNM/                 \r\n"
											+ "                 hNmhhshmhdmmdmNm                 \r\n"
											+ "                 mNmdhydddhhNddmN.                \r\n"
											+ "                 mdmysshdhhhddymN`                \r\n"
											+ "                 Nysosydmdyssh+oN-                \r\n"
											+ "                `N++:+:/y/shhh/sN:                \r\n"
											+ "                -dos+::ys+y/y::+M+                \r\n"
											+ "                +NddyoyNNmNNNmdmMy                \r\n"
											+ "                +NNmNyhNNNNmNNmNMy                \r\n"
											+ "                -NNmmyymmNNmNmmmM+                \r\n"
											+ "                 NNmmyomdNmdmddNM.                \r\n"
											+ "                 hNmdy+ddNmddhhNN                 \r\n"
											+ "                 oNmhh+ddNmdhyhNy                 \r\n"
											+ "                 :NNhd+ddNmdyshmo                 \r\n"
											+ "                 sNmyh+hdmmmdsddh                 \r\n"
											+ "                .NNmhd/hmddNNymdN/                \r\n"
											+ "                oNNNmhsmNNNMMmddmh                \r\n"
											+ "                sNMMmddMMNMMMMNmNh                \r\n"
											+ "                :NNNNNNNNmmNNmmmm+                \r\n"
											+ "                `+oo/:///:///-.-/`   \n");
									System.out.println("\n            ¡Disfruta de tu cocacola!\n\n");
									saldoTotal = saldoTotal - bebidas;
									System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
									cokeC = cokeC + bebidas;

								}
								if (posiciones[i] == 2) {

									System.out.println("\n                     :+//+oo+`                    \r\n"
											+ "                     ::--.-:o`                    \r\n"
											+ "                     `      .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                    `.``````.`                    \r\n"
											+ "                    yy/-//+ooh`                   \r\n"
											+ "                   oNh++soshhmh                   \r\n"
											+ "                  /NNyysdyydhmNs                  \r\n"
											+ "                 .NNhhsymhhddmNM/                 \r\n"
											+ "                 hNmhhshmhdmmdmNm                 \r\n"
											+ "                 mNmdhydddhhNddmN.                \r\n"
											+ "                 mdmysshdhhhddymN`                \r\n"
											+ "                 Nysosydmdyssh+oN-                \r\n"
											+ "                `N++:+:/y/shhh/sN:                \r\n"
											+ "                -dos+::ys+y/y::+M+                \r\n"
											+ "                +NddyoyNNmNNNmdmMy                \r\n"
											+ "                +NNmNyhNNNNmNNmNMy                \r\n"
											+ "                -NNmmyymmNNmNmmmM+                \r\n"
											+ "                 NNmmyomdNmdmddNM.                \r\n"
											+ "                 hNmdy+ddNmddhhNN                 \r\n"
											+ "                 oNmhh+ddNmdhyhNy                 \r\n"
											+ "                 :NNhd+ddNmdyshmo                 \r\n"
											+ "                 sNmyh+hdmmmdsddh                 \r\n"
											+ "                .NNmhd/hmddNNymdN/                \r\n"
											+ "                oNNNmhsmNNNMMmddmh                \r\n"
											+ "                sNMMmddMMNMMMMNmNh                \r\n"
											+ "                :NNNNNNNNmmNNmmmm+                \r\n"
											+ "                `+oo/:///:///-.-/`   \n");
									System.out.println("\n            ¡Disfruta de tu Fanta Naranja!\n\n");
									saldoTotal = saldoTotal - bebidas;
									System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
									naranC = naranC + bebidas;

								}
								if (posiciones[i] == 3) {

									System.out.println("\n                     :+//+oo+`                    \r\n"
											+ "                     ::--.-:o`                    \r\n"
											+ "                     `      .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                    `.``````.`                    \r\n"
											+ "                    yy/-//+ooh`                   \r\n"
											+ "                   oNh++soshhmh                   \r\n"
											+ "                  /NNyysdyydhmNs                  \r\n"
											+ "                 .NNhhsymhhddmNM/                 \r\n"
											+ "                 hNmhhshmhdmmdmNm                 \r\n"
											+ "                 mNmdhydddhhNddmN.                \r\n"
											+ "                 mdmysshdhhhddymN`                \r\n"
											+ "                 Nysosydmdyssh+oN-                \r\n"
											+ "                `N++:+:/y/shhh/sN:                \r\n"
											+ "                -dos+::ys+y/y::+M+                \r\n"
											+ "                +NddyoyNNmNNNmdmMy                \r\n"
											+ "                +NNmNyhNNNNmNNmNMy                \r\n"
											+ "                -NNmmyymmNNmNmmmM+                \r\n"
											+ "                 NNmmyomdNmdmddNM.                \r\n"
											+ "                 hNmdy+ddNmddhhNN                 \r\n"
											+ "                 oNmhh+ddNmdhyhNy                 \r\n"
											+ "                 :NNhd+ddNmdyshmo                 \r\n"
											+ "                 sNmyh+hdmmmdsddh                 \r\n"
											+ "                .NNmhd/hmddNNymdN/                \r\n"
											+ "                oNNNmhsmNNNMMmddmh                \r\n"
											+ "                sNMMmddMMNMMMMNmNh                \r\n"
											+ "                :NNNNNNNNmmNNmmmm+                \r\n"
											+ "                `+oo/:///:///-.-/`   \n");
									System.out.println("\n            ¡Disfruta de tu Fanta Limón!\n\n");
									saldoTotal = saldoTotal - bebidas;
									System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
									limonC = limonC + bebidas;

								}
								if (posiciones[i] == 4) {

									System.out.println("\n                     :+//+oo+`                    \r\n"
											+ "                     ::--.-:o`                    \r\n"
											+ "                     `      .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                     ``     .                     \r\n"
											+ "                    `.``````.`                    \r\n"
											+ "                    yy/-//+ooh`                   \r\n"
											+ "                   oNh++soshhmh                   \r\n"
											+ "                  /NNyysdyydhmNs                  \r\n"
											+ "                 .NNhhsymhhddmNM/                 \r\n"
											+ "                 hNmhhshmhdmmdmNm                 \r\n"
											+ "                 mNmdhydddhhNddmN.                \r\n"
											+ "                 mdmysshdhhhddymN`                \r\n"
											+ "                 Nysosydmdyssh+oN-                \r\n"
											+ "                `N++:+:/y/shhh/sN:                \r\n"
											+ "                -dos+::ys+y/y::+M+                \r\n"
											+ "                +NddyoyNNmNNNmdmMy                \r\n"
											+ "                +NNmNyhNNNNmNNmNMy                \r\n"
											+ "                -NNmmyymmNNmNmmmM+                \r\n"
											+ "                 NNmmyomdNmdmddNM.                \r\n"
											+ "                 hNmdy+ddNmddhhNN                 \r\n"
											+ "                 oNmhh+ddNmdhyhNy                 \r\n"
											+ "                 :NNhd+ddNmdyshmo                 \r\n"
											+ "                 sNmyh+hdmmmdsddh                 \r\n"
											+ "                .NNmhd/hmddNNymdN/                \r\n"
											+ "                oNNNmhsmNNNMMmddmh                \r\n"
											+ "                sNMMmddMMNMMMMNmNh                \r\n"
											+ "                :NNNNNNNNmmNNmmmm+                \r\n"
											+ "                `+oo/:///:///-.-/`   \n");
									System.out.println("\n            ¡Disfruta de tu Sprite!\n\n");
									saldoTotal = saldoTotal - bebidas;
									System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
									spriteC = spriteC + bebidas;

								}

							}
							break;

						case 0:
							System.out.println("");
							break;
						default:
							System.out.println("\nOpción errónea, inténtelo de nuevo.\n\n");

						}
						break;
					case 2:
						System.out.println("\n¿Cuántos cafés quieres?\n");
						cantidad = Leer.datoInt();
						if (saldoTotal < (cantidad * cafe)) {

							System.out.println("\nNo tienes saldo para comprar café, haz una recarga antes\n\n");

						} else {
							System.out
									.println("\n                        (\r\n" + "                          )     (\r\n"
											+ "                   ___...(-------)-....___\r\n"
											+ "               .-\"\"       )    (          \"\"-.\r\n"
											+ "         .-'``'|-._             )         _.-|\r\n"
											+ "        /  .--.|   `\"\"---...........---\"\"`   |\r\n"
											+ "       /  /    |                             |\r\n"
											+ "       |  |    |                             |\r\n"
											+ "        \\  \\   |                             |\r\n"
											+ "         `\\ `\\ |                             |\r\n"
											+ "           `\\ `|                             |\r\n"
											+ "           _/ /\\                             /\r\n"
											+ "          (__/  \\                           /\r\n"
											+ "       _..---\"\"` \\                         /`\"\"---.._\r\n"
											+ "    .-'           \\                       /          '-.\r\n"
											+ "   :               `-.__             __.-'              :\r\n"
											+ "   :                  ) \"\"---...---\"\" (                 :\r\n"
											+ "    '._               `\"--...___...--\"`              _.'\r\n"
											+ "      \\\"\"--..__                              __..--\"\"/\r\n"
											+ "       '._     \"\"\"----.....______.....----\"\"\"     _.'\r\n"
											+ "          `\"\"--..,,_____            _____,,..--\"\"`\r\n"
											+ "                        `\"\"\"----\"\"\"`\n");
							System.out.println("\n       ¡Disfruta de tu café!\n");
							saldoTotal = saldoTotal - (cantidad * cafe);
							System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
							cafeC = cafeC + cantidad;
						}
						break;
					case 3:
						System.out.println("\n       ***************************\r\n"
								+ "       ** 1 -> Patatas 1,5€     **\r\n" + "       ** 2 -> Galletas 2€      **\r\n"
								+ "       ** 3 -> Chocolate 1.25€  **\r\n" + "       ** 0 -> Salir            **\r\n"
								+ "       ***************************\n");
						System.out.println("\nElija una opción: \n");
						menu4 = Leer.datoInt();
						switch (menu4) {
						case 1:
							System.out.println("\n¿Cuántas bolsas de patatas quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * patatas)) {

								System.out.println("\nNo tienes saldo para comprar patatas, haz una recarga antes\n\n");

							} else {
								System.out.println("\n/oooooo+//-..-::/+++oooo/\r\n" + "-oosso/-`````````.-:+oos:\r\n"
										+ "`oos+:+.:++//:----/::osy`\r\n" + " .oo-ys /-+`o`o`/-/y-/s/ \r\n"
										+ "  o+.h:./-/.+.--+//y:+y` \r\n" + "  os:o/-----::`+o+//-oy. \r\n"
										+ "  os+:.......-::-.-+osh- \r\n" + "  osso+:-......--+osssy. \r\n"
										+ "  +ossssssssosssssssssy` \r\n" + "  oosyyyyyyyyyyyyyyyssh` \r\n"
										+ "  oso+/::/ossssyssssssh. \r\n" + "  ss+/:--`-:/:+++++osyh. \r\n"
										+ "  syss+oooo/:----::/ohh. \r\n" + "  syyhyhy++/..--::/ooyy. \r\n"
										+ "  +sssoys+:::..--:/sssy. \r\n" + " .ssysssy///++osssssssys \r\n"
										+ " +s/hsoo+++ysssssssssssy-\r\n" + ".oosdydsy/ohhhhhhhyyyyso+\r\n"
										+ "+ssssssssssoooosssssssss+\n");
								System.out.println("\n       ¡Disfruta de tus patatas!\n");
								saldoTotal = saldoTotal - (cantidad * patatas);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								patatasC = patatasC + cantidad;
							}
							break;
						case 2:
							System.out.println("\n¿Cuántos paquetes de galletas quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * galletas)) {

								System.out
										.println("\nNo tienes saldo para comprar galletas, haz una recarga antes\n\n");

							} else {
								System.out.println("\n             .---------------------------.\r\n"
										+ "            /_   _   _         __  __   /|\r\n"
										+ "           // \\ / \\ / \\ |_/ | |_  (_   / |\r\n"
										+ "          / \\_  \\_/ \\_/ | \\ | |__ ,_/ /  |\r\n"
										+ "         :.__________________________/   /\r\n"
										+ "         |  .--. .--.   .--.   .--.  |  /\r\n"
										+ "         | (    )    ) (    ) (    ) | /\r\n"
										+ "         |  '--' '--'   '--'   '--'  |/\r\n"
										+ "         '---------------------------' \n");
								System.out.println("\n       ¡Disfruta de tus galletas!\n\n");
								saldoTotal = saldoTotal - (cantidad * galletas);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								galletasC = galletasC + cantidad;

							}
							break;
						case 3:
							System.out.println("\n¿Cuántas tabletas de chocolate quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * chocolate)) {

								System.out
										.println("\nNo tienes saldo para comprar chocolate, haz una recarga antes\n\n");

							} else {
								System.out.println("\n  ___  ___  ___  ___  ___.---------------.\r\n"
										+ ".'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\\r\n"
										+ "|\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\\r\n"
										+ " \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\\r\n"
										+ "  \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\\r\n"
										+ "   \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`\r\n"
										+ "    \\\\/   \\/   \\/   \\/   \\/ :                 |\r\n"
										+ "     \\|______________________;________________|\n");
								System.out.println("\n       ¡Disfruta de tu tableta chocolate!\n\n");
								saldoTotal = saldoTotal - (cantidad * chocolate);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								chocolateC = chocolateC + cantidad;
							}
							break;

						case 0:
							System.out.println(" ");
							break;
						default:
							System.out.println("\nOpción errónea, inténtelo de nuevo.\n\n");

						}
						break;

					case 4:

						System.out.println("\n       ****************************\r\n"
								+ "       ** 1 -> Bocadillos  2€    **\r\n" + "       ** 2 -> Hamburguesas 3.5€ **\r\n"
								+ "       ** 3 -> Sandwich 2.75€    **\r\n" + "       ** 0 -> Salir             **\r\n"
								+ "       ****************************\n");
						System.out.println("\nElija una opción: \n");
						menu5 = Leer.datoInt();
						switch (menu5) {
						case 1:
							System.out.println("\n¿Cuántos bocadillos quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * bocadillo)) {

								System.out
										.println("\nNo tienes saldo para comprar bocadillo, haz una recarga antes\n\n");

							} else {

								System.out.println("\r\n"
										+ "                                                                                \r\n"
										+ "                                                                                \r\n"
										+ "                                                  ```.....--...``               \r\n"
										+ "                                             ``.......```````````````           \r\n"
										+ "                                         ```...`````````````````````````        \r\n"
										+ "                               `````````````````````````````````````````        \r\n"
										+ "                       ````...................`````````````````````.-:-.`       \r\n"
										+ "                  ```..------...................`````````    `..-//::---..      \r\n"
										+ "                `.............................````  `````..--:/++//::---.`      \r\n"
										+ "              .-....````````````..``````````````.--://++++//:::---......        \r\n"
										+ "            `.....``````````````````````````.:+soo//:----::+//::::....``        \r\n"
										+ "           `..`..```......````...--://:::///////:--//::---.-......-..``         \r\n"
										+ "          `.`.............-/++/+ssysyyyyso++/:----.-:---.....--...```           \r\n"
										+ "          ......---:/++o+//yhs/:+yyyyyyso+/::://:.````.----..```                \r\n"
										+ "          -/++/:::/:/+/:-.-oyo--:///:::-----.-.```.---..```                     \r\n"
										+ "          -:+sso+/:-------:++---//::----...```..--..```                         \r\n"
										+ "          -:://////+soo+//::---::..`...```..--..```                             \r\n"
										+ "          --::::::/++++/::----...````..----..``                                 \r\n"
										+ "          .-:::::::-----.....---:::::--..```                                    \r\n"
										+ "          ``--:::----::////////::--..```                                        \r\n"
										+ "           `.--:://////::--...`````                                             \r\n"
										+ "            ````...`````````                                                    \r\n");

								System.out.println("\n       ¡Disfruta de tu bocadillo!\n");
								saldoTotal = saldoTotal - (cantidad * bocadillo);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								bocadilloC = bocadilloC + cantidad;
							}
							break;

						case 2:
							System.out.println("\n¿Cuántas hamburguesas quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * hamburguesa)) {

								System.out.println(
										"\nNo tienes saldo para comprar hamburguesa, haz una recarga antes\n\n");

							} else {
								System.out.println("\r\n" + "          _..----.._       \r\n"
										+ "        .'     o    '.     \r\n" + "       /   o       o  \\    \r\n"
										+ "      |o        o     o|   \r\n" + "      /'-.._o     __.-'\\   \r\n"
										+ "      \\      `````     /   \r\n" + "      |``--........--'`|    \r\n"
										+ "       \\              /\r\n" + "        `'----------'`\n");
								System.out.println("\n       ¡Disfruta de tu hamburguesa!\n\n");
								saldoTotal = saldoTotal - (cantidad * hamburguesa);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								hamburguesaC = hamburguesaC + cantidad;
							}
							break;
						case 3:
							System.out.println("\n¿Cuántos sandwiches quieres?\n");
							cantidad = Leer.datoInt();
							if (saldoTotal < (cantidad * sandwich)) {

								System.out
										.println("\nNo tienes saldo para comprar sandwich, haz una recarga antes\n\n");

							} else {
								System.out.println(
										"\n                          ____\r\n" + "              .----------'    '-.\r\n"
												+ "             /  .      '     .   \\\\\r\n"
												+ "            /        '    .      /|\r\n"
												+ "           /      .             \\ /\r\n"
												+ "          /  ' .       .     .  || |\r\n"
												+ "         /.___________    '    / //\r\n"
												+ "         |._          '------'| /|\r\n"
												+ "         '.............______.-' /  \r\n"
												+ "         |-.                  | /\r\n"
												+ "         `\"\"\"\"\"\"\"\"\"\"\"\"\"-.....-'\n");

								System.out.println("\n       ¡Disfruta de tu sandwich!\n");
								saldoTotal = saldoTotal - (cantidad * sandwich);
								System.out.printf("\nSu saldo restante es: %.2f euros\n\n", saldoTotal);
								sandwichC = sandwichC + cantidad;
							}
							break;

						case 0:
							System.out.println(" ");
							break;
						default:
							System.out.println("\nOpción errónea, intentelo de nuevo.\n\n");
							break;

						}

						break;

					case 0:
						System.out.println(" ");
						break;
					default:
						System.out.println("\nOpción errónea, inténtelo de nuevo.\n\n");

					}
					break;
				case 4:
					System.out.println("\n                 _____\r\n" + "              .-'     `-. \r\n"
							+ "            .'  .-\"\"\"-.-'\r\n" + "           /  .'\r\n" + "      .---' '--------.\r\n"
							+ "       \"\"\":  :\"\"\"\"\"\"\"\r\n" + "    .-----'  '-----.\r\n"
							+ "     \"\"\"\"\"\\  \\\"\"\"\"\"\r\n" + "           \\  `.\r\n"
							+ "            '.  `-----.\r\n" + "              '-.____.'\r\n");

					System.out.printf("\nUsted ha retirado un total de %.2f euros. Gracias por su compra\n\n",
							saldoTotal);
					retirada = saldoTotal;
					saldoTotal = saldoTotal - saldoTotal;

					break;

				case 0:

					if (saldoTotal > 0) {

						System.out.println("\nEEHHH EHHH NO TE VAYAS TAN RÁPIDO,RETIRA PRIMERO TU DINERO.");
						System.out.println("\nEs muy fácil, solamente tienes que pulsar la opción 4.\n\n");

					} else {

						System.out.println("\n            / .- \r\n" + "           /.-'     |/,-'`\r\n"
								+ "    .--.  //     _.-'''-._\r\n" + "   //~`_\\//_  _.;.--._.--.;._\r\n"
								+ "   '--| // .|` /( O / \\ O )\\ `\r\n" + "      |~~~~~| ;  '-'   '-'  ;\r\n"
								+ "     _|__'  | |     (_)     |\r\n" + "    /  __) '| | .         . |\r\n"
								+ "    |  __)  | |  `-.___.-'  |     .-.  _\r\n"
								+ "    | ___)' | ;    \\.-./    ;     | | / |\r\n"
								+ "    |~~|   .|  \\    `-`    /    __| |/ /_\r\n"
								+ "    |  |====;___'._     _.'__  (_       _)\r\n"
								+ "    \\            /\\\"\"\"\"\"/\\   `\\  `|  .'`\r\n"
								+ "     '----------.`-`\\^/`-`.    \\  |~~|\r\n"
								+ "                |   /~\\   |`\\   \\ |  |\r\n"
								+ "                |   |\\|   |  \\   `y  |\r\n"
								+ "                |   |\\|   |   \\      /\r\n"
								+ "                |   |\\|   |    '.__.'\r\n" + "                |___|\\|___|\r\n"
								+ "                |===\\_/===|\r\n" + "                |         |\r\n"
								+ "                |    L    |   Muchas gracias por su compra.\r\n"
								+ "                |    |    |      ¡  Vuelva pronto !\r\n"
								+ "                |    |    |\r\n" + "                <    <    |\r\n"
								+ "                |    |    |\r\n" + "                |____|____|\r\n"
								+ "            .---'     /   \\\r\n" + "           /         /|    |\r\n"
								+ "           '.______.' |    |\r\n" + "                       \\__/");

						System.out.println("\n   ******************************** ");
						System.out.println("\n   ***   Resumen de su compra   *** ");
						System.out.println("\n   ******************************** ");
						if (cokeC >= 1) {
							System.out.printf("\n%.0f Cocacola  --------------> %.2f euros", cokeC, (bebidas * cokeC));
						}
						if (naranC >= 1) {
							System.out.printf("\n%.0f Fanta Naranja  ---------> %.2f euros", naranC,
									(bebidas * naranC));
						}
						if (limonC >= 1) {
							System.out.printf("\n%.0f Fanta Limón  -----------> %.2f euros", limonC,
									(bebidas * limonC));
						}
						if (spriteC >= 1) {
							System.out.printf("\n%.0f Sprite  ----------------> %.2f euros", spriteC,
									(bebidas * spriteC));
						}
						if (cafeC >= 1) {
							System.out.printf("\n%.0f Café  ------------------> %.2f euros", cafeC, (cafe * cafeC));
						}
						if (patatasC >= 1) {
							System.out.printf("\n%.0f Bolsa de patatas  ------> %.2f euros", patatasC,
									(patatas * patatasC));
						}
						if (galletasC >= 1) {
							System.out.printf("\n%.0f Paquete de galletas  ---> %.2f euros", galletasC,
									(galletas * galletasC));
						}
						if (chocolateC >= 1) {
							System.out.printf("\n%.0f Tableta de chocolate ---> %.2f euros", chocolateC,
									(chocolate * chocolateC));
						}
						if (bocadilloC >= 1) {
							System.out.printf("\n%.0f Bocadillo  -------------> %.2f euros", bocadilloC,
									(bocadillo * bocadilloC));
						}
						if (hamburguesaC >= 1) {
							System.out.printf("\n%.0f Hamburguesa  -----------> %.2f euros", hamburguesaC,
									(hamburguesa * hamburguesaC));
						}
						if (sandwichC >= 1) {
							System.out.printf("\n%.0f Sandwich  --------------> %.2f euros\n", sandwichC,
									(sandwich * sandwichC));
						}
						System.out.println("\n-------------------------------------------");
						System.out.println("El total de su compra es " + ((bebidas * cokeC) + (bebidas * naranC)
								+ (bebidas * limonC) + (bebidas * spriteC) + (cafe * cafeC) + (patatas * patatasC)
								+ (galletas * galletasC) + (chocolate * chocolateC) + (bocadillo * bocadilloC)
								+ (hamburguesa * hamburguesaC) + (sandwich * sandwichC) + " euros"));
						System.out.println("Usted ingresó un total de " + saldoTotal2 + " euros");
						System.out.println(
								"Después de la compra le quedo un saldo de " + retirada + " euros que ya fue retirado");

					}
					break;

				default:
					System.out.println("\nOpción errónea, inténtelo de nuevo.\n");
					break;

				}
			}
		} while (menu1 != 0 || saldoTotal > 0);
	}
}
