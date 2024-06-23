package com.saving_account.savings.Domain.Models;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Account { //Clase padre de saving account
    private int id;
    private String name;
    private String accountNumber;
    private Double balance;
}
