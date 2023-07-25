package com.onydarius.web.controllers;

import com.onydarius.web.services.CashService;
import com.onydarius.web.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private CashService cashService;


    @GetMapping({"/","/dashboard","/Dashboard"})
    public  String dashboard(Model model){
        model.addAttribute("Clients", clientService.listAllClient());
        model.addAttribute("Cash", cashService.listAllCash());
        model.addAttribute("totalClients", 0);
        model.addAttribute("totalCash", 0);

        return "dashboard";
    }
}
