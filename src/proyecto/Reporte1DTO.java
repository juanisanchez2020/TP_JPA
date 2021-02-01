import java.io.Serializable;

public class Reporte1DTO extends ReporteDTO implements Serializable {
    private int anio;

    public Reporte1DTO(int personaId, long cant) {
        super(personaId, cant);
    }

    public Reporte1DTO() {
        super();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Reporte1 [personaId=" + getPersonaId() +
                ", Cantidad de libros editados= " + getCant() + "]";
    }
}
