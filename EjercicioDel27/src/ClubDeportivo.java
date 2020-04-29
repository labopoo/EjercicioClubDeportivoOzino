import Clubdeportivo.futbol.EquipoFutbol;
import Clubdeportivo.futbol.Partido;
import java.util.HashSet;

public class ClubDeportivo {
    private String NombreClub;
    private String NombreEquipo;
    private EquipoFutbol Equipo;
    private HashSet<Partido> PartidosJugados;

    public ClubDeportivo() {
        NombreClub = "Club Pedrito";
        NombreEquipo = "San Pedro";
    }

    public ClubDeportivo(String nombreClub, String nombreEquipo, EquipoFutbol equipo, HashSet<Partido> partidosJugados) {
        NombreClub = nombreClub;
        NombreEquipo = nombreEquipo;
        Equipo = equipo;
        PartidosJugados = partidosJugados;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String nombreClub) {
        NombreClub = nombreClub;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        NombreEquipo = nombreEquipo;
    }

    public EquipoFutbol getEquipo() {
        return Equipo;
    }

    public void setEquipo(EquipoFutbol equipo) {
        Equipo = equipo;
    }

    public HashSet<Partido> getPartidosJugados() {
        return PartidosJugados;
    }

    public void setPartidosJugados(HashSet<Partido> partidosJugados) {
        PartidosJugados = partidosJugados;
    }
}
