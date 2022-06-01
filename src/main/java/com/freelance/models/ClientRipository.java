package com.freelance.models;

import com.freelance.beans.Client;

public class ClientRipository extends CrudRepository<Client, Integer > implements IClientRepository {
    protected ClientRipository() {
        super(Client.class);
    }
}
