import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Crea el Entity manager factory con la configuración
        //llamada editorial

        Reporte1DAO reporte1 = new Reporte1DAO();
        List<Reporte1DTO> reporte1DTOs = reporte1.reporte1(2017);
        reporte1DTOs.forEach(r -> System.out.println(r));

        Reporte2DAO reporte2 = new Reporte2DAO();
        List<Reporte2DTO> reporte2DTOs = reporte2.reporte2(2017);
        reporte2DTOs.forEach(r -> System.out.println(r));

        Reporte3DAO reporte3 = new Reporte3DAO();
        List<Reporte3DTO> reporte3DTOs = reporte3.reporte3();
        reporte3DTOs.forEach(r -> System.out.println(r));

//        List<Reporte2DTO> reporte2 = new Reporte2DAO().reporte2();
//        reporte2.forEach(r -> System.out.println(r));
//
//        List<Reporte3DTO> reporte3 = new Reporte3DAO().reporte3();
//        reporte3.forEach(r -> System.out.println(r));


//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
//        EntityManager em = emf.createEntityManager();
////
////        //REPORTE 1
////        em.getTransaction().begin();
////        TypedQuery<Reporte1DTO> q = em.
////                createQuery("SELECT new "
////                                + "Reporte1DTO(p.id, count(*))"
////                                + " FROM Libro l JOIN l.editores p"
////                                + " WHERE l.anio = :anio"
////                                + " GROUP BY p.id ",
////                        Reporte1DTO.class);
////        q.setParameter("anio", 2017);
////        List<Reporte1DTO> res = q.getResultList();
//////Imprime los resultados
////        res.forEach(r -> System.out.println(r));
////        em.getTransaction().commit();
////        em.close();
//
//
//        //REPORTE 1
//
//        //REPORTE 2
//
//        EntityManager em2 = emf.createEntityManager();
////        em2.getTransaction().begin();
////        TypedQuery<Reporte2DTO> q2 = em2.
////                createQuery("SELECT new "
////                                + "Reporte2DTO(p.id, sum(c.paginas))"
////                                + " FROM Libro l JOIN l.capitulos c"
////                                + " JOIN c.revisor p"
////                                + " WHERE l.anio = :anio"
////                                + " GROUP BY p.id ",
////                        Reporte2DTO.class);
////        q2.setParameter("anio", 2017);
////        List<Reporte2DTO> res2 = q2.getResultList();
////        //Imprime los resultados
////        res2.forEach(r -> System.out.println(r));
////        em2.getTransaction().commit();
////        em2.close();
//        //REPORTE 2
//
//
//        //REPORTE 3
//        em2 = emf.createEntityManager();
//        em2.getTransaction().begin();
//        TypedQuery<Reporte3DTO> q3 = em2.
//                createQuery("SELECT new "
//                                + "Reporte3DTO(p.id, count(*))"
//                                + " FROM Libro l JOIN l.capitulos c"
//                                + " JOIN c.autores p"
//                                + " GROUP BY p.id ",
//                        Reporte3DTO.class);
////        q3.setParameter("anio", 2017);
//        List<Reporte3DTO> res3 = q3.getResultList();
//        //Imprime los resultados
//        res3.forEach(r -> System.out.println(r));
//        em2.getTransaction().commit();
//        em2.close();
//
//        emf.close();

//        em.getTransaction().begin();
//        //Libros unidos con personas,
//        //Donde el año es un placeholder
//        //agrupados por id de persona, contar los libros.
//        Query q = em.
//                createQuery("SELECT p.id, count(*)"
//                        + " FROM Libro l JOIN l.editores p"
//                        + " WHERE l.anio = :anio"
//                        + " GROUP BY p.id ");
//        q.setParameter("anio", 2017);
//        //Es unchecked porque getResultList retorna una lista
//        @SuppressWarnings("unchecked")
//        List<Object[]> res = q.getResultList();
//        //Imprime los resultados
//        res.forEach(r -> System.out.println(r[0] +": "+r[1]));
//        em.getTransaction().commit();
//        em.close();
//        emf.close();


        //Inicia la transacción con la DBs
        //Persiste una persona
        //Hace el commit
//        em.getTransaction().begin();
//        em.persist(new Persona("Maria", "DB", "maria@db.com"));
//        em.getTransaction().commit();
//        em.close();

//        //Inicio otra session
//        em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        //Pregunto por todas las Personas. Persona en este caso
//        //es la clase Persona, ya que la query es sobre JPQL
//        TypedQuery<Persona> qp = em.createQuery("SELECT p FROM Libros p", Persona.class);
//        for (Persona p: qp.getResultList()) {
//            System.out.println(p.getId() + " " + p.getNombre() + " " + p.getApellido() + " " + p.getMail());
//        }
//        em.getTransaction().commit();
//        em.close();
//        emf.close();
    }
}
