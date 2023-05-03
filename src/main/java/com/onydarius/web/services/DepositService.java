package com.onydarius.web.services;

import com.onydarius.web.entities.Deposit;
import com.onydarius.web.repositories.IDepositRepository;
import com.onydarius.web.services.interfaces.IDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositService implements IDepositService {
    @Autowired
    private IDepositRepository repository;

    @Override
    public List<Deposit> listAllDeposit() {
        return repository.findAll();
    }

    @Override
    public int save(Deposit deposit) {
        int res = 0;

        Deposit tmp = repository.save(deposit);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {
        repository.deleteById((long) id);
    }


}
