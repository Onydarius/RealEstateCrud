package com.onydarius.web.controllers;

import com.onydarius.web.services.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlotController {

    @Autowired
    private PlotService service;
    @GetMapping({"/Plots","/plots"})
    public String getAllPlots(Model model){
        model.addAttribute("Plots", service.listAllPlot());
        return "Plots";
    }
}
