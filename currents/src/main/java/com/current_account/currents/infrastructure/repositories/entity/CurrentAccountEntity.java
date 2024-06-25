package com.current_account.currents.infrastructure.repositories.entity;


import com.common_entities.entities.CurrentAccount;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CurrentAccountEntity extends AccountEntity {
    private boolean isMoneyMarket;

    public static CurrentAccount entityToDomain(CurrentAccountEntity currentAccountEntity){
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setName(currentAccountEntity.getName());
        currentAccount.setAccountNumber(currentAccountEntity.getAccountNumber());
        currentAccount.setBalance(currentAccountEntity.getBalance());
        currentAccount.setMoneyMarket(currentAccountEntity.isMoneyMarket());

        return currentAccount;
    }
}
