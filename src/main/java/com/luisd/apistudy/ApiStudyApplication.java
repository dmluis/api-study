package com.luisd.apistudy;

import com.luisd.apistudy.models.UserModel;
import com.luisd.apistudy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ApiStudyApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiStudyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserModel user = new UserModel(null, "José da Silva", "joseS", "abcRf123");
		UserModel user2 = new UserModel(null, "Robert Renam", "rrsscp", "roberHeartz");

		userRepository.saveAll(Arrays.asList(user, user2));
	}
}
