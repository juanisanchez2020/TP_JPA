import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public void iniciarConexion() {
        this.emf = Persistence.createEntityManagerFactory("Editorial");
        this.em = emf.createEntityManager();
    }

    public void finalizarConexion() {
        this.em.close();
        this.emf.close();
    }


}
