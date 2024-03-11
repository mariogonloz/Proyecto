import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private String codigo;
    public ArrayList reservas;

    //Constructor
    public Departamento(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void reservar(LocalDate fecha, LocalTime hora,Duration duracion, Sala sala){
        reservas.add(new Reserva(fecha, hora,duracion, sala, this));
        Reservas.add(fecha, hora,duracion, sala, this);
    }

    public String toString () {
        return nombre+", "+codigo;
    }

    /*
    Recorro toda la lista y escribo cada reserva gracias al toString
     */
    public void listar(){
        for (int i=0;i<reservas.size();i++){
            System.out.println(reservas.get(i));
        }
    }

    /*Primero recorro el ArrayList entero, después me aseguro que el objeto sea una Reserva
    y en el ultimo if comparo la fechaIncial y la sala, para eliminar o no la reserva
     */
    public void cancelar(LocalDate fecha, LocalTime hora, Sala sala){
        Reservas.remove(fecha,hora,this,sala);
        for (int i=0;i<reservas.size();i++){
            if (reservas.get(i) instanceof Reserva r){
                if (r.equals(new Reserva(fecha,hora,Duration.ofHours(0),sala,this))){
                    reservas.remove(i);
                }
            }
        }
    }

}
