package com.onydarius.web.repositories;

import com.onydarius.web.entities.Pucharse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPucharseRepository extends JpaRepository<Pucharse, Long> {
}
