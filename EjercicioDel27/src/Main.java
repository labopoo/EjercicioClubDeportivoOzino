import Clubdeportivo.futbol.EquipoFutbol;
import Clubdeportivo.futbol.Jugador;
import Clubdeportivo.futbol.Partido;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClubDeportivo ClubPen = new ClubDeportivo();
        EquipoFutbol EquipoTod = new EquipoFutbol();
        Jugador jugador1 = new Jugador("Manuel", "Ortega", 20);
        Jugador jugador2 = new Jugador("Julio", "Karto", 25);
        Jugador jugador3 = new Jugador("Emilio", "Barrera", 30);
        Jugador jugador4 = new Jugador("Rico", "Herto", 31);
        Jugador jugador5 = new Jugador("Ernesto", "Ibama", 23);
        Jugador jugador6 = new Jugador("Roman", "Simpson", 26);
        Jugador jugador7 = new Jugador("Brando", "Rada", 20);
        Jugador jugador8 = new Jugador("Tauro", "Gutierrez", 19);
        Jugador jugador9 = new Jugador("Luis", "Ramino", 28);
        Jugador jugador10 = new Jugador("Pesci", "Jones", 23);
        Jugador jugador11 = new Jugador("Diego", "Brando", 20);
        Jugador jugador12 = new Jugador("Johnny", "Joestar", 19);
        Jugador jugador13 = new Jugador("Hector", "Zeppeli", 21);
        Jugador jugador14 = new Jugador("Nero", "Risotto", 23);
        Jugador jugador15 = new Jugador("Walter", "Una", 29);
        Jugador jugador16 = new Jugador("Pablo", "Brown", 20);
        Jugador jugador17 = new Jugador("Lucio", "Howes", 29);
        Jugador jugador18 = new Jugador("Franco", "Juarez", 27);
        Jugador jugador19 = new Jugador("Pedro", "Zair", 35);
        Jugador jugador20 = new Jugador("Uriel", "Ordinez", 33);
        Jugador jugador21 = new Jugador("Homero", "Pirtova", 36);
        Jugador jugador22 = new Jugador("Maximo", "Karkov", 30);
        HashSet<Jugador> JugadoresSanPedro = new HashSet<>();
        JugadoresSanPedro.add(jugador1);
        JugadoresSanPedro.add(jugador2);
        JugadoresSanPedro.add(jugador3);
        JugadoresSanPedro.add(jugador4);
        JugadoresSanPedro.add(jugador5);
        JugadoresSanPedro.add(jugador6);
        JugadoresSanPedro.add(jugador7);
        JugadoresSanPedro.add(jugador8);
        JugadoresSanPedro.add(jugador9);
        JugadoresSanPedro.add(jugador10);
        JugadoresSanPedro.add(jugador11);
        JugadoresSanPedro.add(jugador12);
        JugadoresSanPedro.add(jugador13);
        JugadoresSanPedro.add(jugador14);
        JugadoresSanPedro.add(jugador15);
        JugadoresSanPedro.add(jugador16);
        JugadoresSanPedro.add(jugador17);
        JugadoresSanPedro.add(jugador18);
        JugadoresSanPedro.add(jugador19);
        JugadoresSanPedro.add(jugador20);
        JugadoresSanPedro.add(jugador21);
        JugadoresSanPedro.add(jugador22);
        HashSet<Jugador> Partido1 = new HashSet<>();
        Partido1.add(jugador1);
        Partido1.add(jugador4);
        Partido1.add(jugador11);
        Partido1.add(jugador16);
        Partido1.add(jugador22);
        Partido1.add(jugador17);
        Partido1.add(jugador13);
        Partido1.add(jugador7);
        Partido1.add(jugador9);
        Partido1.add(jugador10);
        Partido1.add(jugador18);
        HashSet<Jugador> Partido2 = new HashSet<>();
        Partido2.add(jugador1);
        Partido2.add(jugador2);
        Partido2.add(jugador3);
        Partido2.add(jugador4);
        Partido2.add(jugador5);
        Partido2.add(jugador6);
        Partido2.add(jugador7);
        Partido2.add(jugador8);
        Partido2.add(jugador9);
        Partido2.add(jugador10);
        Partido2.add(jugador11);
        HashSet<Jugador> Partido3 = new HashSet<>();
        Partido3.add(jugador12);
        Partido3.add(jugador13);
        Partido3.add(jugador14);
        Partido3.add(jugador15);
        Partido3.add(jugador16);
        Partido3.add(jugador17);
        Partido3.add(jugador18);
        Partido3.add(jugador19);
        Partido3.add(jugador20);
        Partido3.add(jugador21);
        Partido3.add(jugador22);
        HashSet<Jugador> Partido4 = new HashSet<>();
        Partido4.add(jugador1);
        Partido4.add(jugador2);
        Partido4.add(jugador11);
        Partido4.add(jugador12);
        Partido4.add(jugador21);
        Partido4.add(jugador22);
        Partido4.add(jugador5);
        Partido4.add(jugador6);
        Partido4.add(jugador15);
        Partido4.add(jugador16);
        Partido4.add(jugador7);
        HashSet<Jugador> Partido5 = new HashSet<>();
        Partido5.add(jugador5);
        Partido5.add(jugador7);
        Partido5.add(jugador9);
        Partido5.add(jugador14);
        Partido5.add(jugador11);
        Partido5.add(jugador20);
        Partido5.add(jugador10);
        Partido5.add(jugador8);
        Partido5.add(jugador4);
        Partido5.add(jugador16);
        Partido5.add(jugador19);
        Partido PartidoJugado1 = new Partido("25/05/2009","16:30",Partido1,true);
        Partido PartidoJugado2 = new Partido("10/11/2012","10:50",Partido2,false);
        Partido PartidoJugado3 = new Partido("20/04/2020","22:00",Partido3,false);
        Partido PartidoJugado4 = new Partido("6/09/2019","00:45",Partido4,true);
        Partido PartidoJugado5 = new Partido("3/12/2018","15:15",Partido5,true);
        HashSet<Partido> PartidosJugados = new HashSet<>();
        PartidosJugados.add(PartidoJugado1);
        PartidosJugados.add(PartidoJugado2);
        PartidosJugados.add(PartidoJugado3);
        PartidosJugados.add(PartidoJugado4);
        PartidosJugados.add(PartidoJugado5);
        EquipoTod.setJugadores(JugadoresSanPedro);
        ClubPen.setEquipo(EquipoTod);
        ClubPen.setPartidosJugados(PartidosJugados);
        HashSet<Partido> PartidosGanados = new HashSet<>();
        HashSet<Partido> PartidosPerdidos = new HashSet<>();
        for (Partido partidazo: PartidosJugados) {
            if (partidazo.gano(partidazo)){
                PartidosGanados.add(partidazo);
            }
        }
        for (Partido partidazo: PartidosJugados) {
            if (partidazo.gano(partidazo)){
            }
            else{
                PartidosPerdidos.add(partidazo);
            }
        }

        Scanner Opcion = new Scanner(System.in);
        System.out.println("Bienvenido a la Database de los partidos del Club Deportivo Pedrito.");
        System.out.println("Supongo que querra ver los resultados de los partidos. Seleccione si quiere ver las derrotas o las victorias.");
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingrese el valor 1 para ver las victorias.");
        System.out.println("Ingrese el valor 2 para ver las derrotas.");
        System.out.println("Ingrese el valor 3 para salir de la database.");
        System.out.println("------------------------------------------------------------");
        int opcionSeleccionada = Opcion.nextInt();
        while (opcionSeleccionada!=3){
            if(opcionSeleccionada == 1){
                for (Partido ganadoz: PartidosGanados) {
                    System.out.println(ganadoz);
                    for (Jugador jugadoresdelganado: ganadoz.getJugadoresEnPartido()) {
                        System.out.println(jugadoresdelganado.getNombre() + " " + jugadoresdelganado.getApellido() + ": " + jugadoresdelganado.getEdad());
                    }
                }
            }
            if(opcionSeleccionada == 2){
                for (Partido perdidoz: PartidosPerdidos) {
                    System.out.println(perdidoz);
                    for (Jugador jugadoresdelperdido: perdidoz.getJugadoresEnPartido()) {
                        System.out.println(jugadoresdelperdido.getNombre() + " " + jugadoresdelperdido.getApellido() + ": " + jugadoresdelperdido.getEdad());
                    }
                }
            }
            Scanner Opcion2 = new Scanner(System.in);
            System.out.println("Desea seguir viendo los datos?");
            System.out.println("Ingrese el valor 3 para salir del menu.");
            System.out.println("Ingrese el valor 1 para ver las derrotas.");
            System.out.println("Ingrese el valor 2 para ver las victorias.");
            int opcionAux = Opcion2.nextInt();
            opcionSeleccionada = opcionAux;
        }

    }
    
    /*
    Hola, Ozino!
    Muy bien!

    Recordar:
    - aplicar el concepto de alta cohesión en todos los métodos
    - los nombres de atributos, si tienen sólo una palabra, se
    escriben con minúsculas y si tienen más de una, la primera
    debe comenzar con mínúscula y las demás deben comenzar con
    letra mayúscula.
    - que el repositorio debe ser privado y que me debe enviar la solcitud
    para ser "colaborador"
     */

}
