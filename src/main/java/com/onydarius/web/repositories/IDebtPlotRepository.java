package com.onydarius.web.repositories;

import com.onydarius.web.entities.DebtPlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDebtPlotRepository extends JpaRepository<DebtPlot,Long> {
}
