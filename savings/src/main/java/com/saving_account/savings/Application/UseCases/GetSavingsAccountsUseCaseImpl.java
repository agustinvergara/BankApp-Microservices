package com.saving_account.savings.Application.UseCases;

import com.saving_account.savings.Domain.Models.SavingAccount;
import com.saving_account.savings.Domain.Ports.In.GetSavingsAccountsUseCase;
import com.saving_account.savings.Domain.Ports.Out.SavingsAccountsRepositoryPort;

import java.util.List;

public class GetSavingsAccountsUseCaseImpl implements GetSavingsAccountsUseCase {
    private final SavingsAccountsRepositoryPort savingsAccountsRepositoryPort; //Injectando dependencia que llama a la capa de persistencia

    public GetSavingsAccountsUseCaseImpl(SavingsAccountsRepositoryPort savingsAccountsRepositoryPort) {
        this.savingsAccountsRepositoryPort = savingsAccountsRepositoryPort;
    }

    @Override
    public List<SavingAccount> getSavingAccounts() {
        return List.of();
    }
}
