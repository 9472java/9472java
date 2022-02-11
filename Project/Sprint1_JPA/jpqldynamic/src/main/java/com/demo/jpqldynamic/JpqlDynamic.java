package com.demo.jpqldynamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.jpqldynamic.entity.StudentEntity;

public class JpqlDynamic 
{
    public static void main( String[] args )
    {
    	
    	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
    	    EntityManager em=emf.createEntityManager();  
    	      
    	 
    	    em.getTransaction().begin();
    	      
    	    StudentEntity s1=new StudentEntity();  
    	   // s1.setId(101);  
    	    s1.setName("RAJESH");  
    	    s1.setAge(24);  
    	      
    	    StudentEntity s2=new StudentEntity();  
    	   // s2.setId(102);  
    	    s2.setName("SHUBHAM");  
    	    s2.setAge(22);  
    	      
    	    StudentEntity s3=new StudentEntity();  
    	   // s3.setId(103);  
    	    s3.setName("GOVIND");  
    	    s3.setAge(26);  
    	      
    	    em.persist(s1);  
    	    em.persist(s2);  
    	    em.persist(s3);       

    	em.getTransaction().commit();

    	Query query=em.createQuery("select s from StudentEntity s");
    	List<StudentEntity> list= query.getResultList();
    	for (StudentEntity n :list) {
    		System.out.println(n.getAge() + n.getName());
    	}
    	
    	      
    	    emf.close();  
    	    em.close();  
    	 
    }
}