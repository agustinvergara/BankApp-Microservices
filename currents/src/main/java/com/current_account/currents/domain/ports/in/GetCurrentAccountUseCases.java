package com.current_account.currents.domain.ports.in;

import com.current_account.currents.domain.models.CurrentAccount;

import java.util.List;

public interface GetCurrentAccountUseCases {
    List<CurrentAccount> getCurrentAccounts();
}
