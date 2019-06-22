package sda.java5.springclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sda.java5.springclass.config.AppConfig;
import sda.java5.springclass.service.MessageSender;

public class Runner {
    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
        //daca nu lucram cu XML, va trebui sa incarcam contextul in felul de mai jos:

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender sender = ctx.getBean(MessageSender.class);
        sender.sendMessage();
    }
}
