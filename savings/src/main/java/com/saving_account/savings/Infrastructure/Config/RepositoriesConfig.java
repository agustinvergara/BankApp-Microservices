package com.saving_account.savings.Infrastructure.Config;


import com.saving_account.savings.Domain.Ports.Out.SavingsAccountsRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.saving_account.savings.Infrastructure.Repositories.SavingsAccountRepository;

@Configuration
public class RepositoriesConfig {

    /**
     * @Repository configs
     * @DESCRIPTION in this config file we find all repo beans,
     * SpringBoot get this beans and connect to Application layer
     * **/
    @Bean
    public SavingsAccountsRepositoryPort savingsAccountsRepositoryPort(SavingsAccountRepository savingsAccountsRepository){
        return savingsAccountsRepository;
    }

}
