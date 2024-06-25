package com.current_account.currents.domain.ports.in;


import java.util.List;

import com.common_entities.entities.CurrentAccount;

public interface GetCurrentAccountUseCases {
    List<CurrentAccount> getCurrentAccounts();
}
