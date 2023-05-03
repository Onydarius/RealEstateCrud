package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.Plot;

import java.util.List;

public interface IPlotService {
    public List<Plot> listAllPlots();

    int save(Plot plot);

    void delete(long id);

}
