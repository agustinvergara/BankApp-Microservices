package com.deposit_account.deposits.Controllers;


import com.deposit_account.deposits.DTO.ResponseDTO;
import com.deposit_account.deposits.FeingClients.CurrentAccountService;
import com.deposit_account.deposits.Models.CurrentAccount;
import com.deposit_account.deposits.Utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrentServiceController {

    private final CurrentAccountService currentAccountService;

    public CurrentServiceController(CurrentAccountService currentAccountService) {
        this.currentAccountService = currentAccountService;
    }
    @GetMapping(value = Constants.ROOT_ENDPOINT + "/current")
    public ResponseEntity<ResponseDTO<List<CurrentAccount>>> getCurrentAccountsService(){

        ResponseDTO<List<CurrentAccount>> currentAccountsService = currentAccountService.getsCurrentsAccounts();

        return new ResponseEntity<>(currentAccountsService, HttpStatus.OK);
    }


}