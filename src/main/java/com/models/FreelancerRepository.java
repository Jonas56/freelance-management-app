package com.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.beans.Freelancer;
import com.config.HibernateUtil;

public class FreelancerRepository {

    public FreelancerRepository() {
    }
    
    public boolean saveOrUpdateFreelancer(Freelancer freelancer) {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	Transaction tx = session.beginTransaction();
    	try{
            session.saveOrUpdate(freelancer);
            session.flush();
            tx.commit();
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
        }finally {
            session.close();
        }
        return false;
    }

    public boolean deleteFreelancer(String username){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			// TODO Handle Exception ???
			Freelancer freelancer = new Freelancer();
			freelancer.setUsername(username);
			session.delete(freelancer);
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

    public Freelancer getFreelancer(int id) {
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			Freelancer freelancer = session.get(Freelancer.class, id);
			session.flush();
			tx.commit();
			return freelancer;
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return null;
    }

    public List<Freelancer> getAllFreelancers() {
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			List<Freelancer> freelancers = new ArrayList<>();
			freelancers = session.createQuery("from freelancer").list();
			session.flush();
			tx.commit();
			return freelancers;
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return null;
    }

}
