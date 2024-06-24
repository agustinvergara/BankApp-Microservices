package com.current_account.currents.infrastructure.repositories.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class AccountEntity {
    private int id;
    private String name;
    private String accountNumber;
    private Double balance;
}
