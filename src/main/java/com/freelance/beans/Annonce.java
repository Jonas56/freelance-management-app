package com.freelance.beans;

import java.io.Serializable;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Annonce implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2268692178986884414L;
	
	@Id
	private int id;
	private String titre;
	private String description;
	private LinkedList<String> imagesList;
	 @ManyToOne
	 @JoinColumn(name = "freelancer_id")
	 private Freelancer freelancer;
	
	public Annonce() {
	}
	
	public Annonce(int id, String titre, String description, LinkedList<String> imagesList) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.imagesList = imagesList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LinkedList<String> getImagesList() {
		return imagesList;
	}

	public void setImagesList(LinkedList<String> imagesList) {
		this.imagesList = imagesList;
	}

	
	
	
}
