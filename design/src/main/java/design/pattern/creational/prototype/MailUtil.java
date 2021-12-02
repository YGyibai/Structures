package design.pattern.creational.prototype;


import java.text.MessageFormat;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-04 10:28
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        String content = "向{0}同学，邮箱地址：{1}，邮箱内容：{2}";
        System.out.println(MessageFormat.format(
                content, mail.getName(), mail.getEmailAddress(), mail.getContent()
        ));
    }

    public static void  saveMail(Mail mail){
        String content="邮件record：{0}";
        System.out.println(MessageFormat.format(
                content,mail.getContent()
        ));
    }
}
