

public class Sistema {
    private Hospital hospital;

    public Sistema() {
        this.hospital = new Hospital();
    }

    public void iniciar() {
        System.out.println("Pacientes del hospital universitario");

        
        Paciente p1 = hospital.agregarPaciente(101, "Liz");
        Paciente p2 = hospital.agregarPaciente(102, "Carlos Gomez");
        Paciente p3 = hospital.agregarPaciente(103, "Maria Rodriguez");
        Paciente p4 = hospital.agregarPaciente(104, "Juan Perez");
        Paciente p5 = hospital.agregarPaciente(105, "Elena Torres");

       
        System.out.println("ID: " + p1.getIdentificacion() + "  Nombre: " + p1.getNombre());
        System.out.println("ID: " + p2.getIdentificacion() + "  Nombre: " + p2.getNombre());
        System.out.println("ID: " + p3.getIdentificacion() + "  Nombre: " + p3.getNombre());
        System.out.println("ID: " + p4.getIdentificacion() + "  Nombre: " + p4.getNombre());
        System.out.println("ID: " + p5.getIdentificacion() + "  Nombre: " + p5.getNombre());

        
        
    }

    public static void main(String[] args) {
        Sistema app = new Sistema();
        app.iniciar();
    }
}