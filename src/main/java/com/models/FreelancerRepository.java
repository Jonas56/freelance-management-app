package com.models;

import java.util.List;

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
            session.flush() ;
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
		return false;
    }

    public Freelancer getFreelancer(String username) {
		return null;
    }

    public List<Freelancer> getAllFreelancers() {
		return null;
    }

    public int countFreelancers(){
		return 0;
    }
}
