package com.simplilearn.demo;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	static {
		
		try {
			
			StandardServiceRegistry registry= new StandardServiceRegistryBuilder().
					configure("hibernate.cfg.xml").build();
			 Metadata metadata= new MetadataSources(registry).getMetadataBuilder()
					 .build();
			 sessionFactory= metadata.getSessionFactoryBuilder().build();
		}
		catch(Exception e){
		  
		    e.printStackTrace();
		}

		
		
		
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;	
	}
	

}





/*package com.simplilearn.demo;


import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static SessionFactory factory;
	
	static {
		
		//1. Create the Configuration Object 
		Configuration cfg= new Configuration();
		
		//2. Call the configure method
		cfg=cfg.configure();
		
		//3. Through the Configuration object call the build session factory
		factory = cfg.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		return factory;
	}

	}
	

*/