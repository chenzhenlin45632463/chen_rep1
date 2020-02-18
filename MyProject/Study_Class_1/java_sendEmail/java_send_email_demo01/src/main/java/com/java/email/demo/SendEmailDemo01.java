package com.java.email.demo;

import com.java.email.MailService;

public class SendEmailDemo01 {
    private static String content = "<!doctype html>\n" +
            "<html lang=\"en-US\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>华盛链盟</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<table width=\"700\" border=\"0\" align=\"center\" cellspacing=\"0\" style=\"width:700px;\">\n" +
            "    <tbody>\n" +
            "    <tr>\n" +
            "        <td>\n" +
            "            <div style=\"width:680px;padding:0 10px;margin:0 auto;\">\n" +
            "                <div style=\"line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;\">\n" +
            "                    <strong style=\"display:block;margin-bottom:15px;\">\n" +
            "                        亲爱的用户：\n" +
            "                        <span style=\"color:#f60;font-size: 16px;\"></span>您好！\n" +
            "                    </strong>\n" +
            "                    <strong style=\"display:block;margin-bottom:15px;\">\n" +
            "                        您正在绑定邮箱，请在验证码输入框中输入：\n" +
            "                        <span style=\"color:#f60;font-size: 24px\">401932</span>，以完成操作。\n" +
            "                    </strong>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </td>\n" +
            "    </tr>\n" +
            "    </tbody>\n" +
            "</table>\n" +
            "</body>\n" +
            "</html>";
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            MailService mailService = new MailService();
            mailService.sendEmail("18381121942@163.com","华盛链盟",content);
        } catch (Exception e) {
            System.out.println("发送失败");
            System.out.println("failMessage："+e.getMessage());
            System.out.println("failExc："+e.toString());
        }
        long time = System.currentTimeMillis()-start;
        System.out.println(time);
    }
}
