package com.deposit_account.deposits.FeingClients;


import com.deposit_account.deposits.DTO.ResponseDTO;
import com.deposit_account.deposits.Models.CurrentAccount;
import com.deposit_account.deposits.Models.SavingAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "SavingAccountService", url = "http://localhost:8080")
public interface SavingAccountService {
    @GetMapping(value = "/saving")
    ResponseDTO<List<SavingAccount>> getSavingAccounts();

}
