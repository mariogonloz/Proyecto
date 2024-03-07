import java.util.Scanner;

public class MenuAdministrador {
    protected static void Escribir() {
        boolean error = false;
        int opcion;
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
            try {
                do {
                    error = false;
                    opcion = Integer.parseInt(in.nextLine());
                    if(opcion == 1){

                    }else if(opcion == 2){

                    }else if(opcion == 3){

                    }else if(opcion == 4){

                    }else if(opcion == 5){

                    }else if(opcion == 6){

                    }else if(opcion == 7){

                    }
                } while (opcion != 8);
                MenuInicial.Escribir();
            } catch (NumberFormatException nfe) {
                System.out.println("Opción no válida, pulsa intro para volver a elegir una opción");
                in.nextLine();
                error = true;
            }
        } while (error);
    }
}

