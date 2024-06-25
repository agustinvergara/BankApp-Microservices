package com.saving_account.savings.Infrastructure.repositories.entity;

import com.common_entities.entities.SavingAccount;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SavingAccountEntity extends AccountEntity {
    private static final long serialVersionUID = 8681272510905497775L;
    
	private Boolean isChristmasAccount;

    //MAPPER TO DOMAIN
    public static SavingAccount entityToDomain(SavingAccountEntity savingAccountEntity){
        SavingAccount savingAccount = new SavingAccount();

        savingAccount.setId(savingAccountEntity.getId());
        savingAccount.setName(savingAccountEntity.getName());
        savingAccount.setAccountNumber(savingAccountEntity.getAccountNumber());
        savingAccount.setBalance(savingAccountEntity.getBalance());
        savingAccount.setChristmasAccount(savingAccountEntity.getIsChristmasAccount());

        return savingAccount;
    }

}
