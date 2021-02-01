public class Reporte1DTO extends ReporteDTO{
    private int año;

    public Reporte1DTO(int personaId, long cant) {
        super(personaId, cant);
    }

    @Override
    public String toString() {
        return "Reporte1DTO [personaId=" + getPersonaId() +
                ", Cantidad de libros editados en año=" + getCant() + "]";
    }
}
