public class Sala {
    private String nombre;
    private String codigo;

    //Constructor
    public Sala(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public String toString(){
        return nombre+", "+codigo;
    }
}
