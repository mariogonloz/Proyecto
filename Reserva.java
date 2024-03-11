import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;


public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Duration duracion;
    private Sala sala;//Sala que se reserva
    private Departamento departamento;//Departamento que hace la reserva

    //Constructor
    public Reserva(LocalDate fecha, LocalTime hora,Duration duracion,  Sala sala, Departamento departamento){
        this.fecha=fecha;
        this.hora=hora;
        this.duracion=duracion;
        this.sala=sala;
        this.departamento=departamento;
    }

    public String toString(){
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2=DateTimeFormatter.ofPattern("kk:mm");
        return fecha.format(f1)+"-"+hora.format(f2)+", "+duracion+", "+sala+", "+departamento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public Sala getSala() {
        return sala;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public boolean equals(Reserva reserva){
        return (this.fecha.isEqual(reserva.fecha) && this.sala.equals(reserva.sala)
                && (this.hora.equals(reserva.hora) || (reserva.hora.isAfter(this.hora) && reserva.hora.isBefore(this.hora.plus(duracion)))));
    }
}
