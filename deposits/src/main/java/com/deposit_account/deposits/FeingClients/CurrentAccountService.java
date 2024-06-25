package com.deposit_account.deposits.FeingClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.common_entities.entities.CurrentAccount;
import com.common_entities.entities.ResponseDTO;


@FeignClient(name = "CurrentsAccountService", url = "http://localhost:8083")
public interface CurrentAccountService {
    @GetMapping(value = "/current")
    ResponseDTO<List<CurrentAccount>> getsCurrentsAccounts();
}
