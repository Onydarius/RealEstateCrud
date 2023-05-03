package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.Cash;

import java.util.List;

public interface ICashService {
    public List<Cash> listAllCash();

    int save(Cash cash);

    void delete(long id);
}
