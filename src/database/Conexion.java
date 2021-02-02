import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Conexion {

    private static EntityManagerFactory emf = null;

    public static EntityManager createEntityManager() throws Exception {
        try{
            emf = Persistence.createEntityManagerFactory("Editorial");
            return emf.createEntityManager();
        } catch (Exception e) {
            throw new Exception("¡ Ocurrió un error ! " + e.getMessage());
        }
    }

    public static void closeEMF() throws Exception {
        try {
            emf.close();
        } catch (Exception e) {
            throw new Exception("¡ Ocurrió un error ! " + e.getCause());
        }
    }
}
