
public class Paciente {

    private int identificacion;
    private String nombre;

    public Paciente(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    
    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    void recibirTratamiento(Tratamiento aThis) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}