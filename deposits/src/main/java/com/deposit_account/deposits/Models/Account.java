package com.deposit_account.deposits.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.common.entities.*;

@Data
@NoArgsConstructor
public class Account { //Clase padre de saving account
    private int id;
    private String name;
    private String accountNumber;
    private Double balance;
}

