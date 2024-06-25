package com.saving_account.savings.Domain.ports.out;


import java.util.List;

import com.common_entities.entities.SavingAccount;


public interface SavingsAccountsRepositoryPort {
    List<SavingAccount> findAllSavingAccounts();
}
