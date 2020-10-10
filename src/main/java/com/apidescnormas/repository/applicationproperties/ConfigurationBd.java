package com.apidescnormas.repository.applicationproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
//@Configuration
public class ConfigurationBd {
	
	@Value("${url_banco}")
	private String dataSourceUrl;
	
	@Value("${username_banco}")
	private String dataSourceUser;
	
	@Value("${password_banco}")
	private String dataSourcePassword;

}
