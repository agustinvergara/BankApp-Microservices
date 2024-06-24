package com.saving_account.savings.infrastructure.repositories;


import com.saving_account.savings.domain.models.SavingAccount;
import com.saving_account.savings.domain.ports.out.SavingsAccountsRepositoryPort;
import com.saving_account.savings.infrastructure.repositories.entity.SavingAccountEntity;
import com.saving_account.savings.infrastructure.repositories.rowmappers.SavingsAccountRowMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

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
