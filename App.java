import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcion;
        final String contr = "ADMIN";
        String contrIntroducida;
        boolean error = false;
        Scanner in = new Scanner(System.in);

        /*Sacamos el menú de inicio de sesión y nos aseguramos que el usuario solo
        introduce valores numéricos entre 1 y 2*/
        do {
            MenuInicial.Escribir();
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
                                // MenuAdministrador.Escribir();
                                System.out.println("Menu");
                            } else {
                                System.out.println("Contraseña incorrecta, pulsa intro para volver a " +
                                        "introducir la contraseña");
                                in.nextLine();
                            }

                        } while (!contrIntroducida.equals(contr));
                    }
                    else if (opcion == 2){
                        System.out.println("Introduce el código del departamento");

                    }
                } while (opcion != 1 && opcion != 2);
            } catch (NumberFormatException nfe) {
                System.out.println("Opción no válida, pulsa intro para volver a elegir una opción");
                in.nextLine();
                error = true;
            }

        } while (error);
    }
}



