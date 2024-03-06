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

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void reservar(LocalDateTime hora1, LocalDateTime hora2, Sala sala){
        reservas.add(new Reserva(hora1, hora2, sala, this));
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

    /*Primero recorro el ArrayList entero, después me aseguro que el onjeto sea una Reserva
    y en el ultimo if comparo la fechaIncial y la sala, para eliminar o no la reserva
     */
    public void cancelar(LocalDateTime hora, Sala sala){
        for (int i=0;i<reservas.size();i++){
            if (reservas.get(i) instanceof Reserva){
                if (((Reserva) reservas.get(i)).getFechaInicio().equals(hora) && ((Reserva) reservas.get(i)).getSala().equals(sala)){
                    reservas.remove(i);
                }
                else{
                    System.out.println("No existe esa sala");
                }
            }
        }
    }

}
