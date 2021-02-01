public class ReporteDTO {

    private int personaId;
    private long cant;

    public ReporteDTO(int personaId, long cant) {
        this.personaId = personaId;
        this.cant = cant;
    }

    public ReporteDTO() {
        super();
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public long getCant() {
        return cant;
    }

    public void setCant(long cant) {
        this.cant = cant;
    }
}
