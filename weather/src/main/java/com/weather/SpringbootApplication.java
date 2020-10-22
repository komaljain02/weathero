package com.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {
		    DataSourceAutoConfiguration.class, 
		    DataSourceTransactionManagerAutoConfiguration.class, 
		    HibernateJpaAutoConfiguration.class})
public class SpringbootApplication extends SpringBootServletInitializer
	{
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
		{
			return application.sources(SpringbootApplication.class);
		}

		public static void main(String args[])
		{
			SpringApplication.run(SpringbootApplication.class, args);
		}
	}
