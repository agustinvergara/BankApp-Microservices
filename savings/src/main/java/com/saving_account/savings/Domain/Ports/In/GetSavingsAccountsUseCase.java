package com.saving_account.savings.Domain.Ports.In;

import com.saving_account.savings.Domain.Models.SavingAccount;

import java.util.List;

public interface GetSavingsAccountsUseCase {
    List<SavingAccount> getSavingAccounts();
}
