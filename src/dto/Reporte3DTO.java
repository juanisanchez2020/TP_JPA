import java.io.Serializable;

public class Reporte3DTO extends ReporteDTO implements Serializable {

    public Reporte3DTO() {}

    public Reporte3DTO(int personaId, long cant) {
        super(personaId, cant);
    }

    @Override
    public String toString() {
        return "Reporte3DTO [personaId=" + getPersonaId() +
                ", Cantidad de capitulos como autor=" + getCant() + " ]";
    }
}
