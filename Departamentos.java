import java.util.ArrayList;

public class Departamentos {
    public static ArrayList departamentos=new ArrayList<>(2);
    public static int departamentosCreados;

    public static void add(String nombre, String codigo){
        boolean valido = true;


        for (int i = 0; i < departamentosCreados; i++) {
            if (departamentos.get(i) instanceof Sala) {
                if (((Sala) departamentos.get(i)).getNombre().equals(nombre) ||
                        ((Sala) departamentos.get(i)).getCodigo().equals(codigo)) {
                    System.out.println("Ese departamento ya existe");
                    valido = false;
                }
            }
        }
        if (valido) {
            departamentos.add(new Departamento(nombre, codigo));
            departamentosCreados++;
        }

    }

    public static void remove(String clave){
        for(int i=0;i<departamentosCreados;i++){
            if (departamentos.get(i) instanceof Departamento){
                if (((Departamento) departamentos.get(i)).getCodigo().equals(clave)){
                    departamentos.remove(i);
                    departamentosCreados--;
                }
                else System.out.println("No existe una sala con ese código");
            }
        }
    }

    public static void list(){
        if (departamentosCreados==0){
            System.out.println("No hay departamentos creados");
        }
        else {
            for (Object o : departamentos) {
                System.out.println(o);
            }
        }
    }
}
