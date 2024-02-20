package com.justBitano.MailService.Controller;

import com.justBitano.MailService.Model.MailStructure;
import com.justBitano.MailService.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;
    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
        mailService.sendMail(mail,  mailStructure);
        return "Successfully sent the email.!";
    }
}
