import java.util.ArrayList;
public class Salas {
    static ArrayList salas;

    public static void add(String nombre, String codigo){
        salas.add(new Sala(nombre,codigo));
    }

    public static void remove(String clave){
        for(int i=0;i<salas.size();i++){
            if (salas.get(i) instanceof Sala){
                if (((Sala) salas.get(i)).getCodigo().equals(clave)){
                    salas.remove(i);
                }
                else System.out.println("No existe una sala con ese código");
            }
        }
    }

    public static void list(){
        for (Object o:salas){
            System.out.println(o);
        }
    }
}
