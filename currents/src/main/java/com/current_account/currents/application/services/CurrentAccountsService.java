package com.current_account.currents.application.services;

import com.current_account.currents.domain.models.CurrentAccount;
import com.current_account.currents.domain.ports.in.GetCurrentAccountUseCases;
import java.util.List;

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
