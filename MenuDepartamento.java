import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;

public class MenuDepartamento {
    protected static void Escribir(Departamento dept) {
        int opcion = 0;
        Departamento dep=dept;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Has entrado al menú del departamento de ");
            System.out.print(
                    "1-Añadir reserva\n+" +
                            "2-Cancelar reserva\n" +
                            "3-Listar todas las reservas\n" +
                            "4-Cerrar sesión\n" +
                            "Elige una opción");
            opcion = Integer.parseInt(in.nextLine());
            if (opcion == 1) {
                int dia, mes, año, horaI,horas;
                String sala;
                boolean repetir=false;
                LocalDate fecha;
                LocalTime hora=LocalTime.of(0,0);
                Duration duracion;
                Sala sala1=new Sala(null, null);
                System.out.print("Introduce el día de la reserva: ");
                dia = Integer.parseInt(in.nextLine());

                System.out.print("Introduce el mes de la reserva: ");
                mes = Integer.parseInt(in.nextLine());

                System.out.print("Introduce el año de la reserva: ");
                año = Integer.parseInt(in.nextLine());

                fecha = LocalDate.of(año, mes, dia);
                do {
                    System.out.print("Introduce la hora de inicio de reserva: ");
                    horaI = Integer.parseInt(in.nextLine());
                    if (horaI > 9 && horaI < 14) {
                        hora = LocalTime.of(horaI, 0);
                    } else {
                        System.out.println("Solo se puede reservar de 09:00 a 14:00");
                    }
                } while (horaI < 9 && horaI > 14);

                System.out.print("Introduce cuantas horas va a durar la reseva: ");
                horas=Integer.parseInt(in.nextLine());

                Duration d= Duration.ofHours(horas);
                do {
                    System.out.print("Introduce la sala de reserva: ");
                    sala = in.nextLine();
                    for (int i = 0; i < Salas.salas.size(); i++) {
                        if (Salas.salas.get(i) instanceof Sala s) {
                            if (s.getNombre().equals(sala) || s.getCodigo().equals(sala)) {
                                sala1 = s;
                            } else {
                                System.out.println("Esa sala no existe");
                                repetir=true;
                            }
                        }
                    }
                }while(repetir);

                dep.reservar(fecha,hora,d,sala1);
            } else if (opcion == 2) {
                String sala;
                int dia, mes, año, horaI;
                Sala sala1=new Sala(null,null);
                boolean repetir=false;
                do {
                    System.out.print("Introduce la sala de reserva: ");
                    sala = in.nextLine();
                    for (int i = 0; i < Salas.salas.size(); i++) {
                        if (Salas.salas.get(i) instanceof Sala s) {
                            if (s.getNombre().equals(sala) || s.getCodigo().equals(sala)) {
                                sala1 = s;
                            } else {
                                System.out.println("Esa sala no existe");
                                repetir=true;
                            }
                        }
                    }
                }while(repetir);
                System.out.print("Introduce el día de la reserva a cancelar: ");
                dia = Integer.parseInt(in.nextLine());
                System.out.print("Introduce el mes de la reserva a cancelar: ");
                mes = Integer.parseInt(in.nextLine());
                System.out.print("Introduce el año de la reserva a cancelar: ");
                año = Integer.parseInt(in.nextLine());
                LocalDate fecha = LocalDate.of(año, mes, dia);
                System.out.print("Introduce la hora de inicio de la reserva: ");
                horaI=Integer.parseInt(in.nextLine());
                LocalTime hora = LocalTime.of(horaI,0);


                dep.cancelar(fecha,hora,sala1);
            } else if (opcion == 3) {
                Reservas.list();
            }
        } while (opcion != 4);
    }
}
