import java.io.Serializable;

public class ReporteDTO implements Serializable {

    private final int personaId;
    private final long cant;

    public ReporteDTO(int personaId, long cant) {
        this.personaId = personaId;
        this.cant = cant;
    }

    public int getPersonaId() {
        return personaId;
    }

    public long getCant() {
        return cant;
    }
}
