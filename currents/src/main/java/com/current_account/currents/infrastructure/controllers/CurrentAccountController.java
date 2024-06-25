package com.current_account.currents.infrastructure.controllers;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common_entities.entities.CurrentAccount;
import com.current_account.currents.application.services.CurrentAccountsService;
import com.current_account.currents.infrastructure.DTO.ResponseDTO;

@RestController
public class CurrentAccountController {

    private final CurrentAccountsService currentAccountsService;

    public CurrentAccountController(CurrentAccountsService currentAccountsService) {
        this.currentAccountsService = currentAccountsService;
    }

    @GetMapping(value = "/current")
    public ResponseEntity<ResponseDTO<List<CurrentAccount>>> getAccounts(){
        List<CurrentAccount> accounts = currentAccountsService.getCurrentAccounts();

        return new ResponseEntity<>(ResponseDTO.success(accounts), HttpStatus.OK);
    }
}
