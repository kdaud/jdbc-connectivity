package com.coders.software.programming;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static {
		System.out.println("Programming is my treasure" + "" + "\n===============+++++++++===");
	}
    public static void main( String[] args )
    {
		Student obj1 = new Student();
		obj1.setRollno(2002);
		obj1.setName("Joel");
		obj1.setForm("Form 5");
		obj1.setEligibility(true);
		
		Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(obj1);
		transaction.commit();
    }
}
