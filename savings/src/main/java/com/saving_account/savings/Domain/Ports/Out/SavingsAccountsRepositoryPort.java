package com.saving_account.savings.Domain.Ports.Out;

import com.saving_account.savings.Domain.Models.SavingAccount;

import java.util.List;

public interface SavingsAccountsRepositoryPort {
    List<SavingAccount> findAllSavingAccounts();
}
