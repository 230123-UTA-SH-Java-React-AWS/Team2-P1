package com.revature.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.BankAccountService;

@RestController
@RequestMapping(path = "api/v1/bankaccount")
public class BankAccountController {
    private final BankAccountService bankAccountService;
    public BankAccountController(BankAccountService bankAccountService){
        this.bankAccountService=bankAccountService;
    }
}

    @Autowired
    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
}