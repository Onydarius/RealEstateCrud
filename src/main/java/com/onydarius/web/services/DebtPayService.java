package com.onydarius.web.services;

import com.onydarius.web.entities.DebtPay;
import com.onydarius.web.repositories.IDebtPayRepository;
import com.onydarius.web.services.interfaces.IDebtPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtPayService implements IDebtPayService {
    @Autowired
    private IDebtPayRepository repository;

    @Override
    public List<DebtPay> listAllDebtPay() {
        return repository.findAll();
    }

    @Override
    public int save(DebtPay debtPay) {
        int res = 0;

        DebtPay tmp = repository.save(debtPay);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {
        repository.deleteById((long) id);
    }


}
