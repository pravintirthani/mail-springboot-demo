package com.demo.company;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.Email;
import com.demo.EmailService;


@Service
public class CompanyService {
	

	@Autowired
	private EmailService emailService ;
	
	
	public String findById(long id) {
//		log.info("Spring Mail - Sending Simple Email with JavaMailSender Example");

        Email mail = new Email();
        mail.setFrom("no-reply@memorynotfound.com");
        mail.setTo("pravintirthani@gmail.com");
        mail.setSubject("Sending Simple Email with JavaMailSender Example");
        mail.setContent("This tutorial demonstrates how to send a simple email using Spring Framework.");
        if(emailService.sendSimpleMessage(mail)) {
        	return "Email sent";
        }
        return "Email Not sent";	
	}
	
	
}
