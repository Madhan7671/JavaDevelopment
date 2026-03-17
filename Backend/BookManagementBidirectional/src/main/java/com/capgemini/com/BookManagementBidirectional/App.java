package com.capgemini.com.BookManagementBidirectional;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("AuthorDb");
       EntityManager em=emf.createEntityManager();
       try {
    	   Author a1=new Author("Aditya");
    	   Author a2=new Author("Aryan");
    	   Book b1=new Book("Nothing");
    	   Book b2=new Book("Everything");
    	   Book b3=new Book("anything");
    	   Book b4=new Book("Everything");
    	   b1.getAuthor().add(a1);
    	   b2.getAuthor().add(a1);
    	   b3.getAuthor().add(a2);
    	   b4.getAuthor().add(a2);
    	   a1.getBook().add(b1);
    	   a1.getBook().add(b2);
    	   a2.getBook().add(b3);
    	   a2.getBook().add(b4);
    	   em.getTransaction().begin();
    	   em.persist(a1);
    	   em.persist(a2);
    	   em.getTransaction().commit();
    	   System.out.println("Data entered successfully");
    	   System.out.println(em.find(Author.class, a1.getAuthorId()));
    	   }
       finally {
    	   em.close();
    	   emf.close();
       }
    }
}
