package com.onydarius.web.services;

import com.onydarius.web.entities.Deposit;
import com.onydarius.web.entities.Phone;
import com.onydarius.web.repositories.IDepositRepository;
import com.onydarius.web.repositories.IPhoneRepository;
import com.onydarius.web.services.interfaces.IDepositService;
import com.onydarius.web.services.interfaces.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService implements IPhoneService {
    @Autowired
    private IPhoneRepository repository;

    @Override
    public List<Phone> listAllPhones() {
        return repository.findAll();
    }

    @Override
    public int save(Phone phone) {
        int res = 0;

        Phone tmp = repository.save(phone);

        if (!tmp.equals(null))
            res=1;

        return res;
    }

    @Override
    public void delete(long id) {
        repository.deleteById((long) id);
    }

}
