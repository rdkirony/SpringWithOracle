package br.com.edeploy.bkofficeapi.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

//@Configuration
//@ConfigurationProperties("oracle")
public class Config {
	@Bean
	public DataSource dataSource() throws SQLException {
		PoolDataSource dataSource = PoolDataSourceFactory.getPoolDataSource();
		dataSource.setUser("bkofficetestes");
		dataSource.setPassword("bkofficetestes");
		dataSource.setConnectionFactoryClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setURL("jdbc:oracle:thin:@10.200.24.14:1521:xe");
		dataSource.setFastConnectionFailoverEnabled(true);
		dataSource.setInitialPoolSize(5);
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(10);
		return dataSource;
	}
}
