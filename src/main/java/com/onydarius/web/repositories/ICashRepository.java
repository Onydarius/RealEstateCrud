package com.onydarius.web.repositories;

import com.onydarius.web.entities.Cash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICashRepository extends JpaRepository<Cash,Long> {
}
