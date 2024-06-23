package com.saving_account.savings.infrastructure.repositories.entity;

import com.saving_account.savings.domain.models.SavingAccount;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SavingAccountEntity extends AccountEntity{
    private Boolean isChristmasAccount;

    //MAPPER TO DOMAIN
    public static SavingAccount entityToDomain(SavingAccountEntity savingAccountEntity){
        SavingAccount savingAccount = new SavingAccount();

        //REMEMBER PUT ID
        //savingAccount.setId(savingAccountEntity.getId());

        savingAccount.setName(savingAccountEntity.getName());
        savingAccount.setAccountNumber(savingAccountEntity.getAccountNumber());
        savingAccount.setBalance(savingAccountEntity.getBalance());
        savingAccount.setChristmasAccount(savingAccountEntity.getIsChristmasAccount());

        return savingAccount;
    }

}
