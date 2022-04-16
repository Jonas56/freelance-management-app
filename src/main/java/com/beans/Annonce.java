package com.beans;

import java.util.LinkedList;
import javax.persistence.*;

@Entity
public class Annonce {

	@Id
	private int id;
	private String titre;
	private String description;
	private LinkedList<String> imagesList;
	@ManyToOne
	@JoinColumn(name = "freelancer_id")
	private Freelancer freelancer;
	
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
