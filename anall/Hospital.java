

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    
    private List<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new ArrayList<>();
    }

    
    public Paciente agregarPaciente(int id, String nombre) {
        Paciente nuevo = new Paciente(id, nombre);
        this.pacientes.add(nuevo);
        return nuevo;
    }
}