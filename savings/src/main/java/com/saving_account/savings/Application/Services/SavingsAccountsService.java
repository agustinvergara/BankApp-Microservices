package com.saving_account.savings.Application.Services;

import com.saving_account.savings.Application.UseCases.GetSavingsAccountsUseCaseImpl;
import com.saving_account.savings.Domain.Models.SavingAccount;
import com.saving_account.savings.Domain.Ports.In.GetSavingsAccountsUseCase;

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
