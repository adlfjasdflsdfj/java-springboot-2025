package com.hhm.spring05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		// 상속
		Dog ppoppy = new Dog();
		ppoppy.setName("뽀삐");
		ppoppy.cry();

		Cat kitty = new Cat();
		kitty.setName("키티");
		kitty.cry();	
		
		Dog chooDog = new Dog();
		choonsam.setName("키티");
		choonsam.cry();
	}
}