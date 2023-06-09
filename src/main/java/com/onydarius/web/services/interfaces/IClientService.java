package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.Client;

import java.util.List;

public interface IClientService {
    public List<Client> listAllClient();

    int save(Client client);

    void delete(long id);

    Client findById(long id);
}
