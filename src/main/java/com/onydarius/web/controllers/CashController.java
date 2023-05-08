package com.onydarius.web.controllers;

import com.onydarius.web.entities.Cash;
import com.onydarius.web.services.interfaces.ICashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CashController {

    @Autowired
    private ICashService service;

    @GetMapping({"/Sell","/sell"})
    public  String listAllCash(Model model){
        model.addAttribute("Cash", service.listAllCash());
        return "Sell";
    }

    @PostMapping("/Cash/Save")
    public  String saveCash(@Validated Cash cash, Model model){
        service.save(cash);
        return "redirect:/Clients";
    }


    @GetMapping("Cash/delete/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/Clients";

    }
}
