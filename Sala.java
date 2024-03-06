public class Sala {
    private String nombre;
    private String codigo;

    //Constructor
    public Sala(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString(){
        return nombre+", "+codigo;
    }
}
