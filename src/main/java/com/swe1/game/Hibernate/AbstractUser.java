package com.swe1.game.Hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
/**
 * 
 * @author Dariusz Zarosa 0452351
 * Erstellt Anhand von DSE 2016 Übung TeamProjekt (Restfulservices mit Hibernate bei dem Projekt  wurden von mir erstellt)
 * 
 * 
 */
@SuppressWarnings("unchecked")
public abstract class AbstractUser<GameMaster> {

	
    private Class<GameMaster> user;
    protected final SessionFactory sessionFactory = HibernateConnection
            .getSessionFactory();

    public AbstractUser(Class<GameMaster> user) {
        this.user = user;
    }

    public AbstractUser() {
    }
/**
 *  Get All Users form Database if Currentent Session is still aktiv than begint Database transaktion
 *  Given would be User in Form of the List most important command sessionFactory.getCurrentSession().createQuery("from " + user.getName()).list()
 *  because it take Data direct from table GameMaster user.getName()
 * @return
 */
    public List<GameMaster> getAllUsers() {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            return sessionFactory.getCurrentSession().createQuery("from " + user.getName()).list();
        } catch (RuntimeException exp) {
            return null;
        }
    }

    /**
     * 
     * @param instance
     * Delete User form Database if Current Session is still active than begin Database transaction
     * User would be deleted and the it would be checked if this transaction was successfully committed.
     * By Exception
     *  Force the underlying transaction to roll back.
     */
    
    public void deleteUser(GameMaster instance) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            sessionFactory.getCurrentSession().delete(instance);
            sessionFactory.getCurrentSession().getTransaction().commit();
        } catch (RuntimeException exp) {
            sessionFactory.getCurrentSession().getTransaction().rollback();
            throw exp;
        }
    }
/**
 * 
 * @param instance
 * Adding User to Database if Current Session is still active than begin Database transaction
 * User would be added and the it would be checked if this transaction was successfully committed.
 * By Exception
 *  Force the underlying transaction to roll back.
 */
    public void addUser(GameMaster instance) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            sessionFactory.getCurrentSession().persist(instance);
            sessionFactory.getCurrentSession().getTransaction().commit();
        
        } catch (RuntimeException re) {
            sessionFactory.getCurrentSession().getTransaction().rollback();
            throw re;
        }
    }
/**
 * GameUser will be Cast to Ssession Factor to get vehicle by primary Key
 * @param key
 * @return
 */
    
    public GameMaster getUserId(Object key) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            return (GameMaster) sessionFactory.getCurrentSession().get(user,(Serializable) key);
        } catch (RuntimeException exp) {
            return null;
        }
    }
    /**
     * It should get a Vehicle from Database direcly by name but at this moment doesn't working 
     * will be used for Search method 
     * @param brand
     * @return
     */
    public GameMaster getByName(String name) {
    	 try {
             if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                 sessionFactory.getCurrentSession().getTransaction().begin();            
             return (GameMaster) sessionFactory.getCurrentSession().get(user, name);
         } catch (RuntimeException exp) {
             return null;
         }
     }
    public void updateUser(GameMaster instance) {
    	try {
              if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                  sessionFactory.getCurrentSession().getTransaction().begin();  
              sessionFactory.getCurrentSession().update(instance);
              sessionFactory.getCurrentSession().getTransaction().commit();
          } catch (RuntimeException re) {
        	  sessionFactory.getCurrentSession().getTransaction().rollback();
              throw re;

    }
    } // class
}