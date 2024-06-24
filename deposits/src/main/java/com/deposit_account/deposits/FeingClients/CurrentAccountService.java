package com.deposit_account.deposits.FeingClients;

import com.deposit_account.deposits.DTO.ResponseDTO;
import com.deposit_account.deposits.Models.CurrentAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "CurrentsAccountService", url = "http://localhost:8083")
public interface CurrentAccountService {
    @GetMapping(value = "/current")
    ResponseDTO<List<CurrentAccount>> getsCurrentsAccounts();
}
