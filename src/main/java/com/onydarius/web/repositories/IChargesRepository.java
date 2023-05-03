package com.onydarius.web.repositories;

import com.onydarius.web.entities.Charges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChargesRepository extends JpaRepository<Charges,Long> {
}
