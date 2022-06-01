package com.freelance.models;

import com.freelance.beans.Client;

import java.util.List;

public interface IClientRepository {
    public boolean saveOrUpdate(Client client);
    public List<Client> findAll();
    public Client findById(Integer id);
    public  boolean delete(Client client);
    public boolean update(Client client);
}
