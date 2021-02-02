import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReporteDAO{

    public ReporteDAO() {}

    public List<Reporte1DTO> reporte1DTOs(int anio) throws Exception {
        EntityManager em = null;

        try{
            em = Conexion.createEntityManager();
//            iniciarConexion();
            TypedQuery<Reporte1DTO> q = em.
                    createQuery("SELECT new "
                                    + "Reporte1DTO(p.id, count(*))"
                                    + " FROM Libro l JOIN l.editores p"
                                    + " WHERE l.anio = :anio"
                                    + " GROUP BY p.id ",
                            Reporte1DTO.class);
            q.setParameter("anio", anio);
            return q.getResultList();
        }catch (Exception e) {
            throw e;
        }finally {
            em.close();
            Conexion.closeEMF();
            System.out.println("Se cierra la conexion");
//            finalizarConexion();
        }
    }

    public List<Reporte2DTO> reporte2DTOs(int anio) throws Exception{
        EntityManager em = null;

        try {
//            iniciarConexion();
            em = Conexion.createEntityManager();
            TypedQuery<Reporte2DTO> q2 = em.
                    createQuery("SELECT new "
                                    + "Reporte2DTO(p.id, sum(c.paginas))"
                                    + " FROM Libro l JOIN l.capitulos c"
                                    + " JOIN c.revisor p"
                                    + " WHERE l.anio = :anio"
                                    + " GROUP BY p.id ",
                            Reporte2DTO.class);
            q2.setParameter("anio", anio);
            return q2.getResultList();
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }finally {
            em.close();
            Conexion.closeEMF();
            System.out.println("Se cierra la conexion");
//            finalizarConexion();
        }
    }

    public List<Reporte3DTO> reporte3DTOs() throws Exception {
        EntityManager em = null;

        try {
//            iniciarConexion();
            em = Conexion.createEntityManager();
            TypedQuery<Reporte3DTO> q3 = em.
                    createQuery("SELECT new "
                                    + "Reporte3DTO(p.id, count(*))"
                                    + " FROM Libro l JOIN l.capitulos c"
                                    + " JOIN c.autores p"
                                    + " GROUP BY p.id ",
                            Reporte3DTO.class);
            return q3.getResultList();
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }finally {
            em.close();
            Conexion.closeEMF();
            System.out.println("Se cierra la conexion");
//            finalizarConexion();
        }
    }
}
