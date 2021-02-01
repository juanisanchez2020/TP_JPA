import java.io.Serializable;

public class Reporte2DTO extends ReporteDTO implements Serializable {
    private int anio;

   public Reporte2DTO(int personaId, long cantPagRevisadas) {
       super(personaId, cantPagRevisadas);
   }

    @Override
    public String toString() {
       return "Reporte2DTO [personaId=" + getPersonaId() +
               ", Cantidad de paginas revisadas en año=" + getCant() + " ]";
    }
}
