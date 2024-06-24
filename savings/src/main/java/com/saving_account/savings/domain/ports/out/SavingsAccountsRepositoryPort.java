package com.saving_account.savings.domain.ports.out;

import com.saving_account.savings.domain.models.SavingAccount;

import java.util.List;

public interface SavingsAccountsRepositoryPort {
    List<SavingAccount> findAllSavingAccounts();
}
