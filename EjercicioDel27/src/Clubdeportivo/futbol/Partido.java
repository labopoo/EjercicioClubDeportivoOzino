package Clubdeportivo.futbol;
import java.util.HashSet;
public class Partido {
    private String fecha;
    private String hora;
    private HashSet<Jugador> JugadoresEnPartido;
    private boolean Ganador;

    public Partido() {
        this.fecha = "24/05/2017";
        this.hora = "17:30";
        Ganador = true;
    }

    public Partido(String fecha, String hora, HashSet<Jugador> jugadoresEnPartido, boolean ganador) {
        this.fecha = fecha;
        this.hora = hora;
        JugadoresEnPartido = jugadoresEnPartido;
        Ganador = ganador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public HashSet<Jugador> getJugadoresEnPartido() {
        return JugadoresEnPartido;
    }

    public void setJugadoresEnPartido(HashSet<Jugador> jugadoresEnPartido) {
        JugadoresEnPartido = jugadoresEnPartido;
    }

    public boolean isGanador() {
        return Ganador;
    }

    public void setGanador(boolean ganador) {
        Ganador = ganador;
    }

    public boolean gano(Partido PartidosGanados){
        boolean ganadores = this.Ganador;
        return ganadores;
    }
}
