package com.trakacc.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.trakacc.repo")
@EntityScan(basePackages="com.trakacc.entity")
public class ApplicationConfig {

}
