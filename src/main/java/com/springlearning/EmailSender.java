package com.springlearning;

import com.springlearning.model.EMail;
import com.springlearning.services.MailSenderSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class EmailSender {
    @Autowired
    MailSenderSpring mailSenderSpring;

    @PostMapping("/sendmail")
    @ResponseBody
    public String sendMessage(@RequestBody EMail email) {
    	
        mailSenderSpring.sendEmailWithTemplate(email);
        
        return "send successfully";
    }

}






















//Map<String, Object> model = new HashMap<>();
//model.put("firstName", "Bibi");
//model.put("lastName", "Kedda");
//System.out.println("Model === " + model);
//EMail email = new EMail();
//email.setTo("ie18077.etu@iscae.mr");
//email.setFrom("smart.keycloak@gmail.com");
//email.setSubject("Learning how to send mail");
//email.setContent("Sending mail");
//Map<String, Object> model = new HashMap<>();
//model.put("firstName", "Bibi");
//model.put("lastName", "Kedda");
//email.setModel(model);
