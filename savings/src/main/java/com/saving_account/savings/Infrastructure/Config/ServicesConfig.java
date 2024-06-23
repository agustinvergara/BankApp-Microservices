package com.saving_account.savings.Infrastructure.Config;

import com.saving_account.savings.Application.Services.SavingsAccountsService;
import com.saving_account.savings.Application.UseCases.GetSavingsAccountsUseCaseImpl;
import com.saving_account.savings.Domain.Ports.Out.SavingsAccountsRepositoryPort;
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
