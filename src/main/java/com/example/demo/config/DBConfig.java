package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.zaxxer.hikari.HikariDataSource;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@EnableJpaRepositories(
		
)
public class DBConfig {

	@Bean(value = "dataSource1")
	public DataSource dataSource() {
		HikariDataSource hikariDataSource = new HikariDataSource();
		return hikariDataSource;
	}
}
