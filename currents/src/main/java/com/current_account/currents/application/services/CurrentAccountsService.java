package com.current_account.currents.application.services;

import java.util.List;

import com.common_entities.entities.CurrentAccount;
import com.current_account.currents.domain.ports.in.GetCurrentAccountUseCases;

public class CurrentAccountsService implements GetCurrentAccountUseCases {
    private final GetCurrentAccountUseCases getCurrentAccountUseCases;

    public CurrentAccountsService(GetCurrentAccountUseCases getCurrentAccountUseCases) {
        this.getCurrentAccountUseCases = getCurrentAccountUseCases;
    }

    @Override
    public List<CurrentAccount> getCurrentAccounts() {
        return getCurrentAccountUseCases.getCurrentAccounts();
    }
}
