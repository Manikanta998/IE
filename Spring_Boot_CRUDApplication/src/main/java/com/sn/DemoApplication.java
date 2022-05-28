package com.sn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
	}

}
