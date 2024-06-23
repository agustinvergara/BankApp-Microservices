package com.saving_account.savings.Infrastructure.Repositories;


import com.saving_account.savings.Domain.Models.SavingAccount;
import com.saving_account.savings.Domain.Ports.Out.SavingsAccountsRepositoryPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class SavingsAccountRepository implements SavingsAccountsRepositoryPort {

    @Qualifier(value = "mySqlJdbcTemplate")
    private final JdbcTemplate mySqlJdbcTemplate;

    public SavingsAccountRepository(JdbcTemplate mySqlJdbcTemplate) {
        this.mySqlJdbcTemplate = mySqlJdbcTemplate;
    }

    @Override
    public List<SavingAccount> findAllSavingAccounts() {
        return List.of();
    }
}
