package com.deposit_account.deposits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DepositsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepositsApplication.class, args);
	}

}
