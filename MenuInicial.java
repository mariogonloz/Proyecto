import java.util.Scanner;

public class MenuInicial {
    protected static void Escribir() {
        int opcion=0;
        boolean error = false;
        final String contr = "ADMIN";
        String contrIntroducida;
        String codDept;
        Scanner in = new Scanner(System.in);

        do{
        System.out.print(
                "1-Login de Administrador\n" +
                "2-Login de Departamento\n" +
                "3-Salir\nElige un inicio de sesión: ");
        /*Nos aseguramos que el usuario solo introduce valores numéricos entre 1 y 3*/
            try {

                    error = false;
                    opcion = Integer.parseInt(in.nextLine());
                    if (opcion == 1) {
                        /*Si la contraseña es correcta, mostramos el menú de admin, si no,
                        mostrará un mensaje de contraseña errónea y volverá a preguntar la contraseña*/
                        do {
                            System.out.print("Introduce la contraseña: ");
                            contrIntroducida = in.nextLine();

                            if (contrIntroducida.equals(contr)) {
                                MenuAdministrador.Escribir();
                            } else {
                                System.out.println("Contraseña incorrecta, pulsa intro para volver a " +
                                        "introducir la contraseña");
                                in.nextLine();
                            }
                        } while (!contrIntroducida.equals(contr));
                    } else if (opcion == 2) {
                        MenuDepartamento.Escribir();
                    }

            } catch (NumberFormatException nfe) {
                System.out.println("Opción no válida, pulsa intro para volver a elegir una opción");
                in.nextLine();
                error = true;
            }
        } while (error || opcion!=3);
        System.out.println("Hasta luego");
    }
}