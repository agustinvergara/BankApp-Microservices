package com.saving_account.savings.Application.services;

import java.util.List;

import com.common_entities.entities.SavingAccount;
import com.saving_account.savings.Domain.ports.in.GetSavingsAccountsUseCase;

public class SavingsAccountsService implements GetSavingsAccountsUseCase {
    private final GetSavingsAccountsUseCase getSavingsAccountsUseCase;

    public SavingsAccountsService(GetSavingsAccountsUseCase getSavingsAccountsUseCase) {
        this.getSavingsAccountsUseCase = getSavingsAccountsUseCase;
    }

    @Override
    public List<SavingAccount> getSavingAccounts() {
        return getSavingsAccountsUseCase.getSavingAccounts();
    }
}
