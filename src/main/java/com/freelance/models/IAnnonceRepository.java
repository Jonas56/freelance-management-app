package com.freelance.models;

import com.freelance.beans.Annonce;

import java.util.List;

public interface IAnnonceRepository {

    public boolean saveOrUpdate(Annonce annonce);

    public List<Annonce> findAll();

    public Annonce findById(Integer id);

    public boolean deleteAnnonce(Integer id);
}
