package com.onydarius.web.repositories;

import com.onydarius.web.entities.DebtPay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDebtPayRepository extends JpaRepository<DebtPay, Long> {
}
