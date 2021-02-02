import java.io.Serializable;

public class Reporte1DTO extends ReporteDTO implements Serializable {
    private int anio;   //TODO : ver que hacer con el año

    public Reporte1DTO() {
        super();
    }

    public Reporte1DTO(int personaId, long cant) {
        super(personaId, cant);
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
