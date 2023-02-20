package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Transfer;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {
    
}
