import javax.persistence.TypedQuery;
import java.util.List;

public class Reporte3DAO extends Conexion {

    public List<Reporte3DTO> reporte3() {
        iniciarConexion();

        TypedQuery<Reporte3DTO> q3 = em.
                createQuery("SELECT new "
                                + "Reporte3DTO(p.id, count(*))"
                                + " FROM Libro l JOIN l.capitulos c"
                                + " JOIN c.autores p"
                                + " GROUP BY p.id ",
                        Reporte3DTO.class);
        List<Reporte3DTO> res3 = q3.getResultList();
        finalizarConexion();
        return res3;
    }
}
