import java.util.Scanner;

public class MenuAdministrador {
    protected static void Escribir() {
        boolean error = false;
        int opcion = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Has entrado en el menú de administrador:");
            System.out.print(
                    "1-Listar departamentos\n" +
                            "2-Añadir departamento\n" +
                            "3-Eliminar departamento\n" +
                            "4-Listar salas\n" +
                            "5-Añadir sala\n" +
                            "6-Eliminar sala\n" +
                            "7-Listar todas las reservas\n" +
                            "8-Cerrar sesión\n" +
                            "Elige una opción: ");
            /*Nos aseguramos que el usuario introduce un valor númerico*/

            opcion = Integer.parseInt(in.nextLine());
            if (opcion == 1) {
                Departamentos.list();
            } else if (opcion == 2) {
                String
            } else if (opcion == 3) {

            } else if (opcion == 4) {
                Salas.list();
            } else if (opcion == 5) {
                String nombreSala;
                String codSala;
                System.out.println("Introduce el nombre de la sala");
                nombreSala = in.nextLine();
                System.out.println("Introduce el código de la sala");
                codSala = in.nextLine();
                Salas.add(nombreSala, codSala);
            } else if (opcion == 6) {
                String codSala;
                System.out.println("Introduce el código de la sala");
                codSala = in.nextLine();
                Salas.remove(codSala);
            } else if (opcion == 7) {

            }

        } while (opcion != 8);
    }
}