package com.onydarius.web.repositories;

import com.onydarius.web.entities.PlotOwners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlotOwnersRepository extends JpaRepository<PlotOwners,Long> {

}
