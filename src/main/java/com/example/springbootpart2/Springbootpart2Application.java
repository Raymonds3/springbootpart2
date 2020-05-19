package com.example.springbootpart2;

import com.example.springbootpart2.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootpart2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springbootpart2Application.class, args);
	}

	@Autowired
	private UserServiceImpl userServiceImpl;

	public void run(String... args){

		try {
			userServiceImpl.addUser(5, "Simcar", "Mahlangu"); //Prints the added user on a console
			userServiceImpl.getUser(3); //Prints a selected user name and surname on a console
			userServiceImpl.removeUser(4); //Prints a removed user name and surname on a console
		}catch (Exception e){
			e.getStackTrace();
		}
	}

}
