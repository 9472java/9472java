package com.test.delete;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.delete.entity.StudentEntity;

public class PersistStudent 
{
    public static void main( String[] args )
    {
    	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
  	    EntityManager em=emf.createEntityManager();  
  	em.getTransaction().begin();  
  	  
      StudentEntity s=em.find(StudentEntity.class,101);  
  	em.remove(s);  
  	em.getTransaction().commit();  
  	emf.close();  
  	em.close();  
  	  
  	    }  
  	
    }

