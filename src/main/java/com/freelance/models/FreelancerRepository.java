package com.freelance.models;

import com.freelance.beans.Freelancer;

public class FreelancerRepository extends CrudRepository<Freelancer, Integer> implements IFreelanceRepository {

	public FreelancerRepository() {
		super(Freelancer.class);
	}

}
