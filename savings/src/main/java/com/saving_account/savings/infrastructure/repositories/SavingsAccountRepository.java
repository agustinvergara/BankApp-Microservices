package com.saving_account.savings.Infrastructure.repositories;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.common_entities.entities.SavingAccount;
import com.saving_account.savings.Domain.ports.out.SavingsAccountsRepositoryPort;
import com.saving_account.savings.Infrastructure.repositories.entity.SavingAccountEntity;
import com.saving_account.savings.Infrastructure.repositories.rowmappers.SavingsAccountRowMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class SavingsAccountRepository implements SavingsAccountsRepositoryPort {

    @Qualifier(value = "mySqlJdbcTemplate")
    private final JdbcTemplate mySqlJdbcTemplate;

    //ROW MAPPER
    private SavingsAccountRowMapper savingsAccountRowMapper = new SavingsAccountRowMapper();

    public SavingsAccountRepository(JdbcTemplate mySqlJdbcTemplate) {
        this.mySqlJdbcTemplate = mySqlJdbcTemplate;
    }

    @Override
    public List<SavingAccount> findAllSavingAccounts() {

        List<SavingAccountEntity> accounts = mySqlJdbcTemplate.query("""
                CALL get_savings_accounts()
                """, savingsAccountRowMapper);

        log.info("DATA-SIZE: {}", accounts.size());

        return accounts.stream().map(SavingAccountEntity :: entityToDomain).collect(Collectors.toList());
    }
}
