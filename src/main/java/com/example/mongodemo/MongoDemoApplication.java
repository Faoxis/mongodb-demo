package com.example.mongodemo;

import com.example.mongodemo.domain.Application;
import com.example.mongodemo.repository.ApplicationRepository;
import com.example.mongodemo.repository.PassportRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MongoDemoApplication.class, args);

		ApplicationRepository applicationRepository
				= (ApplicationRepository) context.getBean("applicationRepository");
		PassportRepository passportRepository
				= (PassportRepository) context.getBean("passportRepository");


		passportRepository.findAll().forEach(System.out::println);


		applicationRepository.save(
				new Application()
				.setFirstName("Peter")
				.setSecondName("Petrov")
				.setMiddleName("Ivanovich")
				.setPhoneNumber("849092834")
				.setPassports(passportRepository.findAll())
		);
		applicationRepository.findAll().forEach(System.out::println);
	}
}
