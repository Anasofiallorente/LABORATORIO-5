
public class Tratamiento {
	private String nombreTratamiento;

	public Tratamiento(String nombre, Paciente paciente) {
		super();
		this.nombreTratamiento = nombre;
		if (paciente != null) {
			paciente.recibirTratamiento(this);
		}
	}

	public String getNombreTratamiento() {
		return nombreTratamiento;
	}
}