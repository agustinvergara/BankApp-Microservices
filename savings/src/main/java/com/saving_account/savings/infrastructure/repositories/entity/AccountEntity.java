package com.saving_account.savings.Infrastructure.repositories.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AccountEntity implements Serializable {
    private static final long serialVersionUID = -5106166255542794211L;
    
	private int id;
    private String name;
    private String accountNumber;
    private Double balance;
}
