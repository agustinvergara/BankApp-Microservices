package com.current_account.currents.infrastructure.repositories;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.common_entities.entities.CurrentAccount;
import com.current_account.currents.domain.ports.out.CurrentAccountsRepositoryPort;
import com.current_account.currents.infrastructure.repositories.entity.CurrentAccountEntity;
import com.current_account.currents.infrastructure.repositories.rowmappers.CurrentAccountRowMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class CurrentAccountsRepository implements CurrentAccountsRepositoryPort {
    @Qualifier(value = "mySqlJdbcTemplate")
    private final JdbcTemplate mySqlJdbcTemplate;
    private CurrentAccountRowMapper currentAccountRowMapper = new CurrentAccountRowMapper();

    public CurrentAccountsRepository(JdbcTemplate mySqlJdbcTemplate) {
        this.mySqlJdbcTemplate = mySqlJdbcTemplate;
    }

    @Override
    public List<CurrentAccount> findAllCurrentAccounts() {

        List<CurrentAccountEntity> accounts = mySqlJdbcTemplate.query("""
                   CALL get_currents_accounts();
                """, currentAccountRowMapper);

        log.info("ejecutando store procedure");
        log.info("DATA-SIZE: {}", accounts.size());

        return accounts.stream().map(CurrentAccountEntity :: entityToDomain).collect(Collectors.toList());

    }
}
