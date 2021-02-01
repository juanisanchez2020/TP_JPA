public class Reporte2DTO extends ReporteDTO{
    private int año;

   public Reporte2DTO(int personaId, long cantPagRevisadas) {
       super(personaId, cantPagRevisadas);
   }

    @Override
    public String toString() {
       return "Reporte2DTO [personaId=" + getPersonaId() +
               ", Cantidad de paginas revisadas en año=" + getCant() + " ]";
    }
}
