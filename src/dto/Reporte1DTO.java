import java.io.Serializable;

public class Reporte1DTO extends ReporteDTO implements Serializable {

    public Reporte1DTO(int personaId, long cant) {
        super(personaId, cant);
    }

    @Override
    public String toString() {
        return "Reporte1 [ personaId=" + getPersonaId() +
                ", Cantidad de libros editados= " + getCant() + " ]";
    }
}
