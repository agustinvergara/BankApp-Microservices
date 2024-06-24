package com.saving_account.savings.domain.ports.in;

import com.saving_account.savings.domain.models.SavingAccount;

import java.util.List;

public interface GetSavingsAccountsUseCase {
    List<SavingAccount> getSavingAccounts();
}
