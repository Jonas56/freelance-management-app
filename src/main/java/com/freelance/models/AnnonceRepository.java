package com.freelance.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import com.freelance.beans.Annonce;
import com.freelance.config.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AnnonceRepository extends CrudRepository<Annonce, Integer> implements IAnnonceRepository {

    public AnnonceRepository() {
        super(Annonce.class);
    }


}
