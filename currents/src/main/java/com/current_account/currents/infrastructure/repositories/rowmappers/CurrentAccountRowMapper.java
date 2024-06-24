package com.current_account.currents.infrastructure.repositories.rowmappers;

import com.current_account.currents.domain.models.CurrentAccount;
import com.current_account.currents.infrastructure.repositories.entity.CurrentAccountEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrentAccountRowMapper implements RowMapper<CurrentAccountEntity>{
    @Override
    public CurrentAccountEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

        CurrentAccountEntity account = new CurrentAccountEntity();

        account.setId(rs.getInt("account_id"));
        account.setName(rs.getString("account_name"));
        account.setAccountNumber(rs.getString("account_number"));
        account.setBalance(rs.getDouble("balance"));
        account.setMoneyMarket(rs.getBoolean("is_money_market"));

        return account;
    }
}
