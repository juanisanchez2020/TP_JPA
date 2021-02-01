import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Reporte1DAO extends Conexion{

    public List<Reporte1DTO> reporte1(int anio) {
        iniciarConexion();
        TypedQuery<Reporte1DTO> q = em.
                createQuery("SELECT new "
                                + "Reporte1DTO(p.id, count(*))"
                                + " FROM Libro l JOIN l.editores p"
                                + " WHERE l.anio = :anio"
                                + " GROUP BY p.id ",
                        Reporte1DTO.class);
        q.setParameter("anio", anio);
        List<Reporte1DTO> reporte =  q.getResultList();
        finalizarConexion();
        return reporte;
    }
}
