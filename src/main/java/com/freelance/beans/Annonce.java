package com.freelance.beans;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "annonces")
public class Annonce implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotEmpty
    private String titre;
    @NotEmpty
    private String description;

    @OneToMany(mappedBy = "annonce", fetch = FetchType.EAGER)
    private List<AnnonceImage> annonceImages;


    @ManyToOne
    @JoinColumn(name = "freelancer_id", referencedColumnName = "id")
    private Freelancer freelancer;

    public Annonce() {
    }

    public Annonce(String titre, String description, LinkedList<AnnonceImage> annonceImages) {
        this.titre = titre;
        this.description = description;
        this.annonceImages = annonceImages;
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

    public List<AnnonceImage> getAnnonceImages() {
        return annonceImages;
    }

    public void setAnnonceImages(List<AnnonceImage> annonceImages) {
        this.annonceImages = annonceImages;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

}
