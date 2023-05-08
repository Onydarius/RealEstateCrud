package com.onydarius.web.controllers;

import com.onydarius.web.entities.Phone;
import com.onydarius.web.services.PhoneService;
import com.onydarius.web.services.interfaces.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PhoneController {

    @Autowired
    private PhoneService service;

    @GetMapping("/phone")
    public String listAllPhones(){
        System.out.println(service.listAllPhones());
        return "Client";
    }

}
