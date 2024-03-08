import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservas {
 public static ArrayList reservas;

    public static void add(LocalDateTime fecha1, LocalDateTime fecha2, Sala sala, Departamento departamento){
        boolean valido=true;
        for (int i=0;i<reservas.size();i++){
            if (reservas.get(i) instanceof Reserva){
                if (reservas.get(i).equals(new Reserva(fecha1,fecha2,sala,departamento))){
                    valido=false;
                    System.out.println("Esta reserva ya esta hecha");
                }
            }
        }
        if (valido){
            reservas.add(new Reserva(fecha1,fecha2,sala,departamento));
        }
    }

    public static void remove(String codigo){
        for (int i=0;i<reservas.size();i++){
            if (reservas.get(i) instanceof Departamento){
                if (((Departamento) reservas.get(i)).getCodigo().equals(codigo)){
                    reservas.remove(i);
                }
                else System.out.println("No existe ningún departamento con ese código");
            }
        }
    }

    public static void list(){
        for (Object o:reservas){
            System.out.println(o);
        }
    }
}
