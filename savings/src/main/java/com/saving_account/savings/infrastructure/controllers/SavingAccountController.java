package com.saving_account.savings.Infrastructure.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common_entities.entities.ResponseDTO;
import com.common_entities.entities.SavingAccount;
import com.saving_account.savings.Application.services.SavingsAccountsService;

@RestController
public class SavingAccountController {

    private final SavingsAccountsService savingsAccountsService;

    public SavingAccountController(SavingsAccountsService savingsAccountsService) {
        this.savingsAccountsService = savingsAccountsService;
    }

    @GetMapping(value = "/saving")
    public ResponseEntity<ResponseDTO<List<SavingAccount>>> getsAccounts(){

        List<SavingAccount> accounts = savingsAccountsService.getSavingAccounts();

        return new ResponseEntity<>(ResponseDTO.success(accounts), HttpStatus.OK);
    }


}
