package com.freelance.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
public class Freelancer extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7312823705228699573L;
	
	@OneToMany(mappedBy = "freelancer", fetch = FetchType.EAGER)
	private List<Annonce> annonces;

	public Freelancer(int id, String name, String email, String password) {
		super(id, name, email, password);
	}

	public Freelancer() {
	}

}
