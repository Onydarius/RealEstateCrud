package com.onydarius.web.service;

import com.onydarius.web.controller.entity.Client;
import com.onydarius.web.repository.IClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{
    @Autowired
    private IClientRepo repository;

    @Override
    public List<Client> listAllClient() {
        return repository.findAll();
    }
}
