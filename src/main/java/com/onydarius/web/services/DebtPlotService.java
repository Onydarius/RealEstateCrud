package com.onydarius.web.services;

import com.onydarius.web.entities.DebtPlot;
import com.onydarius.web.repositories.IDebtPlotRepository;
import com.onydarius.web.services.interfaces.IDebtPlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtPlotService implements IDebtPlotService {
    @Autowired
    private IDebtPlotRepository repository;

    @Override
    public List<DebtPlot> listAllDebtPlot() {
        return repository.findAll();
    }
    
    @Override
    public int save(DebtPlot debtPlot) {
        int res = 0;

        DebtPlot tmp = repository.save(debtPlot);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {

        repository.deleteById((long) id);
    }


}
