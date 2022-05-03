package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.config.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.PersistenceException;
import java.io.Serializable;
import java.util.List;

public abstract class  CrudRepository<U, ID> {

    private final Class<U> clazz;

    protected CrudRepository(Class<U> clazz) {
        this.clazz = clazz;
    }


    public boolean saveOrUpdate(U entity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.saveOrUpdate(entity);
            session.flush();
            tx.commit();
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            session.close();
        }
        return false;
    }

    public List<U> findAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            List<U> rows;
            rows = session.createQuery("from "+ clazz.getName()).list();
            session.flush();
            tx.commit();
            return rows;
        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            session.close();
        }
        return null;
    }

    public  U findById(ID id){
        // TODO: Handle Integer type exception
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            U row = (U) session.get(clazz, (Integer) id);
            session.flush();
            tx.commit();
            return row;
        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            session.close();
        }
        return null;
    }

    public boolean deleteAnnonce(ID id){
        // TODO: Handle Integer type exception
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            Annonce annonce = new Annonce();
            annonce.setId((Integer) id);
            session.delete(annonce);
            session.flush();
            tx.commit();
            return true;
        } catch (PersistenceException e) {
            e.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            session.close();
        }
    }


}