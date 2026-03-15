package Employe_Locker;

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
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmployeeDb");
        EntityManager em=emf.createEntityManager();
        try {
        	Locker locker=new Locker("123456","23");
        	Employee emp=new Employee("madhan","Software",locker);
        	em.getTransaction().begin();
        	em.persist(emp);
        	em.getTransaction().commit();
        	
        	Employee e=em.find(Employee.class, emp.getEmpId());
        	System.out.println(e);
        	System.out.println("Employee saved sucessfully created");
        }
        finally {
        	em.close();
        	emf.close();
        }
    }
}
