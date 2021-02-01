import java.io.Serializable;

public class Reporte1DTO extends ReporteDTO implements Serializable {
    private int anio;

    public Reporte1DTO(int personaId, long cant) {
        super(personaId, cant);
    }

    public Reporte1DTO() {
        super();
    }

    @Override
    public String toString() {
        return "Reporte1DTO [personaId=" + getPersonaId() +
                ", Cantidad de libros editados en año=" + getCant() + "]";
    }
}
