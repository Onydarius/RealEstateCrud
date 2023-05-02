package com.onydarius.web.services;

import com.onydarius.web.controller.entity.Client;
import com.onydarius.web.repositories.IClientRepository;
import com.onydarius.web.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {
    @Autowired
    private IClientRepository repository;

    @Override
    public List<Client> listAllClient() {
        return repository.findAll();
    }

    public int save(Client client){
        int res = 0;

        Client client1 = repository.save(client);

        if (!client1.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {
        repository.deleteById((long) id);
    }


}
