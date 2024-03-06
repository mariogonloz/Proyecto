import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Sala sala;//Sala que se reserva
    private Departamento departamento;//Departamento que hace la reserva

    //Constructor
    public Reserva(LocalDateTime fecha1, LocalDateTime fecha2, Sala sala, Departamento departamento){
        fechaInicio=fecha1;
        fechaFin=fecha2;
        this.sala=sala;
        this.departamento=departamento;
    }

    public String toString(){
        return fechaInicio+"-"+fechaFin+", "+sala+", "+departamento;
    }

}
