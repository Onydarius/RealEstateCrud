package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.PlotOwners;

import java.util.List;

public interface IPlotOwnersService {
    public List<PlotOwners> listAllPlotOwners();

    int save(PlotOwners plotOwners);

    void delete(long id);
}
