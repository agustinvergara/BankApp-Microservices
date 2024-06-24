package com.deposit_account.deposits.Models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class SavingAccount extends Account{ //Clase modelo saving account hija de Account
    private boolean isChristmasAccount;
}
