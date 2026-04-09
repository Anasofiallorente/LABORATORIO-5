
import java.util.Date;

public class Examen {
	private int identificacionExamen;
	private Date fechaExamen;

	public Examen(int id, Date fecha) {
		super();
		this.identificacionExamen = id;
		this.fechaExamen = fecha;
	}

	public int getIdentificacionExamen() {
		return identificacionExamen;
	}
}