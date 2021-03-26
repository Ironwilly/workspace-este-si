package trianaSteam;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Los tiempos avanzan y van cambiando las tecnologías, por eso decidí cerrar mi
		 * antiguo videoclub de vhs, y abrir uno online más acorde a la actualidad.
		 * 
		 * TrianaSteam, es una plataforma de alquiler de videojuegos online, en la cual,
		 * un cliente puede alquilar videojuegos desde cualquier parte del mundo,
		 * teniendo en cuenta que el pago del alquiler, le da derecho a tener 1 día (sin
		 * referencia horaria, es decir, si alquila un martes, tiene que devolver un
		 * miercoles, sea la hora que sea) el videojuego alquilado. 
		 * 
		 * En caso de no entregar el juego pasado 1 dia, se le cobrara un recargo adicional de 3€ por
		 * cada dia de demora. 
		 * El primer día de cada mes hacemos una oferta de 2x1, la cual es posible consultar poniendo el mes en cuestion. El cliente también
		 * puede saber cuantos días quedan para que se haga una nueva oferta 2x1,
		 * simplemente poniendo el mes que quiere saber la oferta, y tomaria como fecha
		 * inicial la actual. 
		 * 
		 * La plataforma tambien tiene una promocion especial del 30%
		 * en los años que sean bisiesto, el cual el cliente podrá consultar si es
		 * bisiesto o no, y si tiene descuento simplemente poniendo el año que quiera
		 * consultar. 
		 * A parte de mostrarle si es bisiesto o no, y si tiene descuento o
		 * no, la plataforma automaticamente mostraria el periodo de tiempo que faltaría
		 * para ese año que se consulta (sea bisiesto o no). 
		 * Otra promoción que le damos a los clientes es que si alquila un videojuejo, y a las 3 semanas vuelve a
		 * alquilar otro, se le hace descuento de un 10%.
		 * 
		 */
		
		int menu1,menu2;
		double saldo,saldoTotal=0.00;
		double precio = 4.95;
		String zona;
		int year,mes,dia,year2,mes2,dia2;
		int cantidad = 1;
		int MarvelC = 0,PlantsC = 0,YakuzaC =0,CrashC =0,TerminatorC = 0,RedC = 0,ZeldaC =0,ForzaC =0,GodC =0,StarcraftC =0;
		int WitcherC = 0,UnchartedC =0,AstroC =0,BioshockC =0,DarkC =0,BatmanC =0;
		int RatchetC =0,ImmortalsC =0,FortniteC =0,ResidentC =0;
		
		

		
		
		
		Videojuego vj1 = new Videojuego ("Marvel's Avengers","Acción/Aventura","+16");
		Videojuego vj2 = new Videojuego ("Plants vs. Zombies: Battle for Neighborville","Shooter en tercera persona","+7");
		Videojuego vj3 = new Videojuego ("Yakuza 6: The Song of Life ", "Mundo Abierto","+18");
		Videojuego vj4 = new Videojuego ("Crash Bandicoot 4: It's About Time ","Plataformas","+7");
		Videojuego vj5 = new Videojuego ("Terminator: Resistance Enhanced","Shooter en primera persona","+16");
		Videojuego vj6 = new Videojuego ("Red Dead Redemption 2 ","Mundo Abierto","+18");
		Videojuego vj7 = new Videojuego ("The Legend of Zelda: Breath of the Wild","Acción/Aventura","+12");
		Videojuego vj8 = new Videojuego ("Forza Horizon 4","Coches","+16");
		Videojuego vj9 = new Videojuego ("God of War","Acción/Aventura","+18");
		Videojuego vj10 = new Videojuego ("StarCraft II: Wings of Liberty","Estrategia","+16");
		Videojuego vj11 = new Videojuego ("The Witcher 3: Wild Hunt","Mundo Abierto","+18");
		Videojuego vj12 = new Videojuego ("Uncharted 4: El Desenlace del Ladrón","Shooter en tercera persona","+16");
		Videojuego vj13 = new Videojuego ("Astro Bot Rescue Mission ","Plataformas","+7");
		Videojuego vj14 = new Videojuego ("BioShock Infinite","Shooter en primera persona","+18");
		Videojuego vj15 = new Videojuego ("Dark Souls III","Acción/Aventura","+16");
		Videojuego vj16 = new Videojuego ("Batman: Arkham City","Acción/Aventura","+16");
		Videojuego vj17 = new Videojuego ("Ratchet & Clank","Shooter en tercera persona","+7");
		Videojuego vj18 = new Videojuego ("Immortals Fenyx Rising","Mundo Abierto","+12");
		Videojuego vj19 = new Videojuego ("Fortnite Battle Royale","Battle Royale","+12");
		Videojuego vj20 = new Videojuego ("Resident Evil 7 ","Acción/Aventura","+18");
		
		
		
		
		Plataforma platf = new Plataforma(new ArrayList<Videojuego>());
		
		platf.agregarVideojuego(vj1);
		platf.agregarVideojuego(vj2);
		platf.agregarVideojuego(vj3);
		platf.agregarVideojuego(vj4);
		platf.agregarVideojuego(vj5);
		platf.agregarVideojuego(vj6);
		platf.agregarVideojuego(vj7);
		platf.agregarVideojuego(vj8);
		platf.agregarVideojuego(vj9);
		platf.agregarVideojuego(vj10);
		platf.agregarVideojuego(vj11);
		platf.agregarVideojuego(vj12);
		platf.agregarVideojuego(vj13);
		platf.agregarVideojuego(vj14);
		platf.agregarVideojuego(vj15);
		platf.agregarVideojuego(vj16);
		platf.agregarVideojuego(vj17);
		platf.agregarVideojuego(vj18);
		platf.agregarVideojuego(vj19);
		platf.agregarVideojuego(vj20);
		
		
		do {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%***********************************************%%\r\n"
				+ "%%******************TRIANASTEAM******************%%\r\n"
				+ "%%***********************************************%%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
				+ "%%  1--> Agregar Saldo                           %%\r\n"
				+ "%%  2--> Alquilar Videojuego                     %%\r\n"
				+ "%%  3--> Devolver Videojuego                     %%\r\n"
				+ "%%  4--> 2x1 primer dia mes                      %%\r\n"
				+ "%%  5--> Dias que faltan para el prox 2x1        %%\r\n"
				+ "%%  6--> Promoción años bisiestos 30%            %%\r\n"
				+ "%%  7--> Promo alquiler a las tres semanas 10%   %%\r\n"
				+ "%%  8--> Ticket                                  %%\r\n"
				+ "%%  9--> Retirar Saldo                           %%\r\n"
				+ "%%  0--> Salir                                   %%\r\n"
				+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\n");
		
		menu1 = Leer.datoInt();
		
		switch(menu1) {
		
		case 1:
			
			System.out.println("Indique el saldo que quieres agregar \n");
			
			saldo = Leer.datoDouble();
			saldoTotal = saldoTotal + saldo;
			
			System.out.printf("Usted ha ingresado %.2f euros y tiene un total de saldo ahora mismo de %.2f euros",saldo,saldoTotal);
			
		break;
		
		case 2:
			if(saldoTotal >=4.95) {
			System.out.println("Escriba la zona tal cual aparece en la lista ");
			platf.verZona();
			zona = Leer.dato();
			System.out.println("Escribe la fecha que deseas para alquilar, primero pon el año \n");
			year = Leer.datoInt();
			System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
			mes = Leer.datoInt();
			System.out.println("Y por último pon el día \n");
			dia = Leer.datoInt();
			platf.elegirZona(zona,year,mes,dia);
			
			
			
			System.out.println("Indique el número de la lista de videojuegos que deseas alquilar \n");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
					+ "%%*****************************************************%%\r\n"
					+ "%%*********************TRIANASTEAM*********************%%\r\n"
					+ "%%*****************************************************%%\r\n"
					+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
					+ "%%  1--> Marvel's Avengers                             %%\r\n"
					+ "%%  2--> Plants vs. Zombies: Battle for Neighborville  %%\r\n"
					+ "%%  3--> Yakuza 6: The Song of Life                    %%\r\n"
					+ "%%  4--> Crash Bandicoot 4: It's About Time            %%\r\n"
					+ "%%  5--> Terminator: Resistance Enhanced               %%\r\n"
					+ "%%  6--> Red Dead Redemption 2                         %%\r\n"
					+ "%%  7--> The Legend of Zelda: Breath of the Wild       %%\r\n"
					+ "%%  8--> Forza Horizon 4                               %%\r\n"
					+ "%%  9--> God of War                                    %%\r\n"
					+ "%%  10-> StarCraft II: Wings of Liberty                %%\r\n"
					+ "%%  11-> The Witcher 3: Wild Hunt                      %%\r\n"
					+ "%%  12-> Uncharted 4: El Desenlace del Ladrón          %%\r\n"
					+ "%%  13-> Astro Bot Rescue Mission                      %%\r\n"
					+ "%%  14-> BioShock Infinite                             %%\r\n"
					+ "%%  15-> Dark Souls III                                %%\r\n"
					+ "%%  16-> Batman: Arkham City                           %%\r\n"
					+ "%%  17-> Ratchet & Clank                               %%\r\n"
					+ "%%  18-> Immortals Fenyx Rising                        %%\r\n"
					+ "%%  19-> Fortnite Battle Royale                        %%\r\n"
					+ "%%  20-> Resident Evil 7                               %%\r\n"
					+ "%%  0--> Salir                                         %%\r\n"
					+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
					+ "%%---------El precio de alquiler seria 4.95€-----------%%\r\n"
					+ "%%-------Penalización de 3€/dia demora entrega---------%%\r\n"
					+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\n");
			
			menu2=Leer.datoInt();
			switch(menu2) {
			case 1:
				System.out.println("Usted ha alquilado... "+vj1+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				MarvelC = MarvelC + cantidad;
				
				
				
				break;
			case 2:
				System.out.println("Usted ha alquilado... "+vj2+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				PlantsC = PlantsC + cantidad;
				
				break;
			case 3:
				System.out.println("Usted ha alquilado... "+vj3+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				YakuzaC = YakuzaC + cantidad;
				
				break;
			case 4:
				System.out.println("Usted ha alquilado... "+vj4+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				CrashC = CrashC + cantidad;
				
				break;
			case 5:
				System.out.println("Usted ha alquilado... "+vj5+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				TerminatorC = TerminatorC + cantidad;
				
				break;
			case 6:
				System.out.println("Usted ha alquilado... "+vj6+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				RedC = RedC + cantidad;
				
				break;
			case 7:
				System.out.println("Usted ha alquilado... "+vj7+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				ZeldaC = ZeldaC + cantidad;
				
				break;
			case 8:
				System.out.println("Usted ha alquilado... "+vj8+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				ForzaC = ForzaC + cantidad ;
				
				break;
			case 9:
				System.out.println("Usted ha alquilado... "+vj9+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				GodC = GodC + cantidad;
				break;
			case 10:
				System.out.println("Usted ha alquilado... "+vj10+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				StarcraftC = StarcraftC + cantidad;
				
				break;
			case 11:
				System.out.println("Usted ha alquilado... "+vj11+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				 WitcherC = WitcherC + cantidad;
				
				break;
			case 12:
				System.out.println("Usted ha alquilado... "+vj12+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				 UnchartedC = UnchartedC + cantidad;
				
				break;
			case 13:
				System.out.println("Usted ha alquilado... "+vj13+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				 AstroC = AstroC + cantidad;
				
				break;
			case 14:
				System.out.println("Usted ha alquilado... "+vj14+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				BioshockC = BioshockC + cantidad;
				
				break;
			case 15:
				System.out.println("Usted ha alquilado... "+vj15+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				DarkC = DarkC + cantidad;
				
				break;
			case 16:
				System.out.println("Usted ha alquilado... "+vj16+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				 BatmanC = BatmanC + cantidad;
				
				break;
			case 17:
				System.out.println("Usted ha alquilado... "+vj17+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				RatchetC = RatchetC + cantidad;
				
				break;
			case 18:
				System.out.println("Usted ha alquilado... "+vj18+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				ImmortalsC = ImmortalsC + cantidad;
				
				break;
			case 19:
				System.out.println("Usted ha alquilado... "+vj19+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				FortniteC = FortniteC + cantidad;
				
				break;
			case 20:
				System.out.println("Usted ha alquilado... "+vj20+"\n");
				System.out.println("Desde la zona y fecha de: \n ");
				platf.elegirZona(zona,year,mes,dia);
				System.out.println("Recuerde que tienes hasta  ");
				platf.sumarUnDia(year, mes, dia);
				System.out.print(" para devolver el juego,ya que se le cobraría 3€ por cada día de demora de entrega. \n");
				
				saldoTotal = saldoTotal - precio;
				ResidentC = ResidentC + cantidad;
				
				break;
				
			case 0:
				System.out.println("");
				
				break;
				
			default :
				
				System.out.println("Número erróneo, prueba de nuevo! \n");
					
				
				
			}
			
			}else {
				System.out.println("No tienes saldo suficiente para alquilar un videojuego, recarga saldo antes.");
			}
			break;
		case 3 :
			
			
			System.out.println("Escribe la fecha en la que alquilaste el/los videojuegos, primero pon el año \n");
			year = Leer.datoInt();
			System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
			mes = Leer.datoInt();
			System.out.println("Y por último pon el día \n");
			dia = Leer.datoInt();
			System.out.println("Escribe la fecha que vas a devolver el/los videojuegos, primero pon el año \n");
			year2 = Leer.datoInt();
			System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
			mes2 = Leer.datoInt();
			System.out.println("Y por último pon el día \n");
			dia2 = Leer.datoInt();
			
		    platf.diferenciaDeDias(year, mes, dia, year2, mes2, dia2);
				
			
		break;
		
		case 4:
			
			
			System.out.println("Escribe la fecha que quieres saber para ver en que día cae el 2x1, primero pon el año \n");
			year = Leer.datoInt();
			System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
			mes = Leer.datoInt();
			System.out.println("Y por último pon el día \n");
			dia = Leer.datoInt();
			System.out.println("El día que cae el 2x1 de la fecha consultada es: \n");
			platf.mostrarDiaPrimeroMes(year, mes, dia);
			
			break;
		case 5:
			
			platf.diasQueFaltan();
			
			break;
		
		
		case 6:
			System.out.println("Escribe la fecha que quieres saber si es año bisiesto y tienes un 30% descuento, primero pon el año \n");
			year = Leer.datoInt();
			System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
			mes = Leer.datoInt();
			System.out.println("Y por último pon el día \n");
			dia = Leer.datoInt();
			platf.calcularBisiesto(year, mes, dia);
		
		
			break ;
		case 7:
			System.out.println("Escribe la fecha de la ultima vez que alquilastes, primero pon el año \n");
			year = Leer.datoInt();
			System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
			mes = Leer.datoInt();
			System.out.println("Y por último pon el día \n");
			dia = Leer.datoInt();
			System.out.println("Si quieres beneficiarte del 10% descuento por alquilar justo a las tres semanas desde "
					+ "el ultimo alquiler, deberás hacerlo en la siguiente fecha: ");
			platf.calcularFechaTresSemanas(year, mes, dia);
			
			break;
			
		}
		
		}while(menu1!=0);
		
	}

}
