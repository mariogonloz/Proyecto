import java.util.Scanner;

public class MenuInicial {


    protected static void Escribir() {
        int opcion;
        boolean error = false;
        final String contr = "ADMIN";
        String contrIntroducida;
        Scanner in = new Scanner(System.in);

        System.out.println("Elige un inicio de sesión\n" +
                "1-Login de Administrador\n" +
                "2-Login de Departamento\n" +
                "3-Salir");
        try {
            do {
                error = false;
                opcion = Integer.parseInt(in.nextLine());
                if (opcion == 1) {
                    do {
                        System.out.println("Introduce la contraseña");
                        contrIntroducida = in.nextLine();
                        /*Si la contraseña es correcta, mostramos el menú de admin, si no,
                        mostrará un mensaje de contraseña errónea y volverá a preguntar la contraseña*/
                        if (contrIntroducida.equals(contr)) {
                            MenuAdministrador.Escribir();
                        } else {
                            System.out.println("Contraseña incorrecta, pulsa intro para volver a " +
                                    "introducir la contraseña");
                            in.nextLine();
                        }
                    }
                }
            }while(opcion!=3);


        } catch (NumberFormatException nfe) {
            System.out.println("Opción no válida, pulsa intro para volver a elegir una opción");
            in.nextLine();
            error = true;
        } while (!contrIntroducida.equals(contr)) ;
    }
}
            }
                    }