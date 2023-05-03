package com.onydarius.web.controllers;

import com.onydarius.web.entities.Client;
import com.onydarius.web.services.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    @Autowired
    private IClientService service;

    @GetMapping({"/Clients","/clients"})
    public  String listClient(Model model){
        model.addAttribute("Clients", service.listAllClient());
        model.addAttribute("Client", new Client());
        model.addAttribute("action",    "Save");
        return "Client";
    }

    @PostMapping("/Clients/Save")
    public  String saveClient(@Validated Client client, Model model){
        service.save(client);
        return "redirect:/Clients";
    }


    @GetMapping("Clients/delete/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/Clients";

    }
}
