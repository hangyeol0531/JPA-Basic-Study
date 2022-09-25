package hellpjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            Movie movie = new Movie();
            movie.setName("안녕하세요");
            movie.setPrice(10000);
            movie.setDirector("한결");
            movie.setActor("정결");

            em.persist(movie);

            em.flush();
            em.clear();

            Movie findMove = em.find(Movie.class, movie.getId());
            System.out.println("findMove = " + findMove);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
