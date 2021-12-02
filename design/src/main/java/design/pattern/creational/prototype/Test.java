package design.pattern.creational.prototype;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-04 10:51
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail=new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i <10 ; i++) {
            Mail temp= (Mail) mail.clone();
            temp.setName("姓名"+i);
            temp.setEmailAddress("姓名"+i+"@qq.com");
            temp.setContent("恭喜！");
            MailUtil.sendMail(temp);
        }
        MailUtil.saveMail(mail);
    }
}
