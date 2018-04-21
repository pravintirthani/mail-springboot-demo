/**
 * 
 */
package com.demo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * @author pavan.solapure
 *
 */
@Service
public class EmailService {
	
	 @Autowired
	    private JavaMailSender emailSender;

	    public boolean sendSimpleMessage(final Email mail){
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setSubject(mail.getSubject());
	        message.setText(mail.getContent());
	        message.setTo(mail.getTo());
	        message.setFrom(mail.getFrom());

	        emailSender.send(message);
	        return true;
	    }

}
