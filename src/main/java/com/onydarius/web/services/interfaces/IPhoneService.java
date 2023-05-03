package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.Phone;

import java.util.List;

public interface IPhoneService {
    public List<Phone> listAllPhones();

    int save(Phone phone);

    void delete(long id);
}
