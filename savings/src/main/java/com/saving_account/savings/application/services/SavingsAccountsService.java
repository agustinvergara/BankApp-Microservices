package com.saving_account.savings.application.services;

import com.saving_account.savings.domain.models.SavingAccount;
import com.saving_account.savings.domain.ports.in.GetSavingsAccountsUseCase;

import java.util.List;

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
