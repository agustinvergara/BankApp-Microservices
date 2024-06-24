package com.current_account.currents.domain.ports.out;

import com.current_account.currents.domain.models.CurrentAccount;

import java.util.List;

public interface CurrentAccountsRepositoryPort {
    List<CurrentAccount> findAllCurrentAccounts();
}
