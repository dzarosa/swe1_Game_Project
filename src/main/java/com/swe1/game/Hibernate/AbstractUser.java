package com.swe1.game.Hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

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
 *  Given would be Vehicle in Form of the List most important command sessionFactory.getCurrentSession().createQuery("from " + user.getName()).list()
 *  because it take Data direkt from Tabel vehicle vehicle.getName()
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
     * Deleteing User form Database if Currentent Session is still aktiv than begint Database transaktion
     * Vehicle woud be deleten and the it would be checked if this transaction was successfully committed.
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
 * Adding User to Database if Currentent Session is still aktiv than begint Database transaktion
 * Vehicle would be added and the it would be checked if this transaction was successfully committed.
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
     * It shoud get a Vehicle from Database direcly by name but at this moment doesn't working 
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