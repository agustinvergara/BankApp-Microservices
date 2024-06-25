package com.saving_account.savings.Application.usecases;

import java.util.List;

import com.common_entities.entities.SavingAccount;
import com.saving_account.savings.Domain.ports.in.GetSavingsAccountsUseCase;
import com.saving_account.savings.Domain.ports.out.SavingsAccountsRepositoryPort;

public class GetSavingsAccountsUseCaseImpl implements GetSavingsAccountsUseCase {
    private final SavingsAccountsRepositoryPort savingsAccountsRepositoryPort; //Injectando dependencia que llama a la capa de persistencia

    public GetSavingsAccountsUseCaseImpl(SavingsAccountsRepositoryPort savingsAccountsRepositoryPort) {
        this.savingsAccountsRepositoryPort = savingsAccountsRepositoryPort;
    }

    @Override
    public List<SavingAccount> getSavingAccounts() {
        return savingsAccountsRepositoryPort.findAllSavingAccounts();
    }
}
