package com.spring.high.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot95TaskApplicationTests {

    @Resource
    JavaMailSenderImpl javaMailSender;

    /**
     * 发送简单邮件
     */
    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //设置发送邮件的具体内容
        message.setSubject("我是陈陈同学");
        message.setText("你好，我是陈陈同学？");
        message.setTo("18381121942@163.com");
        message.setFrom("745839505@qq.com");
        javaMailSender.send(message);
        log.info("发送邮件执行成功....");
    }

    /**
     * 发送复杂的邮件（html格式）
     */
    @Test
    public void sendEmail() throws Exception {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        //设置发送邮件的具体内容
        helper.setSubject("陈巍的来信");
        helper.setText("<b style='color:red'>我将发给你最新的文件资源</b>", true);
        helper.setTo("18381121942@163.com");
        helper.setFrom("745839505@qq.com");

        //以下文件file路径最好不要带中文，不然容易解析不出来
        helper.addAttachment("assassion.jpg", new File("D:\\java_all\\java_send_file\\20111228183329950.jpg"));
        helper.addAttachment("langkexin.jpg", new File("D:\\java_all\\java_send_file\\v2-6bdca1d849515be4acabc1845d01bef9_r.jpg"));

        javaMailSender.send(mimeMessage);
        log.info("发送复杂邮件执行成功....");

    }

}
