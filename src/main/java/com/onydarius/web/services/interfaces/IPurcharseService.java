package com.onydarius.web.services.interfaces;

import com.onydarius.web.entities.Pucharse;

import java.util.List;

public interface IPurcharseService {
    public List<Pucharse> listAllPucharses();

    int save(Pucharse pucharse);

    void delete(long id);
}
