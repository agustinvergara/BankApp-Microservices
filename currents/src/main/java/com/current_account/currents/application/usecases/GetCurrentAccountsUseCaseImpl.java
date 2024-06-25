package com.current_account.currents.application.usecases;

import java.util.List;

import com.common_entities.entities.CurrentAccount;
import com.current_account.currents.domain.ports.in.GetCurrentAccountUseCases;
import com.current_account.currents.domain.ports.out.CurrentAccountsRepositoryPort;

public class GetCurrentAccountsUseCaseImpl implements GetCurrentAccountUseCases {
    private final CurrentAccountsRepositoryPort currentAccountsRepositoryPort;

    public GetCurrentAccountsUseCaseImpl(CurrentAccountsRepositoryPort currentAccountsRepositoryPort){
        this.currentAccountsRepositoryPort = currentAccountsRepositoryPort;
    }

    @Override
    public List<CurrentAccount> getCurrentAccounts(){
        return currentAccountsRepositoryPort.findAllCurrentAccounts();
    }
}
