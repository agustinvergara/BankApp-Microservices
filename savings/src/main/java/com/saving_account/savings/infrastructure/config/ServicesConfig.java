package com.saving_account.savings.Infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.saving_account.savings.Application.services.SavingsAccountsService;
import com.saving_account.savings.Application.usecases.GetSavingsAccountsUseCaseImpl;
import com.saving_account.savings.Domain.ports.out.SavingsAccountsRepositoryPort;

@Configuration
public class ServicesConfig {

    @Bean
    public SavingsAccountsService savingsAccountsService(SavingsAccountsRepositoryPort savingsAccountsRepositoryPort){
        return new SavingsAccountsService(
                new GetSavingsAccountsUseCaseImpl(savingsAccountsRepositoryPort)
        );
    };

}
