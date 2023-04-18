package com.onydarius.web.repository;

import com.onydarius.web.controller.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepo extends JpaRepository<Client,Long> {
}
