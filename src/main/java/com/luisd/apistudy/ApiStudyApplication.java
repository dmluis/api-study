package com.luisd.apistudy;

import com.luisd.apistudy.models.UserModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiStudyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiStudyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserModel user = new UserModel(null, "José da Silva", "joseS", "abc123");
		UserModel user2 = new UserModel(null, "Robert Renam", "rrsscp", "roberHeartz");
	}
}
