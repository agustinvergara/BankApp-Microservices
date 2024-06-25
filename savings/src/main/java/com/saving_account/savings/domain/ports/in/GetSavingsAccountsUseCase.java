package com.saving_account.savings.Domain.ports.in;

import java.util.List;

import com.common_entities.entities.SavingAccount;

public interface GetSavingsAccountsUseCase {
    List<SavingAccount> getSavingAccounts();
}
