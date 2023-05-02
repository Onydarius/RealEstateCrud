package com.onydarius.web.services;

import com.onydarius.web.entities.Client;

import java.util.List;

public interface IClientService {
    public List<Client> listAllClient();

    int save(Client client);

    void delete(long id);
}
