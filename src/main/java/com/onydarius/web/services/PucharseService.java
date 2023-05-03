package com.onydarius.web.services;

import com.onydarius.web.entities.PlotOwners;
import com.onydarius.web.entities.Pucharse;
import com.onydarius.web.repositories.IPlotOwnersRepository;
import com.onydarius.web.repositories.IPucharseRepository;
import com.onydarius.web.services.interfaces.IPlotOwnersService;
import com.onydarius.web.services.interfaces.IPurcharseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PucharseService implements IPurcharseService {
    @Autowired
    private IPucharseRepository repository;

    @Override
    public List<Pucharse> listAllPucharses() {
        return repository.findAll();
    }

    @Override
    public int save(Pucharse pucharse) {
        int res = 0;

        Pucharse tmp = repository.save(pucharse);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {
        repository.deleteById((long) id);
    }

}
