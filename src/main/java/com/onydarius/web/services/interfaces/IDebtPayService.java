package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.DebtPay;

import java.util.List;

public interface IDebtPayService {
    public List<DebtPay> listAllDebtPay();

    int save(DebtPay debtPay);

    void delete(long id);
}
