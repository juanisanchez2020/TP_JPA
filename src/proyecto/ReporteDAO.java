import javax.persistence.TypedQuery;
import java.util.List;

public class ReporteDAO extends Conexion{

    public ReporteDAO(){
    }

    public List<Reporte1DTO> reporte1DTOs(int anio) {
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

    public List<Reporte2DTO> reporte2DTOs(int anio) {
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

    public List<Reporte3DTO> reporte3DTOs() {
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
