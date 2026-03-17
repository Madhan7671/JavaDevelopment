package com.capgemini.com.UserManagement;

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
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("UserManagementDb");
        EntityManager em=emf.createEntityManager();
        try {
        	Role r1=new Role("Software Developer");
        	Role r2=new Role("Employee");
        	Role r3=new Role("Human");
        	Set<Role> roles=new HashSet<>();
        	roles.add(r1);
        	roles.add(r2);
        	roles.add(r3);
        	User u=new User("Madhan","madhan@gmail.com",roles);
        	em.getTransaction().begin();
        	em.persist(u);
        	em.getTransaction().commit();
        	System.out.println("Employee added sucessfully");
        	User user=em.find(User.class, u.getUId());
        	System.out.println(user);
        }
        finally {
        	em.close();
        	emf.close();
        }
    }
}
