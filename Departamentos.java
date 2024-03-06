import java.util.ArrayList;

public class Departamentos {
    static ArrayList departamentos;

    public static void add(String nombre, String codigo){
        departamentos.add(new Departamento(nombre,codigo));
    }

    public static void remove(String clave){
        for (int i=0;i<departamentos.size();i++){
            if (departamentos.get(i) instanceof Departamento){
                if (((Departamento) departamentos.get(i)).getCodigo().equals(clave)){
                    departamentos.remove(i);
                }
                else System.out.println("No existe departamento con ese código");
            }
        }
    }

    public static void list(){
        for (Object o:departamentos){
            System.out.println(o);
        }
    }
}
