import java.io.Serializable;

public class Reporte2DTO extends ReporteDTO implements Serializable {
    private int anio;  //TODO : ver que hacer con el año

    public Reporte2DTO() {}

   public Reporte2DTO(int personaId, long cantPagRevisadas) {
       super(personaId, cantPagRevisadas);
   }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
       return "Reporte2DTO [personaId=" + getPersonaId() +
               ", Cantidad de paginas revisadas en año=" + getCant() + " ]";
    }
}
