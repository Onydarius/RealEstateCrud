package com.onydarius.web.controller;

import com.onydarius.web.controller.entity.Client;
import com.onydarius.web.repository.IClientRepo;
import com.onydarius.web.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @Autowired
    private IClientService service;

    @GetMapping({"/Client","/"})
    public  String listClient(Model model){
        model.addAttribute("Clients", service.listAllClient());
        return "Client";
    }

    @GetMapping("/Client/new")
    public String createNewClientForm(Model model){
        Client client = new Client();
        model.addAttribute("Client", client);
        return "create_client";
    }
}
