package com.freelance.beans;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "annonce_images")
public class AnnonceImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Column(name = "image_link")
    private String imageLink;

    @ManyToOne
    @JoinColumn(name = "annonce_id", referencedColumnName = "id")
    private Annonce annonce;

    public AnnonceImage() {
    }

    public AnnonceImage(String imageLink) {
        this.imageLink = imageLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }
}
