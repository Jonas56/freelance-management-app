package com.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
public class Freelancer extends User {
	
	@OneToMany(mappedBy = "annonce", fetch = FetchType.EAGER)
	private List<Annonce> annonces;

	public Freelancer(int id, String name, String email, String password) {
		super(id, name, email, password);
	}

}
