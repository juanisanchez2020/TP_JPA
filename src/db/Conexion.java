import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class Conexion {

    protected static EntityManagerFactory emf = null;

    public static EntityManager createEntityManager() {
        emf = Persistence.createEntityManagerFactory("Editorial");
        return emf.createEntityManager();
    }

    public static void closeEMF(){
        emf.close();
    }
//    public void iniciarConexion() {
//        this.emf = Persistence.createEntityManagerFactory("Editorial");
//        this.em = emf.createEntityManager();
//
//    }
//
//    public void finalizarConexion() {
//        this.em.close();
//        this.emf.close();
//    }


}
