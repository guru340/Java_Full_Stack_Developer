package com.cfs.Admin_Register;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminRegisterApplication.class, args);
	}

}
