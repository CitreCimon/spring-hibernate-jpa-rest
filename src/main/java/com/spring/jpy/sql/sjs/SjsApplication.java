package com.spring.jpy.sql.sjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.spring.jpy.sql.sjs.repository")
@SpringBootApplication
public class SjsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SjsApplication.class, args);
	}

}
