package com.freelance.models;

import com.freelance.beans.Annonce;

public class AnnonceRepository extends CrudRepository<Annonce, Integer> implements IAnnonceRepository {

    public AnnonceRepository() {
        super(Annonce.class);
    }


}
