import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.util.ArrayList;

public class Reservas {
 public static ArrayList reservas=new ArrayList<>(2);
 public static int reservasCreadas;

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

    public static void remove (String sala){
        for (int i=0;i<reservasCreadas;i++){
            if (reservas.get(i) instanceof Reserva r){
                if (r.getSala().getCodigo().equals(sala) || r.getSala().getNombre().equals(sala)){
                    reservas.remove(i);
                }
            }
        }
    }


    public static void list(){
        if (reservasCreadas==0){
            System.out.println("No hay reservas creadas");
        }
        else {
            for (Object o : reservas) {
                System.out.println(o);
            }
        }
    }
}
