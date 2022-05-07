package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.beans.Freelancer;

import java.util.List;

public interface IFreelanceRepository {

    public boolean saveOrUpdate(Freelancer freelancer);

    public List<Freelancer> findAll();

    public Freelancer findById(Integer id);

    public boolean delete(Freelancer freelancer);
}
