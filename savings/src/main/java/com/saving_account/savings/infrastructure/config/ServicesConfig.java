package com.saving_account.savings.infrastructure.config;

import com.saving_account.savings.application.services.SavingsAccountsService;
import com.saving_account.savings.application.usecases.GetSavingsAccountsUseCaseImpl;
import com.saving_account.savings.domain.ports.out.SavingsAccountsRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public SavingsAccountsService savingsAccountsService(SavingsAccountsRepositoryPort savingsAccountsRepositoryPort){
        return new SavingsAccountsService(
                new GetSavingsAccountsUseCaseImpl(savingsAccountsRepositoryPort)
        );
    };

}
