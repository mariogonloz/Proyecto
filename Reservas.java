import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.util.ArrayList;

public class Reservas {
 public static ArrayList reservas;

    public static void add(LocalDate fecha, LocalTime hora, Duration duracion, Sala sala, Departamento departamento){
        boolean valido=true;
        for (int i=0;i<reservas.size();i++){
            if (reservas.get(i) instanceof Reserva){
                if (reservas.get(i).equals(new Reserva(fecha,hora,duracion,sala,departamento))){
                    valido=false;
                    System.out.println("Esta reserva ya esta hecha");
                }
            }
        }
        if (valido){
            reservas.add(new Reserva(fecha,hora,duracion,sala,departamento));
        }
    }

    public static void remove(LocalDate fecha, LocalTime hora, Departamento departamento, Sala sala){
        for (int i=0;i<reservas.size();i++){
            if (reservas.get(i) instanceof Reserva){
                if (((Reserva) reservas.get(i)).equals(new Reserva(fecha,hora,Duration.ofHours(0),sala,departamento))){
                        reservas.remove(i);
                }
                else System.out.println("No existe tal reserva");
            }
        }
    }


    public static void list(){
        for (Object o:reservas){
            System.out.println(o);
        }
    }
}
