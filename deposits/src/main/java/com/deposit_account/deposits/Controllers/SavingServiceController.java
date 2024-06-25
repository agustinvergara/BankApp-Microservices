package com.deposit_account.deposits.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common_entities.entities.ResponseDTO;
import com.common_entities.entities.SavingAccount;
import com.deposit_account.deposits.FeingClients.SavingAccountService;
import com.deposit_account.deposits.Utils.Constants;

@RestController
public class SavingServiceController {

    private final SavingAccountService savingAccountService;

    public SavingServiceController(SavingAccountService savingAccountService) {
        this.savingAccountService = savingAccountService;
    }

    @GetMapping(value = Constants.ROOT_ENDPOINT + "/saving")
    public ResponseEntity<ResponseDTO<List<SavingAccount>>> getSavingAccountsService(){

        ResponseDTO<List<SavingAccount>> service = savingAccountService.getSavingAccounts();

        return new ResponseEntity<>(service, HttpStatus.OK);
    }

}
