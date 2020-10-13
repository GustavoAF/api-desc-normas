package com.apidescnormas.repository;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfigurations {
	
//	@Autowired
	//ConfigurationBd configurationBd;
	
	@Bean
	public DataSource dataSource(DataSourceProperties dataSourceProperties) {
		
		return DataSourceBuilder.create()
					.type(HikariDataSource.class)
					.url("jdbc:postgresql://bdnormas.c7yycir14rir.us-east-1.rds.amazonaws.com:5432/postgres")
					.username("postgres")
					.password("3f11cd32")
					.build();
		
	}

	

	
	
}
