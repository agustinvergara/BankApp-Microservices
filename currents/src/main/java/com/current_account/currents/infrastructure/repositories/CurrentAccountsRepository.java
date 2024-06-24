package com.current_account.currents.infrastructure.repositories;


import com.current_account.currents.domain.models.CurrentAccount;
import com.current_account.currents.domain.ports.out.CurrentAccountsRepositoryPort;
import com.current_account.currents.infrastructure.repositories.entity.CurrentAccountEntity;
import com.current_account.currents.infrastructure.repositories.rowmappers.CurrentAccountRowMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Slf4j
@Repository
public class CurrentAccountsRepository implements CurrentAccountsRepositoryPort {
    @Qualifier(value = "mySqlJdbcTemplate")
    private final JdbcTemplate mySqlJdbcTemplate;

    //ROW MAPPER
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
