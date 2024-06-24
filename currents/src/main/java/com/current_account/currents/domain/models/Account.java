package com.current_account.currents.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Account { //clase
    private int id;
    private String name;
    private String accountNumber;
    private Double balance;
}
