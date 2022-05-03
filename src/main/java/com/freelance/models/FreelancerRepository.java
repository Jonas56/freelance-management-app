package com.freelance.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.PersistenceException;

import com.freelance.beans.Freelancer;
import com.freelance.config.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FreelancerRepository extends CrudRepository<Freelancer, Integer> implements IFreelanceRepository {

	public FreelancerRepository() {
		super(Freelancer.class);
	}

}
