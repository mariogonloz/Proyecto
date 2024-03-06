import java.time.LocalDateTime;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private String codigo;
    private ArrayList reservas;

    //Constructor
    public Departamento(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public void reservar(LocalDateTime hora1, LocalDateTime hora2, Sala sala){
        reservas.add(new Reserva(hora1, hora2, sala, this));
    }

    public String toString () {
        return nombre+", "+codigo;
    }


}
