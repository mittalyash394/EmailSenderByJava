package com.emailSender.EmailSender.controller;

import com.emailSender.EmailSender.controller.entity.Email;
import com.emailSender.EmailSender.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private MailServiceImpl mailServiceImpl;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Email email) {
        String status = mailServiceImpl.sendSimpleMail(email);

        return status;
    }

    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody Email email) {
        String status = mailServiceImpl.sendMailWithAttachment(email);
        return status;
    }

}
