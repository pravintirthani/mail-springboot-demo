package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
/*
 * (scanBasePackages={"com.demo"})
 * 
 * @ComponentScan({"com.demo"})
 * 
 * @EntityScan("com.demo")
 * 
 * @EnableJpaRepositories("com.demo")
 */
public class Application implements ApplicationRunner  {

	private static Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
	private EmailService emailService ;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void run(ApplicationArguments applicationArguments) throws Exception {
//        log.info("Spring Mail - Sending Simple Email with JavaMailSender Example");
//
//        Email mail = new Email();
//        mail.setFrom("no-reply@memorynotfound.com");
//        mail.setTo("pravintirthani@gmail.com");
//        mail.setSubject("Sending Simple Email with JavaMailSender Example");
//        mail.setContent("This tutorial demonstrates how to send a simple email using Spring Framework.");
//
////        emailService.sendSimpleMessage(mail);
//    }
}
