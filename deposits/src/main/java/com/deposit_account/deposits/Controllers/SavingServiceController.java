package com.deposit_account.deposits.Controllers;

import com.deposit_account.deposits.DTO.ResponseDTO;
import com.deposit_account.deposits.FeingClients.SavingAccountService;
import com.deposit_account.deposits.Models.CurrentAccount;
import com.deposit_account.deposits.Models.SavingAccount;
import com.deposit_account.deposits.Utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
