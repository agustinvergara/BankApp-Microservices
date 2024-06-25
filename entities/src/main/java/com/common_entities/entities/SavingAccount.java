package com.common_entities.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Component
public class SavingAccount extends Account {
    private boolean isChristmasAccount;
}
