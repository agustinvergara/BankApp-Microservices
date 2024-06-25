package com.current_account.currents.domain.ports.out;

import java.util.List;

import com.common_entities.entities.CurrentAccount;

public interface CurrentAccountsRepositoryPort {
    List<CurrentAccount> findAllCurrentAccounts();
}
