package com.saving_account.savings.Infrastructure.Controllers;


import com.saving_account.savings.Application.Services.SavingsAccountsService;
import com.saving_account.savings.Domain.Models.SavingAccount;
import com.saving_account.savings.Infrastructure.DTO.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/deposit-account")
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
