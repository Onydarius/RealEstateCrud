package com.onydarius.web.services;

import com.onydarius.web.entities.Phone;
import com.onydarius.web.entities.PlotOwners;
import com.onydarius.web.repositories.IPhoneRepository;
import com.onydarius.web.repositories.IPlotOwnersRepository;
import com.onydarius.web.services.interfaces.IPhoneService;
import com.onydarius.web.services.interfaces.IPlotOwnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlotOwnersService implements IPlotOwnersService {
    @Autowired
    private IPlotOwnersRepository repository;

    @Override
    public List<PlotOwners> listAllPlotOwners() {
        return repository.findAll();
    }

    @Override
    public int save(PlotOwners plotOwners) {
        int res = 0;

        PlotOwners tmp = repository.save(plotOwners);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {
        repository.deleteById((long) id);
    }

}
