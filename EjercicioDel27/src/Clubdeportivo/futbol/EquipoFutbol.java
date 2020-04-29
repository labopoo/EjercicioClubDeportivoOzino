package Clubdeportivo.futbol;
import java.util.HashSet;
public class EquipoFutbol {
    private HashSet<Jugador> Jugadores;
    private String EntrenadorNombre;
    private String EntrenadorApellido;
    private String DTNombre;
    private String DTApellido;


    public EquipoFutbol() {
        EntrenadorNombre = "Mario";
        EntrenadorApellido = "Zucchero";
        DTNombre = "Saul";
        DTApellido = "Gonzales";
    }

    public EquipoFutbol(HashSet<Jugador> jugadores, String entrenadorNombre, String entrenadorApellido, String DTNombre, String DTApellido) {
        Jugadores = jugadores;
        EntrenadorNombre = entrenadorNombre;
        EntrenadorApellido = entrenadorApellido;
        this.DTNombre = DTNombre;
        this.DTApellido = DTApellido;
    }

    public HashSet<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        Jugadores = jugadores;
    }

    public String getEntrenadorNombre() {
        return EntrenadorNombre;
    }

    public void setEntrenadorNombre(String entrenadorNombre) {
        EntrenadorNombre = entrenadorNombre;
    }

    public String getEntrenadorApellido() {
        return EntrenadorApellido;
    }

    public void setEntrenadorApellido(String entrenadorApellido) {
        EntrenadorApellido = entrenadorApellido;
    }

    public String getDTNombre() {
        return DTNombre;
    }

    public void setDTNombre(String DTNombre) {
        this.DTNombre = DTNombre;
    }

    public String getDTApellido() {
        return DTApellido;
    }

    public void setDTApellido(String DTApellido) {
        this.DTApellido = DTApellido;
    }
}