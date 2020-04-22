package com.qinhao.maven.mavendemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//jerry
@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping("/send")
    public void sendMail(){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("qinxhao@126.com");
        message.setTo("qinxhao@163.com");
        message.setSubject("it is a test for spring boot");
        message.setText("你好，我是秦浩，我正在测试发送邮件。");

        try {

            mailSender.send(message);
            System.out.println("秦浩的测试邮件已发送。");

        } catch (Exception e) {

            System.out.println( e );

        }

    }

}
