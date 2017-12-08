package com.swe1.game.Hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 * 
 * @author Dariusz Zarosa 0452351
 * Hibernate Connection to gest Session Faktory  Template from 
 * https://netbeans.org/projects/samples/sources/samples-source-code/content/samples/javaee/DVDStoreEE6/src/java/dvdrental/HibernateUtil.java
 */
public class HibernateConnection {
	private static final SessionFactory sessionFactory;
    
    static {
        try {            
            sessionFactory = new AnnotationException().configure().buildSessionFactory();
        } catch (Throwable exeption) {
            System.err.println("SessionFactory creation failed." + exeption);
            throw new ExceptionInInitializerError(exeption);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

