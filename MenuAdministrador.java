import java.util.Scanner;

public class MenuAdministrador {
    protected static void Escribir() {
        boolean error = false;
        int opcion=0;
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

                    error = false;
                    opcion = Integer.parseInt(in.nextLine());
                    if(opcion == 1){

                    }else if(opcion == 2){

                    }else if(opcion == 3){

                    }else if(opcion == 4){

                    }else if(opcion == 5){

                    }else if(opcion == 6){

                    }else if(opcion == 7){

                    }else if (opcion==8){
                        System.out.println("adios");
                    }


        } while (opcion!=8);
    }
}

