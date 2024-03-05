import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcion;
        Scanner in = new Scanner(System.in);
        //Sacamos el menú de inicio de sesión
        MenuInicial.Escribir();
        opcion = Integer.parseInt(in.nextLine());
        if(opcion==1){
            System.out.println("Introduce la contraseña")
            System.out.println("d");;
        }

    }
}
