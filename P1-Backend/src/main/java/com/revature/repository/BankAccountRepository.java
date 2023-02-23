package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.model.BankAccount;

public interface BankAccountRepository extends 
JpaRepository<BankAccount, Integer> {
    //need to keep track of deposits, withdrawls, and account owners
    //need to ask user what kind of account they would like to open
    //deposits/withdrawls will need make use of joins
    
    //this one tracks all transfers an account has done
    //depo: select * from (BA) inner join (transfer) on BA.id=transfer.baid

    @Query(value = "Select b from BankAccount b where b.userid= ?1")
    List<BankAccount> getAccountsByUserID(long userAccID);
    
}
