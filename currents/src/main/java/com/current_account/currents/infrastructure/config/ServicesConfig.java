package com.current_account.currents.infrastructure.config;

import com.current_account.currents.application.services.CurrentAccountsService;
import com.current_account.currents.application.usecases.GetCurrentAccountsUseCaseImpl;
import com.current_account.currents.domain.ports.out.CurrentAccountsRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public CurrentAccountsService currentAccountsService(CurrentAccountsRepositoryPort currentAccountsRepositoryPort){
        return new CurrentAccountsService(new GetCurrentAccountsUseCaseImpl(currentAccountsRepositoryPort));
    }
}
