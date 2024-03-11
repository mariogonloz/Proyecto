import java.util.ArrayList;
public class Salas {
    static ArrayList salas=new ArrayList<>(2);
    public static int salasCreadas;

    public static void add(String nombre, String codigo){
        boolean valido = true;
        for (int i = 0; i < salasCreadas; i++) {
            if (salas.get(i) instanceof Sala) {
                if (((Sala) salas.get(i)).getNombre().equals(nombre) ||
                        ((Sala) salas.get(i)).getCodigo().equals(codigo)) {
                    System.out.println("Esa sala ya existe");
                    valido = false;
                }
            }
        }
        if (valido) {
            salas.add(new Sala(nombre, codigo));
            salasCreadas++;
        }

    }

    public static void remove(String clave){
        for(int i=0;i<salas.size();i++){
            if (salas.get(i) instanceof Sala){
                if (((Sala) salas.get(i)).getCodigo().equals(clave)){
                    salas.remove(i);
                    salasCreadas--;
                }
                else System.out.println("No existe una sala con ese código");
            }
        }
    }

    public static void list(){
        if (salasCreadas<1){
            System.out.println("No hay salas creadas");
        }
        else {
            for (Object o : salas) {
                System.out.println(o);
            }
        }
    }
}
