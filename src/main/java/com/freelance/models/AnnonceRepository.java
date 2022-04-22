package com.freelance.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import com.freelance.beans.Annonce;
import com.freelance.config.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AnnonceRepository {

	public AnnonceRepository() {
	}

	public boolean saveOrUpdateAnnonce(Annonce annonce) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.saveOrUpdate(annonce);
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

	public boolean deleteAnnonce(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			// TODO Handle Exception ???
			Annonce annonce = new Annonce();
			annonce.setId(id);
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

	public Annonce getAnnonce(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			Annonce annonce = session.get(Annonce.class, id);
			session.flush();
			tx.commit();
			return annonce;
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Annonce> getAllAnnonce() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			List<Annonce> announces = new ArrayList<>();
			announces = session.createQuery("from annonce").list();
			session.flush();
			tx.commit();
			return announces;
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return null;
	}

}
