package com.saving_account.savings.application.usecases;

import com.saving_account.savings.domain.models.SavingAccount;
import com.saving_account.savings.domain.ports.in.GetSavingsAccountsUseCase;
import com.saving_account.savings.domain.ports.out.SavingsAccountsRepositoryPort;

import java.util.List;

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
