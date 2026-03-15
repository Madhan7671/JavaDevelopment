package com.capgemini.com.Passport_Management;

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
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("PassportDb");
        EntityManager em=emf.createEntityManager();
        try {
        	Person person=new Person("Madhan","21022004");
        	Passport passport=new Passport("1234567","21022015","21022099",person);
        	person.setPassport(passport);
        	em.getTransaction().begin();
        	em.persist(person);
        	em.getTransaction().commit();
        	Person p=em.find(Person.class, person.getId());
        	System.out.println(p);
        }
        finally {
        	em.close();
        	emf.close();
        }
    }
}
