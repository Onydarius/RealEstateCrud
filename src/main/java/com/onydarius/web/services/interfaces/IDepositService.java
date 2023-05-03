package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.Deposit;

import java.util.List;

public interface IDepositService {
    public List<Deposit> listAllDeposit();

    int save(Deposit deposit);

    void delete(long id);
}
