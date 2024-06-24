package com.common_entities.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Account {
    private int id;
    private String name;
    private String accountNumber;
    private Double balance;
}
