package com.example.demo.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.demo.domain", "com.example.demo.services", "com.example.demo.services.security"})
@EnableJpaRepositories(basePackages = {"com.example.demo.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {

}
