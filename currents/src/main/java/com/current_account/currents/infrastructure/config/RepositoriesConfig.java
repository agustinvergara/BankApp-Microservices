package com.current_account.currents.infrastructure.config;

import com.current_account.currents.domain.ports.out.CurrentAccountsRepositoryPort;
import com.current_account.currents.infrastructure.repositories.CurrentAccountsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoriesConfig {
    /**
     * @Repository configs
     * @DESCRIPTION in this config file we find all repo beans,
     * SpringBoot get this beans and connect to Application layer
     * **/
    @Bean
    public CurrentAccountsRepositoryPort currentAccountsRepositoryPort(CurrentAccountsRepository currentAccountsRepository){
        return currentAccountsRepository;
    }
}
