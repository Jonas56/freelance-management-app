package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.beans.Mission;

import java.util.List;

public interface IMissionRepository {
    public boolean saveOrUpdate(Mission mission);

    public List<Mission> findAll();

    public Mission findById(Integer id);

    public boolean delete(Mission mission);

    public boolean update(Mission mission);

}
