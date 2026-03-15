package com.capgemini.com.Employee_Nest;

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
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmployeeNestDb");
        EntityManager em=emf.createEntityManager();
        try {
        	Department dept=new Department("Engineering","Banglore");
        	List<Employee> employees=new ArrayList<>();
        	Employee emp1=new Employee("Madhan","Software Developer",5678569.8,dept);
        	Employee emp2=new Employee("madson","Software Developer",5678569.8,dept);
        	Employee emp3=new Employee("nothing","Software Developer",5678569.8,dept);
        	Employee emp4=new Employee("everything","Software Developer",5678569.8,dept);
        	Employee emp5=new Employee("anything","Software Developer",5678569.8,dept);
        	employees.add(emp1);
        	employees.add(emp2);
        	employees.add(emp3);
        	employees.add(emp4);
        	employees.add(emp5);
        	dept.setEmp(employees);
        	em.getTransaction().begin();
        	em.persist(dept);
        	em.getTransaction().commit();
        	System.out.println("Employees are inserted sucessfully in department");
        	Department d=em.find(Department.class, dept.getDeptId());
        	System.out.println(d);
        }
        finally {
        	em.close();
        	emf.close();
        }
    }
}
