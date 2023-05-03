package com.onydarius.web.services;

import com.onydarius.web.entities.Cash;
import com.onydarius.web.repositories.ICashRepository;
import com.onydarius.web.services.interfaces.ICashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashService implements ICashService {
    @Autowired
    private ICashRepository repository;

    @Override
    public List<Cash> listAllCash() {
        return null;
    }

    @Override
    public int save(Cash cash) {
        int res = 0;

        Cash tmp = repository.save(cash);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {
        repository.deleteById((long) id);
    }


}
