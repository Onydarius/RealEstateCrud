package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.Charges;
import java.util.List;

public interface IChargesService {
    public List<Charges> listAllCharges();

    int save(Charges charges);

    void delete(long id);
}
