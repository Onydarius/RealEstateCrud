package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.DebtPlot;

import java.util.List;

public interface IDebtPlotService {
    public List<DebtPlot> listAllDebtPlot();

    int save(DebtPlot debtPlot);

    void delete(long id);
}
