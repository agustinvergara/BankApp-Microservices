package com.saving_account.savings.Infrastructure.Repositories.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AccountEntity implements Serializable {
    private int id;
    private String name;
    private String accountNumber;
    private Double balance;
}
