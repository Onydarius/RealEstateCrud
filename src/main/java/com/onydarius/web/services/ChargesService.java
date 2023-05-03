package com.onydarius.web.services;

import com.onydarius.web.entities.Charges;
import com.onydarius.web.repositories.IChargesRepository;
import com.onydarius.web.services.interfaces.IChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargesService implements IChargesService {
    @Autowired
    private IChargesRepository repository;

    @Override
    public List<Charges> listAllCharges() {
        return null;
    }

    @Override
    public int save(Charges charges) {
        int res = 0;

        Charges tmp = repository.save(charges);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {

        repository.deleteById((long) id);
    }


}
