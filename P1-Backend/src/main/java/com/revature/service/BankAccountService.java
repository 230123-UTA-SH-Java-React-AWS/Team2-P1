package com.revature.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.model.BankAccount;
import com.revature.repository.BankAccountRepository;

@Service
public class BankAccountService{
    private final BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository){
        this.bankAccountRepository=bankAccountRepository;
    }
    
    public List<BankAccount> getAccounts(){
        return bankAccountRepository.findAll();        
    }

    //grabs accounts by userID
    public List<BankAccount> getBankAccByUserID(Long userID){
        return bankAccountRepository.getAccountsByUserID(userID);
    }
    
    //no limitation on number of checking/saving accounts a user can own
	//need to know user's ID, initial deposit amount, and what kind of account they want
    public boolean makeAccount(BankAccount bankAccount){
        //if deposit<$25, or other fields are null, cancel account creation
        if(bankAccount.getAmount().compareTo(new BigDecimal("25"))<0||
        bankAccount.getAccType()==null){
            return false;
            // "Account creation failed, please make sure your initial "+
            // "deposit is at least $25, and you specified what account type you want.";
        }
        bankAccountRepository.save(bankAccount);
        return true;
        // "Account creation successful";
    }

    //this is to get the balance of the account
    public BigDecimal getBalance(Long userID){
        BigDecimal balance = new BigDecimal("");
        return balance;
    }

    
    
}