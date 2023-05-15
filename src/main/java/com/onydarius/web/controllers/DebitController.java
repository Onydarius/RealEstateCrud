package com.onydarius.web.controllers;

import com.onydarius.web.entities.Cash;
import com.onydarius.web.entities.DebtPlot;
import com.onydarius.web.services.interfaces.ICashService;
import com.onydarius.web.services.interfaces.IClientService;
import com.onydarius.web.services.interfaces.IDebtPlotService;
import com.onydarius.web.services.interfaces.IPlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DebitController {

    @Autowired
    private IDebtPlotService debtService;

    @Autowired
    private IClientService clientService;

    @Autowired
    private IPlotService plotService;




    @GetMapping({"/Debit","/debit"})
    public  String listAllDebit(Model model){
        model.addAttribute("Plots", plotService.listAllPlots());
        model.addAttribute("Debts", debtService.listAllDebtPlot());
        return "Debit";
    }

    @GetMapping({"/finance","/finance"})
    public  String financePlot(Model model){
        model.addAttribute("Plots", plotService.listAllPlots());
        model.addAttribute("Debts", debtService.listAllDebtPlot());
        return "finance";
    }


}
