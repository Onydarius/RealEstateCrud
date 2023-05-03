package com.onydarius.web.services;

import com.onydarius.web.entities.Client;
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
    public List<Plot> listAllPlots() {
        return repository.findAll();
    }

    @Override
    public int save(Plot plot) {
        int res = 0;

        Plot plotTemp = repository.save(plot);

        if (!plotTemp.equals(null))
            res=1;

        return res;    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
