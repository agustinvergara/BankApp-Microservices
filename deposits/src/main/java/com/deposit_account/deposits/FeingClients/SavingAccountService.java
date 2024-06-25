package com.deposit_account.deposits.FeingClients;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.common_entities.entities.ResponseDTO;
import com.common_entities.entities.SavingAccount;

@FeignClient(name = "SavingAccountService", url = "http://localhost:8082")
public interface SavingAccountService {
    @GetMapping(value = "/saving")
    ResponseDTO<List<SavingAccount>> getSavingAccounts();

}
