package Library_management.com.capgemini.com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("libraryPU");
       EntityManager em=emf.createEntityManager();
       EntityTransaction tx=em.getTransaction();
       
       tx.begin();
       Book b1=new Book("Harry-portor","Jk-rowling","magic",1289.09,"finished","21-02-2004");
       Book b2=new Book("Harry-portor","Jk-rowling","magic",1289.09,"finished","21-02-2004");
       Book b3=new Book("Harry-portor","Jk-rowling","magic",1289.09,"finished","21-02-2004");
       em.persist(b1);
       em.persist(b2);
       em.persist(b3);
       tx.commit();
       System.out.println("Books are inserted");
       
       //to read the specific book
       Book b=em.find(Book.class,1);
       System.out.println(b);
       
       //to fetch the all books
       TypedQuery<Book> query=em.createQuery("Select b from Book b",Book.class);
       List<Book> ans=query.getResultList();
       for(Book bx:ans)
       {
    	   System.out.println(bx);
       }
       //update the book
       tx.begin();
       Book f=em.find(Book.class,1);
       System.out.println(f);
       f.setGenere("romance");
       tx.commit();
       
       //delete book
       tx.begin();
       Book del=em.find(Book.class, 1);
       em.remove(del);
       tx.commit();
       System.out.println("Book deleted");
       em.close();
       emf.close();
    }
}
