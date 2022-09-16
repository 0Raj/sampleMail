package com.sampleMail.sampleMail.Service;

import com.sampleMail.sampleMail.Bean.Mail;
import com.sampleMail.sampleMail.Bean.User;
import com.sampleMail.sampleMail.Repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MailServices {


    @Autowired
    UserDAO userDAO;

    public String sendMail(Mail mail){
        List<String> recieverMailId = mail.getReciever();
        Optional<User> optionalSender = userDAO.findById(mail.getSenderMailId());
        System.out.println(recieverMailId);

        for(String s: recieverMailId){
            Optional<User> optionalUser = userDAO.findById(s);
            User recieverMail = optionalUser.get();
            recieverMail.getInbox().add(mail);
            userDAO.save(recieverMail);
        }

        User senderMail = optionalSender.get();


        senderMail.getSent().add(mail);

       // System.out.println(recieverMail);
        System.out.println(senderMail);


        System.out.println("saved1");
        userDAO.save(senderMail);
        System.out.println("saved2");

        return "added successfully";
    }


    public String addUser(User user){

        userDAO.save(user);
        return "User Added successfully";
    }
}
