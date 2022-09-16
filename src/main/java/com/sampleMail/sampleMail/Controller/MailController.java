package com.sampleMail.sampleMail.Controller;

import com.sampleMail.sampleMail.Bean.Mail;
import com.sampleMail.sampleMail.Bean.User;
import com.sampleMail.sampleMail.Service.MailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MailController {

    @Autowired
    MailServices mailServices;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Mail mail){
        return mailServices.sendMail(mail);
    }

    @GetMapping("/addUser")
    public String addUser(@RequestBody User user){
        return mailServices.addUser(user);
    }
}
