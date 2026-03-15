package Library_management.Email_Mangement;

import java.util.*;

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
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("GmailDb");
        EntityManager em=emf.createEntityManager();
        try {
        	User user=new User();
        	user.setName("Max");
        	Set<String> emails=new HashSet<>();
        	emails.add("max@gmail.com");
        	emails.add("lucas@gmail.com");
        	emails.add("madson@gmail.com");
        	user.setEmails(emails);
        	em.getTransaction().begin();
        	em.persist(user);
        	em.getTransaction().commit();
        	System.out.println("User saved successfully");
        	//to fetch the users
        	User fetchedUser=em.find(User.class, user.getUserId());
        	System.out.println(fetchedUser.getName());
        	System.out.println(fetchedUser.getEmails());
        }
        finally {
        	em.close();
        	emf.close();
        }
    }
}
