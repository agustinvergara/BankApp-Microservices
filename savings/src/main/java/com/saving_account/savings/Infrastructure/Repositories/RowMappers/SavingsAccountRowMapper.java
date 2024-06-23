package com.saving_account.savings.Infrastructure.Repositories.RowMappers;

import com.saving_account.savings.Infrastructure.Repositories.Entity.SavingAccountEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SavingsAccountRowMapper implements RowMapper<SavingAccountEntity> {


    @Override
    public SavingAccountEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

        SavingAccountEntity account = new SavingAccountEntity();

        account.setName(rs.getString("account_name"));
        account.setAccountNumber(rs.getString("account_number"));
        account.setBalance(rs.getDouble("balance"));
        account.setIsChristmasAccount(rs.getBoolean("is_christmas_account"));

        return account;
    }
}
