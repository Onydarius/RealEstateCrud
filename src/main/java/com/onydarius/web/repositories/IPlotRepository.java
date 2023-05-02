package com.onydarius.web.repositories;

import com.onydarius.web.entities.Plot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlotRepository extends JpaRepository<Plot,Long> {
}
