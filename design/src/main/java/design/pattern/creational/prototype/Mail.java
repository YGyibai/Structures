package design.pattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringJoiner;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-04 10:14
 */
public class Mail implements Cloneable{
    private final Logger LOGGER= LoggerFactory.getLogger(Mail.class);

    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        LOGGER.info("Mail Constructor");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mail.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("emailAddress='" + emailAddress + "'")
                .add("content='" + content + "'")
                .toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        LOGGER.info("mail start clone");
        return super.clone();
    }
}
