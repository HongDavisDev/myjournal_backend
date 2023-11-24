package com.hongdavis.myjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MyjournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyjournalApplication.class, args);
	}

}
