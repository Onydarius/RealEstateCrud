package com.onydarius.web.services;

import com.onydarius.web.entities.Plot;
import com.onydarius.web.repositories.IPlotRepository;

import com.onydarius.web.services.interfaces.IPlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlotService implements IPlotService {
    @Autowired
    IPlotRepository repository;

    @Override
    public List<Plot> listAllPlot() {
        return repository.findAll();
    }
}
