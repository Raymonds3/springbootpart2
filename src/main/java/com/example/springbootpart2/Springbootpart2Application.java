package com.example.springbootpart2;

import com.example.springbootpart2.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springbootpart2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootpart2Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserServiceImpl user){
		return (args) ->{
			String user0 = user.addUser(5, "Simcar", "Mahlangu");
			System.out.println("User added with addUser(5, \"Simcar\", \"Mahlangu\"):");
			System.out.println("--------------------------------");
			System.out.println(user0);
			System.out.println();

			String user1 = user.getUser(1);
			System.out.println("User found with getUser(1):");
			System.out.println("--------------------------------");
			System.out.println(user1);
			System.out.println();

			String user2 = user.removeUser(3);
			System.out.println("User deleted with remove(3):");
			System.out.println("--------------------------------");
			System.out.println(user2);
			System.out.println();
		};
	}
}
