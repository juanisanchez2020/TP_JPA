import javax.persistence.TypedQuery;
import java.util.List;

public class Reporte2DAO extends Conexion{

    public List<Reporte2DTO> reporte2(int anio) {
        iniciarConexion();
        TypedQuery<Reporte2DTO> q2 = em.
                createQuery("SELECT new "
                                + "Reporte2DTO(p.id, sum(c.paginas))"
                                + " FROM Libro l JOIN l.capitulos c"
                                + " JOIN c.revisor p"
                                + " WHERE l.anio = :anio"
                                + " GROUP BY p.id ",
                        Reporte2DTO.class);
        q2.setParameter("anio", anio);
        List<Reporte2DTO> res2 = q2.getResultList();
        finalizarConexion();
        return res2;
    }
}
