package com.java.email;

import javax.mail.*;
import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class MailService {
    //发邮件者邮箱地址
    private String from = "notice@zmtk.pro";
    //发邮件者邮箱密码
    private String psw = "PrRqzNoKDECB2P2n";
    //邮箱服务器地址
    private String host = "smtp.exmail.qq.com";

    /**
     * 使用加密的方式,利用465端口进行传输邮件,开启ssl
     * @param to      为收件人邮箱
     * @param message 发送的消息
     */
    public void sendEmail(String to, String subject, String message) {
        try {
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
            //设置邮件会话参数
            Properties props = new Properties();
            //邮箱的发送服务器地址
            props.setProperty("mail.smtp.host", host);
            props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.setProperty("mail.smtp.socketFactory.fallback", "false");
            //邮箱发送服务器端口,这里设置为465端口
            props.setProperty("mail.smtp.port", "465");
            props.setProperty("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.ssl.enable","true");
            final String username = from;
            final String password = psw;
            //获取到邮箱会话,利用匿名内部类的方式,将发送者邮箱用户名和密码授权给jvm
            Session session = Session.getDefaultInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication(username, password);
                }
            });
            //通过会话,得到一个邮件,用于发送
            MimeMessage msg = new MimeMessage(session);
            //设置发件人
            msg.setFrom(new InternetAddress(from));
            //设置收件人,to为收件人,cc为抄送,bcc为密送
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
            msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(to, false));
            msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(to, false));
            msg.setSubject(subject);//邮箱主题
            //设置邮件消息
            msg.setText(message);
//            msg.setContent(message,"html");
            //设置发送的日期
            msg.setSentDate(new Date());
            //设置邮件的格式（html）
            Multipart mainPart = new MimeMultipart();
            // 创建一个包含HTML内容的MimeBodyPart
            BodyPart html = new MimeBodyPart();
            // 设置HTML内容
            html.setContent(message, "text/html; charset=utf-8");
            mainPart.addBodyPart(html);
            // 将MiniMultipart对象设置为邮件内容
            msg.setContent(mainPart);
            //调用Transport的send方法去发送邮件
            Transport.send(msg);
        } catch (Exception e) {
            System.out.println("发送邮件操作失败");
            System.out.println("Ext："+e.getMessage());
        }
    }

}
