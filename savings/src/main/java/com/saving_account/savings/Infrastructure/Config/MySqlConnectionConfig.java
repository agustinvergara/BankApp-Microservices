package com.saving_account.savings.Infrastructure.Config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Slf4j
@Configuration
@EnableTransactionManagement
public class MySqlConnectionConfig {

    //PROPERTIES VALUES

    @Value("${app.datasource.db.username}")
    private String mySqlUser;
    @Value("${app.datasource.db.secret}")
    private String mySqlSecret;
    @Value("${app.datasource.db.host}")
    private String mySqlDbHost;
    @Value("${app.datasource.db.name}")
    private String mySqlName;
    @Value("${app.datasource.db.port}")
    private String mySqlDbPort;
    @Value("${app.datasource.db.driver}")
    private String mySqlDbDriver;

    //BEAN - Connection builder

    @Bean
    @ConfigurationProperties("app.datasource.db")
    public DataSource MySqlDataSource(){
        log.warn("BUILDING MYSQL CONNECTION...");

        return DataSourceBuilder.create()
                .username(mySqlUser)
                .password(mySqlSecret)
                .url("jdbc:mysql://" + mySqlDbHost + ":" + "/" + mySqlName + "?allowPublicKeyRetrieval=true&useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8")
                .driverClassName(mySqlDbDriver)
                .build();
    }

    //BEAN - JdbcTemplate
    @Bean(name = "mySqlJdbcTemplate")
    @DependsOn("MySqlDataSource")
    public JdbcTemplate mySqlJdbcTemplate(DataSource MySqlDataSource){
        return new JdbcTemplate(MySqlDataSource);
    }



}
