package com.test.find;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.find.entity.StudentEntity;


public class StudentPersist 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_Find");  
         EntityManager em=emf.createEntityManager();  
           
       
           
         StudentEntity s=em.find(StudentEntity.class,102);  
           
         System.out.println("Student id = "+s.getId());  
         System.out.println("Student Name = "+s.getName());  
         System.out.println("Student Age = "+s.getAge());  
           
     }  
    }

